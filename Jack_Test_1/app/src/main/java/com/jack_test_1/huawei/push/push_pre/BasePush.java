package com.jack_test_1.huawei.push.push_pre;

import com.jack_test_1.huawei.BaseActivity;
import com.jack_test_1.huawei.BaseActivity;

public abstract class BasePush {
    OnPushCallBack callBack;//asynchronous interface result callback
    BaseActivity baseActivity;//provide context and output logs

    public abstract void getToken();//get token
    public abstract void addTopic(String topic);//add topic
    public abstract void deleteTopic(String topic);//delete topic
    public abstract void sendMessage(String msg);
    public interface OnPushCallBack {
        void callBack(String result);
    }

    public void setOnPushCallBack(OnPushCallBack onPushCallBack) {
        this.callBack = onPushCallBack;
    }
}
