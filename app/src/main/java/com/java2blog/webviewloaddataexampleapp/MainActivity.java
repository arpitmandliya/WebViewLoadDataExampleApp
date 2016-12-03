package com.java2blog.webviewloaddataexampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.java2blog.webviewloaddataexampleapp.R;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);
        String htmlData=
                "<html>\n" +
                "<head>\n" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                "<title>HelloWorld</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h3>Hello World from Java2blog!!</h3>\n" +
                "<h4> Android WebView load html data example</h4>\n"+
                "</body>\n" +
                "</html>";
        webView.loadData(htmlData, "text/html", "UTF-8");

    }

}