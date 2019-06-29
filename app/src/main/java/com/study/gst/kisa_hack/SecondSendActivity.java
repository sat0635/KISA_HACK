package com.study.gst.kisa_hack;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class SecondSendActivity extends AppCompatActivity {
    private String debtorEmail;
    private EditText money;
    private Button send_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_send);

        Intent intent = getIntent();
        debtorEmail = intent.getExtras().getString("debtorEmail");
        Log.d("TESTDE",debtorEmail);

        send_button = (Button)findViewById(R.id.SecondSendActivity_button_send);
        money = (EditText)findViewById(R.id.SecondSendActivity_edittext_money);




        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (money.getText().toString()==null){
                    return;
                }
                Intent intent = new Intent(SecondSendActivity.this, SignatureActivity.class);
                intent.putExtra("debtorEmail",debtorEmail);
                intent.putExtra("money",money.getText().toString());
                startActivity(intent);
            }
        });


    }










}
