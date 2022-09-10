package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class docAdabter extends ArrayAdapter {
    List<Doc> docList;
    public docAdabter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        docList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.docter_row , parent , false);

Doc currentDocter = docList.get(position);

        TextView name = v.findViewById(R.id.textView1);
        TextView specializationName = v.findViewById(R.id.textView2);
        ImageView image = v.findViewById(R.id.imageView1);

        name.setText(currentDocter.getDocName());
        specializationName.setText(currentDocter.getSpecializationName());
        image.setImageResource(currentDocter.getDocImage());
        return v ;
    }
}
