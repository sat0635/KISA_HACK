package com.study.gst.kisa_hack;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class FirstSendActivity extends AppCompatActivity {
    private String debtorEmail;
    private EditText money;
    private Button send_button;
    private Button day;
    private  int mYear, mMonth, mDay, mHour, mMinute;
    private TextView mTxtDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_send);

        Intent intent = getIntent();
        debtorEmail = intent.getExtras().getString("debtorEmail");

        send_button = (Button)findViewById(R.id.FirstSendActivity_button_send);
        money = (EditText)findViewById(R.id.FirstSendActivity_edittext_money);
        day = (Button)findViewById(R.id.btnchangedate);
        mTxtDate = (TextView)findViewById(R.id.txtdate);


        Calendar cal = new GregorianCalendar();
        mYear = cal.get(Calendar.YEAR);
        mMonth = cal.get(Calendar.MONTH);
        mDay = cal.get(Calendar.DAY_OF_MONTH);
        mHour = cal.get(Calendar.HOUR_OF_DAY);
        mMinute = cal.get(Calendar.MINUTE);

        UpdateNow();

        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (money.getText().toString()==null){
                    return;
                }
                Intent intent = new Intent(FirstSendActivity.this, SignatureActivity.class);
                intent.putExtra("debtorEmail",debtorEmail);
                intent.putExtra("money",money.getText().toString());
                startActivity(intent);
            }
        });


    }

    public void mOnClick(View v){

        switch(v.getId()){

            //날짜 대화상자 버튼이 눌리면 대화상자를 보여줌

            case R.id.btnchangedate:

                //여기서 리스너도 등록함

                new DatePickerDialog(FirstSendActivity.this, mDateSetListener, mYear,

                        mMonth, mDay).show();

                break;


        }

    }


    DatePickerDialog.OnDateSetListener mDateSetListener =

            new DatePickerDialog.OnDateSetListener() {



                @Override

                public void onDateSet(DatePicker view, int year, int monthOfYear,

                                      int dayOfMonth) {

                    // TODO Auto-generated method stub

                    //사용자가 입력한 값을 가져온뒤

                    mYear = year;

                    mMonth = monthOfYear;

                    mDay = dayOfMonth;

                    //텍스트뷰의 값을 업데이트함

                    UpdateNow();

                }

            };


    void UpdateNow(){

        mTxtDate.setText(String.format("%d/%d/%d", mYear,

                mMonth + 1, mDay));


    }









}
