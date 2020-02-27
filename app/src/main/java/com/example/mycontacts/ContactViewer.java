package com.example.mycontacts;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;


public class ContactViewer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);
        TextView titleDetail = (TextView)findViewById(R.id.titleDetail);
        ImageView imageDetail = (ImageView)findViewById(R.id.imageDetail);
        TextView phone = (TextView)findViewById(R.id.phone);
        TextView number = (TextView)findViewById(R.id.number);


        Bundle bundle = getIntent().getExtras();
        String title_str = bundle.getString("TITLE");
        String value_str = bundle.getString("VALUE");
        phone.setText(title_str);



        //Glide.with(this).load(getIntent().getIntExtra("@drawable/img_badminton.png", 0)).into(image);

    }
}

