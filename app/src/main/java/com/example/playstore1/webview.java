package com.example.playstore1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class webview extends AppCompatActivity {
    WebView webView_btn;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        binding();
        String insta=getIntent().getStringExtra("n1");
        webView_btn.loadUrl(insta);
        String whatsapp=getIntent().getStringExtra("n2");
        webView_btn.loadUrl(whatsapp);
        String facebook=getIntent().getStringExtra("n3");
        webView_btn.loadUrl(facebook);
        String twitter=getIntent().getStringExtra("n4");
        webView_btn.loadUrl(twitter);
        String gmail=getIntent().getStringExtra("n5");
        webView_btn.loadUrl(gmail);
        String map=getIntent().getStringExtra("n6");
        webView_btn.loadUrl(map);
        String telegram=getIntent().getStringExtra("n7");
        webView_btn.loadUrl(telegram);
        String drive=getIntent().getStringExtra("n8");
        webView_btn.loadUrl(drive);
        String youtube=getIntent().getStringExtra("n9");
        webView_btn.loadUrl(youtube);
        String kfc=getIntent().getStringExtra("n10");
        webView_btn.loadUrl(kfc);
        String dream=getIntent().getStringExtra("n11");
        webView_btn.loadUrl(dream);
        String amazon=getIntent().getStringExtra("n12");
        webView_btn.loadUrl(amazon);
        String snap=getIntent().getStringExtra("n13");
        webView_btn.loadUrl(snap);
        String candy=getIntent().getStringExtra("n14");
        webView_btn.loadUrl(candy);
        String spotify=getIntent().getStringExtra("n15");
        webView_btn.loadUrl(spotify);
        String pinterest=getIntent().getStringExtra("n16");
        webView_btn.loadUrl(pinterest);
        String patti=getIntent().getStringExtra("n17");
        webView_btn.loadUrl(patti);
        String master=getIntent().getStringExtra("n18");
        webView_btn.loadUrl(master);
        String paytm=getIntent().getStringExtra("n19");
        webView_btn.loadUrl(paytm);
        String sudoku=getIntent().getStringExtra("n20");
        webView_btn.loadUrl(sudoku);
        String apna=getIntent().getStringExtra("n21");
        webView_btn.loadUrl(apna);
        String ludo=getIntent().getStringExtra("n22");
        webView_btn.loadUrl(ludo);
        String mx=getIntent().getStringExtra("n23");
        webView_btn.loadUrl(mx);





        webView_btn.getSettings().setJavaScriptEnabled(true);

        webView_btn.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                if(newProgress==100)
                {
                    progressBar.setVisibility(View.GONE);
                }
            }
        });


    }
    void binding()
    {
        webView_btn=findViewById(R.id.webView_btn);
        progressBar=findViewById(R.id.progressBar);
    }

}