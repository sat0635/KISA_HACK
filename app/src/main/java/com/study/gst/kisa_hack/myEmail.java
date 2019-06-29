package com.study.gst.kisa_hack;

import android.app.Application;

public class myEmail extends Application {
    private String mGlobalString;

    public String getGlobalString()
    {
        return mGlobalString;
    }

    public void setGlobalString(String globalString)
    {
        this.mGlobalString = globalString;
    }
}
