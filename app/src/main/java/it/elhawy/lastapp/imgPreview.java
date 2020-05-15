package it.elhawy.lastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class imgPreview extends AppCompatActivity {
    FloatingActionButton FltClosePreview;
    SharedPreferences pref;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try{
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_img_preview);
        pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        imageView = findViewById(R.id.imageView);


        imageView.setImageResource(pref.getInt("image_preview",0));



        FltClosePreview = findViewById(R.id.FltClosePreview);
        FltClosePreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }




}
