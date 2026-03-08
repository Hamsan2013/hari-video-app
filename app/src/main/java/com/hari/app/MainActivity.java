package com.hari.app;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

WebView webView;

@Override
protected void onCreate(Bundle savedInstanceState) {

super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);

webView = findViewById(R.id.webview);

WebSettings webSettings = webView.getSettings();

webSettings.setJavaScriptEnabled(true);
webSettings.setDomStorageEnabled(true);
webSettings.setAllowFileAccess(true);
webSettings.setMediaPlaybackRequiresUserGesture(false);
webSettings.setLoadWithOverviewMode(true);
webSettings.setUseWideViewPort(true);

webView.setWebViewClient(new WebViewClient());
webView.setWebChromeClient(new WebChromeClient());

webView.addJavascriptInterface(new WebAppInterface(this),"Android");

webView.loadUrl("https://visual-melody.lovable.app/");

}

@Override
public void onBackPressed(){

if(webView.canGoBack()){
webView.goBack();
}else{
super.onBackPressed();
}

}

}
