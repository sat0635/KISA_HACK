package com.study.gst.kisa_hack;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PhpTest extends AsyncTask<String,String,String> {
    @Override
    protected String doInBackground(String... params) {
        String output = "";
        try {
            //연결 url 설정
            URL url = new URL(params[0]);

            //커넥션 객체 생성
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            //연결되었으면
            if(conn != null){
                conn.setConnectTimeout(10000);
                conn.setUseCaches(false);

                //연결된 코드가 리턴되면
                if(conn.getResponseCode() == HttpURLConnection.HTTP_OK){
                    BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    int i = 0 ;
                    for(;;){
                        //웹상에 보이는 텍스트를 라인단위로 읽어 저장
                        String line = br.readLine();
                        if(line == null) {
                            System.out.println("그만! -> " + i);
                            break;
                        }
                        System.out.println("성공ㅇㅇ -> "+line);
                        i++;
                        output += line;
                    }
                    br.close();
                }
                conn.disconnect();
            }else{
                System.out.println("실패ㅡㅡ");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return output;
    }
}