package com.study.gst.kisa_hack;



import java.util.ArrayList;

public class FormData {

    ArrayList<Form> items = new ArrayList<>();

    public ArrayList<Form> getItems() {

        Form picture1 = new Form("http://155.230.91.237:26002/Gallery/picture1.png",
                "대구 중구", "김광석거리", "2019/06/12");

        Form picture2 = new Form("http://155.230.91.237:26002/Gallery/picture2.png",
                "대구 서구", "팔공산", "2019/06/13");

        Form picture3 = new Form("http://155.230.91.237:26002/Gallery/picture3.png",
                "대구 북구", "강정보", "2019/06/21");

        items.add(picture1);
        items.add(picture2);
        items.add(picture3);

        items.add(picture1);
        items.add(picture2);
        items.add(picture3);

        items.add(picture1);
        items.add(picture2);
        items.add(picture3);

        return items;
    }
}
