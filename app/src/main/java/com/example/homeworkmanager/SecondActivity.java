package com.example.homeworkmanager;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends Activity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onClick(View view){
        Intent data = new Intent();

        EditText txt_namamatkul = (EditText) findViewById(R.id.txtNama);
        EditText txt_deskripsi = (EditText) findViewById(R.id.txtDeskripsi);
        EditText txt_deadline = (EditText) findViewById(R.id.txtDeadline);

        data.putExtra("nama", txt_namamatkul.getText().toString());
        data.putExtra("deskripsi", txt_deskripsi.getText().toString());
        data.putExtra("deadline", txt_deadline.getText().toString());

        setResult(RESULT_OK,data);

        finish();
    }
}
