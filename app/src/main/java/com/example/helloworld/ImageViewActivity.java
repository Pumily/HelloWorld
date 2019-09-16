package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView mImagev1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        mImagev1 = findViewById(R.id.iv_4);
        Glide.with(this).load("https://i0.hdslb.com/bfs/album/9fd72bfa82b1ee435fbae183407ff31cc959b04b.jpg@2000w_1e.webp").into(mImagev1);
    }
}
