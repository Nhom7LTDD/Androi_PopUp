package com.bin.baitapssssssssss;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Dialog mydialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mydialog=new Dialog(this);

    }
    public  void showpopup(View v){
        TextView txtclose;
        Button btnfollow;
        mydialog.setContentView(R.layout.pop_up);
        txtclose=(TextView) mydialog.findViewById(R.id.txtclose);
        btnfollow=(Button)  mydialog.findViewById(R.id.btnfollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mydialog.dismiss();

            }
        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();

    }
}
