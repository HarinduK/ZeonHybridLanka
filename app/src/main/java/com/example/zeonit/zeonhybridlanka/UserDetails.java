package com.example.zeonit.zeonhybridlanka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zeonit.zeonhybridlanka.Remote.IMyAPI;
import com.example.zeonit.zeonhybridlanka.common.Common;
import com.example.zeonit.zeonhybridlanka.model.APIResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserDetails extends AppCompatActivity {

    TextView detailsView;
    TextView vehi;
    APIResponse result;

    IMyAPI mService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);
        mService= Common.getApi();
        result= (APIResponse) getIntent().getSerializableExtra("details");

        detailsView=findViewById(R.id.lblDetails);
        vehi=findViewById(R.id.vehicleDetails);

        setDetails();


    }

    private void setDetails() {

        String name=result.getUser().getUser();
        String address=result.getUser().getAddress();
        String email=result.getUser().getEmail();
        String mobile =result.getUser().getMobile();

        getDetailsFromServer(result.getId());
        System.out.println(result.getId());

        String txt="Name :"+name+'\n'+"Address :"+address+'\n'+"Email :"+email+'\n'+"Mobile :"+mobile;

        detailsView.setText(txt);
    }

    private void getDetailsFromServer(int id) {
        APIResponse result;
        mService.details(Integer.toString(id))
                .enqueue(new Callback<APIResponse>() {
                    @Override
                    public void onResponse(Call<APIResponse> call, Response<APIResponse> response) {
                        APIResponse result=response.body();
                        if(result.isError()){
                            Toast.makeText(UserDetails.this,result.getError_msg(),Toast.LENGTH_SHORT).show();
                        }else{
                            System.out.println("result is: "+result);

                            setVehicleDetails(result);

                        }
                    }

                    @Override
                    public void onFailure(Call<APIResponse> call, Throwable t) {
                        Toast.makeText(UserDetails.this,t.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                });

    }

    private void setVehicleDetails(APIResponse result) {
        String item=result.getDetails().getItem();
        String won=result.getDetails().getWon();
        String doc_send=result.getDetails().getDoc_send();
        String eta=result.getDetails().getEta();

        String txt="Name :"+item+'\n'+"Address :"+won+'\n'+"Email :"+doc_send+'\n'+"Mobile :"+eta;
    }
}
