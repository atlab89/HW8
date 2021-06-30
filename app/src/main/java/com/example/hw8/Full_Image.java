package com.example.hw8;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Full_Image extends AppCompatActivity {

    private ImageView Fullimg;
    int img[] = {
            R.drawable.a,
            R.drawable.b,
            R.drawable.elliot,
            R.drawable.e
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full__image);

        Fullimg =findViewById(R.id.Fullimg);
        Bundle bundle = getIntent().getExtras();

        for(int i = 0;i<=img.length;i++){
            if(bundle.getInt("int") == i){
               Fullimg.setImageResource(img[i]);
            }
        }
    }
}