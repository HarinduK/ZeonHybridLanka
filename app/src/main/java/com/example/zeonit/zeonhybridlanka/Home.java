package com.example.zeonit.zeonhybridlanka;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class Home extends AppCompatActivity {

    Button btnQR;
    Button btnTrack;
    Button btnAuction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnQR=findViewById(R.id.btnQR);
        btnTrack=findViewById(R.id.btnTrack);
        btnAuction=findViewById(R.id.btnAuction);

        btnQR.setOnClickListener(onClickListener);
        btnAuction.setOnClickListener(onClickListener);
        btnTrack.setOnClickListener(onClickListener);

    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           switch (v.getId()){
               case R.id.btnQR:
                   Intent intent=new Intent(Home.this,Login.class);
                   startActivity(intent);
                   break;

               case R.id.btnTrack:
                    Intent  intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("http://tracking.zeonhybridlanka.lk/views/"));
                    startActivity(intent1);
                   break;

               case R.id.btnAuction:
                   Intent  intent2=new Intent(Intent.ACTION_VIEW, Uri.parse("http://auction.zeon.lk/"));
                   startActivity(intent2);
                   break;
           }
        }
    };
}
