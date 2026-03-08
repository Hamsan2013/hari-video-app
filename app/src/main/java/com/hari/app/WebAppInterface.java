package com.hari.app;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {

Context context;

WebAppInterface(Context ctx){
context = ctx;
}

@JavascriptInterface
public void showToast(String message){
Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
}

}
