package com.github.miniware.quotingwords;

import android.content.res.Resources;

import androidx.annotation.DrawableRes;
import androidx.annotation.IntegerRes;
import androidx.appcompat.app.AppCompatActivity;

public class Generator extends AppCompatActivity{
    Resources res = getResources();


    private String[] quotes = res.getStringArray(R.array.quotes);

    private @DrawableRes int[] images = {
            R.drawable.tropical,
            R.drawable.bluesea,
            R.drawable.redsea,
            R.drawable.waves,
            R.drawable.dolphin,
            R.drawable.sunset,
            R.drawable.bridge,
            R.drawable.coast,
            R.drawable.shore,
            R.drawable.rocks,
            R.drawable.dock,
            R.drawable.sandy,
            R.drawable.cave
    };

    private String status = "";
    private @DrawableRes int image;
    private String recent;
    private @DrawableRes int recentImage;

    public String updateStatus(){
        this.recent = this.status;
        while (this.recent.equals(this.status)){
            this.status = this.quotes[(int)(Math.random() * this.quotes.length)];
        }
        return this.status;
    }

    @DrawableRes
    public int updateImage(){
        this.recentImage = this.image;
        while (this.recentImage == this.image){
            this.image = this.images[(int)(Math.random() * this.images.length)];
        }
        return this.image;
    }
}
