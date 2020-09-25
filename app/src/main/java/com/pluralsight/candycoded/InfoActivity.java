package com.pluralsight.candycoded;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Uri uri = Uri.parse("android.resource://com.codeschool.candycoded/" + R.drawable.store_front);
        ImageView candyStoreImageView = (ImageView)findViewById(R.id.image_view_candy_store);
        Picasso.with(this).
                load(uri).
                into(candyStoreImageView);


    }

    @Override
    protected void onStart() {
        super.onStart();
        // ***
        // TODO - Task 2 - Launch the Google Maps Activity
        // ***
        Uri mapsUri = Uri.parse("google.streetview:cbll=46.414382,10.013988");
        Intent intent = new Intent(Intent.ACTION_VIEW,mapsUri);
        startActivity(intent);
        // ***
        // TODO - Task 3 - Launch the Phone Activity
        // ***
    }


}
