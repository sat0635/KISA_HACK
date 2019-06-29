package com.study.gst.kisa_hack;

public class Form {
    private String url;
    private String place;
    private String title;
    private String content;

    public Form(String url, String place, String title, String content) {

        this.url = url;
        this.place = place;
        this.title = title;
        this.content = content;

    }

    public String getUrl() {
        return url;
    }

    public String getPlace() {
        return place;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
