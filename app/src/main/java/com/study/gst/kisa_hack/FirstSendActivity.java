package com.study.gst.kisa_hack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstSendActivity extends AppCompatActivity {
    private String email;
    private EditText money;
    private Button send_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_send);

        Intent intent = getIntent();
        email = intent.getExtras().getString("email");

        send_button = (Button)findViewById(R.id.FirstSendActivity_button_send);
        money = (EditText)findViewById(R.id.FirstSendActivity_edittext_money);

        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (money.getText().toString()==null){
                    return;
                }
                Intent intent = new Intent(FirstSendActivity.this, SignatureActivity.class);
                intent.putExtra("email",email);
                intent.putExtra("money",money.getText().toString());
                startActivity(intent);
            }
        });




    }
}
