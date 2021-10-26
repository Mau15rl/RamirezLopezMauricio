package com.example.ramrezlpezmauricio;

/**
 * @author Mauricio Ramírez López
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class SettingsAdapter extends ArrayAdapter <Settings> {

    ArrayList<Settings> ConfigurationList;

    //Constructor:
    public SettingsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Settings> objects) {
        super(context, resource, objects);
        ConfigurationList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View view = convertView;
       Settings  Accommodation = ConfigurationList.get(position);

       //view is null:
        if (view==null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.layout_list, parent, false);
        }
        ImageView image = view.findViewById(R.id.img_icon);
        image.setImageResource(Accommodation.getImage());

        TextView Title = view.findViewById(R.id.txtTitle);
        Title.setText(Accommodation.getTitle());

        TextView Description = view.findViewById(R.id.txtDescription);
        Description.setText(Accommodation.getDescription());

        return view;
    }
}
