package it.elhawy.lastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        try{
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        ListView listView = (ListView)findViewById(R.id.ListInfo);
        List<designers> list = new LinkedList<designers>();
        list.add(new designers(R.drawable.desig_1,6,"Ahmed Hekal"));
        list.add(new designers(R.drawable.designer_2,2,"Max Blank"));
        list.add(new designers(R.drawable.designer_3,3,"Joe daramer"));
        list.add(new designers(R.drawable.designer_4,3,"knus manuk"));
        list.add(new designers(R.drawable.designer_5,4,"andrea rossi"));
        list.add(new designers(R.drawable.desig_1,2,"nardin sady"));
        CustomAdapter adapter = new CustomAdapter(this, R.layout.fildes, list);
        listView.setAdapter(adapter);




    }





    public void showToast(String msg){

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
