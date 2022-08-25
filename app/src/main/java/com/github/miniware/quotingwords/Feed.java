package com.github.miniware.quotingwords;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Feed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        getSupportActionBar().hide();

        Generator feed = new Generator();
        TextView tv = (TextView) findViewById(R.id.show);
        tv.setText(feed.updateStatus());

        updateImage(feed);

        findViewById(R.id.picture).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.show);
                tv.setText(feed.updateStatus());

                updateImage(feed);
            }
        });

        //Hidden?
        findViewById(R.id.watermark).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                TextView tv = (TextView) findViewById(R.id.show);
                tv.setText(Html.fromHtml("Created by <a href='https://github.com/Mini-Ware'>Mini-Ware</a><br /><br />Licensed under the <a href='https://github.com/Mini-Ware/Quoting-Words/blob/main/LICENSE'>Apache License 2.0</a><br /><br />Source Code: <a href='https://github.com/Mini-Ware/Quoting-Words'>GitHub</a>"));
                tv.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });
    }

    private void updateImage(Generator feed) {
        @DrawableRes int imgResId = feed.updateImage();
        Drawable resource = ResourcesCompat.getDrawable(getResources(), imgResId, null);
        ImageView iv = (ImageView) findViewById(R.id.picture);
        iv.setImageDrawable(resource);
    }
}