package com.example.tiiiiiil.lab1bai3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtname;
    private Button btnsearch;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtname = (EditText) findViewById(R.id.edtname);
        btnsearch = (Button) findViewById(R.id.btnsearch);
        intent= new Intent(this, MyService.class);
        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name= edtname.getText().toString();
                char vb='n';
                int count=0;
                for (int i=0;i<name.length();i++){
                    if(name.charAt(i)==vb){
                        count++;
                    }
                }
                Bundle bundle= new Bundle();
                bundle.putString("ten"," "+count);
                intent.putExtra("data",bundle);
                startService(intent);
            }
        });


    }
}
