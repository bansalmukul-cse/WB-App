package com.example.wbapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageView facebook;
        ImageView twitter;
        ImageView linkedin;
        ImageView instagram;
        ImageView tiktok;
        ImageView youtube;
        Button todayrecipies;
        Button allRecipies;
        Button newsletter;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facebook = findViewById(R.id.facebook);
        twitter= findViewById(R.id.twitter);
        linkedin= findViewById(R.id.linkedin);
        instagram = findViewById(R.id.instgram);
        tiktok = findViewById(R.id.tiktok);
        youtube = findViewById(R.id.youtube);
        todayrecipies=findViewById(R.id.todayrecipies);
        allRecipies= findViewById(R.id.allrecipies);
        newsletter=findViewById(R.id.newsletter);


        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.facebook.com/wpzoom");
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://twitter.com/wpzoom");
            }
        });
        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.linkedin.com/company/wpzoom/");
            }
        });
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.instagram.com/wpzoom/");
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/user/WPZOOM");
            }
        });
        tiktok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://tiktok.com/@linktr.ee");
            }
        });
        todayrecipies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.wpzoom.com/plugins/recipe-card-blocks/");
            }
        });

        allRecipies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.wpzoom.com/tutorials/add-recipes-to-wordpress/");
            }
        });
        newsletter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.youtube.com/channel/UC8We2IKQo4lbongz7uOn2vA");
            }
        });
    }
    private void goToUrl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
}
