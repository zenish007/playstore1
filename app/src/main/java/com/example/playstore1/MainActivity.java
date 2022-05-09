package com.example.playstore1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView insta_btn, whatsapp_btn, facebook_btn, twitter_btn,
            gmail_btn, map_btn, telegram_btn, drive_btn,
            youtube_btn,kfc_btn,dream_btn,amazon_btn,
            snap_btn,candy_btn,spotify_btn,pinterest_btn,
            patti_btn,master_btn,paytm_btn,sudoku_btn,
            apna_btn,ludo_btn,mx_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Binding();
        insta_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String insta = "https://play.google.com/store/apps/details?id=com.instagram.android";

                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n1", insta);
                startActivity(intent);
            }
        });
        whatsapp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String whatsapp = "https://play.google.com/store/apps/details?id=com.whatsapp";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n2", whatsapp);
                startActivity(intent);
            }
        });
        facebook_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String facebook = "https://play.google.com/store/apps/details?id=com.facebook.katana";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n3", facebook);
                startActivity(intent);
            }
        });
        twitter_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String twitter = "https://play.google.com/store/apps/details?id=com.twitter.android";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n4", twitter);
                startActivity(intent);
            }
        });
        gmail_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gmail = "https://play.google.com/store/apps/details?id=com.google.android.gm";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n5", gmail);
                startActivity(intent);
            }
        });
        map_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String map = "https://play.google.com/store/apps/details?id=com.google.android.apps.maps";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n6", map);
                startActivity(intent);
            }
        });
        telegram_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String telegram = "https://play.google.com/store/apps/details?id=org.telegram.messenger";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n7", telegram);
                startActivity(intent);
            }
        });
        drive_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String drive = "https://play.google.com/store/apps/details?id=com.google.android.apps.docs";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n8", drive);
                startActivity(intent);
            }
        });
        youtube_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String youtube = "https://play.google.com/store/apps/details?id=com.google.android.youtube";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n9", youtube);
                startActivity(intent);
            }
        });
        kfc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kfc ="https://play.google.com/store/apps/details?id=com.kfc.us.mobile&hl=en_IN&gl=US";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n10", kfc);
                startActivity(intent);
            }
        });
        dream_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dream ="https://play.google.com/store/apps/details?id=com.cricbuzz.android&hl=en_IN&gl=US";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n11", dream);
                startActivity(intent);
            }
        });
        amazon_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String amazon ="https://play.google.com/store/apps/details?id=com.amazon.avod.thirdpartyclient&hl=en_IN&gl=US";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n12", amazon);
                startActivity(intent);
            }
        });
        snap_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String snap ="https://play.google.com/store/apps/details?id=com.snapchat.android";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n13", snap);
                startActivity(intent);
            }
        });
        candy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String candy ="https://play.google.com/store/apps/details?id=com.king.candycrushsaga";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n14", candy);
                startActivity(intent);
            }
        });
        spotify_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String spotify ="https://play.google.com/store/apps/details?id=com.spotify.tv.android";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n15", spotify);
                startActivity(intent);
            }
        });
        pinterest_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pinterest ="https://play.google.com/store/apps/details?id=com.pinterest";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n16", pinterest);
                startActivity(intent);
            }
        });
        patti_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String patti ="https://play.google.com/store/apps/details?id=com.octro.teenpatti";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n17", patti);
                startActivity(intent);
            }
        });
        master_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String master ="https://play.google.com/store/apps/details?id=com.moonactive.coinmaster";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n18", master);
                startActivity(intent);
            }
        });
        paytm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String paytm ="https://play.google.com/store/apps/details?id=net.one97.paytm";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n19", paytm);
                startActivity(intent);
            }
        });
        sudoku_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sudoku ="https://play.google.com/store/apps/details?id=easy.sudoku.puzzle.solver.free";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n20", sudoku);
                startActivity(intent);
            }
        });
        apna_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String apna ="https://play.google.com/store/apps/details?id=com.apnatime";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n21", apna);
                startActivity(intent);
            }
        });
        ludo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ludo ="https://play.google.com/store/apps/details?id=com.ludo.king";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n22", ludo);
                startActivity(intent);

            }
        });
        mx_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mx ="https://play.google.com/store/apps/details?id=com.next.innovation.takatak";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n23", mx);
                startActivity(intent);
            }
        });
    }

    void Binding() {
        insta_btn = findViewById(R.id.insta_btn);
        whatsapp_btn = findViewById(R.id.whatsapp_btn);
        facebook_btn = findViewById(R.id.facebook_btn);
        twitter_btn = findViewById(R.id.twitter_btn);
        gmail_btn = findViewById(R.id.gmail_btn);
        map_btn = findViewById(R.id.map_btn);
        telegram_btn = findViewById(R.id.telegram_btn);
        drive_btn = findViewById(R.id.drive_btn);
        youtube_btn = findViewById(R.id.youtube_btn);
        kfc_btn = findViewById(R.id.kfc_btn);
        dream_btn = findViewById(R.id.dream_btn);
        amazon_btn = findViewById(R.id.amazon_btn);
        snap_btn = findViewById(R.id.snap_btn);
        candy_btn = findViewById(R.id.candy_btn);
        spotify_btn = findViewById(R.id.spotify_btn);
        pinterest_btn = findViewById(R.id.pinterest_btn);
        patti_btn = findViewById(R.id.patti_btn);
        master_btn = findViewById(R.id.master_btn);
        paytm_btn = findViewById(R.id.paytm_btn);
        sudoku_btn = findViewById(R.id.sudoku_btn);
        apna_btn = findViewById(R.id.apna_btn);
        ludo_btn = findViewById(R.id.ludo_btn);
        mx_btn = findViewById(R.id.mx_btn);

    }
}