package com.iantoxi.jetlagtrainer;

import android.content.Intent;

import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.WearableListenerService;

public class ListenerServiceFromMobile extends WearableListenerService{

    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onMessageReceived(MessageEvent messageEvent) {
        if (messageEvent.getPath().equals("light")) {
            Intent intent = new Intent(this, LightSensor.class);
            startActivity(intent);
        }
    }
}