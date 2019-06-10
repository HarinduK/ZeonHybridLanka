package com.example.zeonit.zeonhybridlanka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.zeonit.zeonhybridlanka.Remote.IMyAPI;
import com.example.zeonit.zeonhybridlanka.common.Common;
import com.example.zeonit.zeonhybridlanka.model.APIResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {

    EditText txtUser,txtPass;
    Button login;

    IMyAPI mService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mService= Common.getApi();

        txtUser=findViewById(R.id.userName);
        txtPass=findViewById(R.id.password);
        login=findViewById(R.id.btnlogin);

        login.setOnClickListener(onClickListener);
    }

    private View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            authenticatedUser(txtUser.getText().toString(),txtPass.getText().toString());
        }
    };

    private void authenticatedUser(String user, String password) {
        mService.loginUser(user,password)
                .enqueue(new Callback<APIResponse>() {
                    @Override
                    public void onResponse(Call<APIResponse> call, Response<APIResponse> response) {
                        APIResponse result=response.body();
                        if(result.isError()){
                            Toast.makeText(Login.this,result.getError_msg(),Toast.LENGTH_SHORT).show();
                        }else {

                            Intent intent=new Intent(Login.this,UserDetails.class);
                            intent.putExtra("details",result);
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onFailure(Call<APIResponse> call, Throwable t) {
                        Toast.makeText(Login.this,t.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
