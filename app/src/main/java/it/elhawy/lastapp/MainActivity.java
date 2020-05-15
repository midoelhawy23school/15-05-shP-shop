package it.elhawy.lastapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    List <ImageView> ListImges = new ArrayList<ImageView>();
    List <Integer> Recources = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Shop");
        setSupportActionBar(toolbar);

        pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
        editor = pref.edit();



        ListImges.add((ImageView) findViewById(R.id.ImgITM1));
        ListImges.add((ImageView) findViewById(R.id.ImgITM2));
        ListImges.add((ImageView) findViewById(R.id.ImgITM3));
        ListImges.add((ImageView) findViewById(R.id.ImgITM4));
        ListImges.add((ImageView) findViewById(R.id.ImgITM5));

        Recources.add(R.drawable.ui_1);
        Recources.add(R.drawable.ui_2);
        Recources.add(R.drawable.ui_3);
        Recources.add(R.drawable.ui_4);
        Recources.add(R.drawable.ui_5);

        for (int i = 0;i<ListImges.size();i++) {
            final ImageView Current = ListImges.get(i);
            final int finalI = i;
            Current.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    editor.putInt("image_preview", Recources.get(finalI));
                    editor.commit();

                    opemImgPreview();

                    //Current.setImageResource(R.drawable.ui_1);

                   // Snackbar.make(v, "Open Preview "+pref.getInt("image_preview",0), Snackbar.LENGTH_LONG).setAction("Action", null).show();
                }
            });
        }

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openCart();
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void opemImgPreview(){
        Intent intent = new Intent(this, imgPreview.class);
        startActivity(intent);
    }

    public void openCart(){
        Intent intent = new Intent(this, cart.class);
        startActivity(intent);
    }


}