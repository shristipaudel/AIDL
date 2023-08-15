//package com.example.aidlapplication;
//
//import android.app.Service;
//import android.content.Intent;
//import android.os.IBinder;
//
//public class MyService extends Service {
//
//    @Override
//    public IBinder onBind(Intent intent) {
//        return new MyServiceImpl();
//    }
//
//
//    private class MyServiceImpl extends AidlInterface.Stub {
//        @Override
//        public int add(int a, int b) {
//            return a + b;
//        }
//
//        @Override
//        public String concatenate(String str1, String str2) {
//            return str1 + str2;
//        }
//    }
//}
