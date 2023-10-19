package com.siddiq.productdiscriptiondisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class viewscreen1 extends AppCompatActivity {

    ImageView mimage;
    TextView pname,psecfi,pdes,procost;

    Button openbuttonlink;
     WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewscreen1);



        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Enable JavaScript (optional)

        Button openWebsiteButton = findViewById(R.id.openbuttonlink);
        openWebsiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://amzn.eu/d/9A1vwee"; // Replace with your URL
                webView.loadUrl(url);
            }
        });


        mimage = findViewById(R.id.imageView);
        procost = findViewById(R.id.textView1);
        pname = findViewById(R.id.textView2);
        psecfi = findViewById(R.id.textView3);
        pdes = findViewById(R.id.textView4);
        webView = findViewById(R.id.webView);






        Intent intent = getIntent();

        String productname = intent.getStringExtra("productname");
        String productdes = intent.getStringExtra("productdes");
        String productspec = intent.getStringExtra("productspec");
        String productcost = intent.getStringExtra("productcost");
        String productid = intent.getStringExtra("productid");


        if(productid.matches("1")){
            mimage.setImageResource(R.drawable.smartwatch);
        }else if(productid.matches("2")){
            mimage.setImageResource(R.drawable.laptop);

        }
        else if(productid.matches("3")){
            mimage.setImageResource(R.drawable.iphone);
        }
        else if(productid.matches("4")){
            mimage.setImageResource(R.drawable.fridge);
        }
        else if(productid.matches("5")){
            mimage.setImageResource(R.drawable.washingmechain);
        }
        else if(productid.matches("6")){
            mimage.setImageResource(R.drawable.oppoearbuds);

        }
        procost.setText("product cost :"+productcost);
        pname.setText("product name : "+productname);
        psecfi.setText("product spec: "+productspec);
        pdes.setText("product disc :"+productdes);




    }
}