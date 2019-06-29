package com.study.gst.kisa_hack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondReceiveActivity extends AppCompatActivity {
    private Button receive_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_receive);

        receive_button = (Button)findViewById(R.id.SecondReceiveActivity_button_receive);

        receive_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(SecondReceiveActivity.this, SignatureActivity.class);
                //intent.putExtra("debtorEmail",debtorEmail);
                //intent.putExtra("money",money.getText().toString());
                startActivity(intent);
            }
        });
    }
}
