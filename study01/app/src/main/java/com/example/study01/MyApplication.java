package com.example.study01;

import android.app.Application;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

public class MyApplication extends Application {


    public static AIUITest am;

    @Override
    public void onCreate() {
        initializeIflytek();

        am = new AIUITest(MyApplication.this);
        super.onCreate();




    }

    private void initializeIflytek()
    {
        StringBuffer param = new StringBuffer();
        //IflytekAPP_id为我们申请的Appid
        param.append("appid="+getString(R.string.IflytekAPP_id));
        param.append(",");
        // 设置使用v5+
        param.append(SpeechConstant.ENGINE_MODE+"="+ SpeechConstant.MODE_MSC);
        SpeechUtility.createUtility(MyApplication.this, param.toString());
    }




}
