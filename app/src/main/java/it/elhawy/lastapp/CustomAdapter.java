package it.elhawy.lastapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<designers> {

    public CustomAdapter(Context context, int textViewResourceId,
                         List<designers> objects) {
        super(context, textViewResourceId, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.fildes, null);
        TextView username = (TextView)convertView.findViewById(R.id.tvUsername);
        ImageView userImg = (ImageView) convertView.findViewById(R.id.userImg);
        RatingBar userRating = (RatingBar) convertView.findViewById(R.id.userrating);
        designers d= getItem(position);

        username.setText(d.getUsername());
        userImg.setImageResource(d.getUserimg());
        userRating.setNumStars(d.getRating());

        return convertView;
    }

}

