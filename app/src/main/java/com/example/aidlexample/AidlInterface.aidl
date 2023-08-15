// AidlInterface.aidl
package com.example.aidlexample;

// Declare any non-default types here with import statements

interface AidlInterface {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
//    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
//            double aDouble, String aString);

     int add(int a, int b);
        String concatenate(String str1, String str2);
}
