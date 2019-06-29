package com.study.gst.kisa_hack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class FirstReceiveActivity extends AppCompatActivity {
    private ListView listView;
    private String url;

    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first_receive);

        listView = (ListView)this.findViewById(R.id.listView);

        Intent intent = getIntent();
        url = intent.getExtras().getString("image");

        ArrayList<String> items = new ArrayList<>();

        items.add("김광석거리");

        //이미지
        CustomAdapter adapter = new CustomAdapter(this, 0, items);
        listView.setAdapter(adapter);






    }

    private class CustomAdapter extends ArrayAdapter<String> {
        private ArrayList<String> items;

        public CustomAdapter(Context context, int textViewResourceId, ArrayList<String> objects) {
            super(context, textViewResourceId, objects);
            this.items = objects;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            View v = convertView;
            if (v == null) {
                LayoutInflater vi = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                v = vi.inflate(R.layout.item_list, null);
            }

            // ImageView 인스턴스
            ImageView imageView = (ImageView)v.findViewById(R.id.imageView);
            Button button = (Button)v.findViewById(R.id.button);
            // 리스트뷰의 아이템에 이미지를 변경한다.
            if("김광석거리".equals(items.get(position))){
                Glide.with(FirstReceiveActivity.this).load( url)
                        .apply(new RequestOptions().circleCrop())
                        .into(imageView);
            }
            TextView textView = (TextView)v.findViewById(R.id.textView);
            textView.setText(items.get(position));

            final String text = items.get(position);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(FirstReceiveActivity.this,FirstReceiveActivity.class));
                }
            });

            return v;
        }
    }
}
