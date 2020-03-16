package com.ib.demolib2;

import android.content.Context;
import android.widget.Toast;

public class ToastMsg {
    public static void s(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
