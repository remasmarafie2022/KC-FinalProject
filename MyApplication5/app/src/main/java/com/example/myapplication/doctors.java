package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class doctors extends AppCompatActivity {
  ArrayList<Doc> docArrayList =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors);
        Doc doc1 = new Doc("Abdullah Fahad Al Hammadi" ,"heart section" ,R.drawable.persoooon ,R.drawable.__star5);
        Doc doc2 = new Doc("Saleh Mishaal Al-Fadhli" ,"Orthopedic department" ,R.drawable.persoooon ,R.drawable._star3);
        Doc doc3 = new Doc("Sheikha Yaqoub Dashti" ,"Ear and throat department" ,R.drawable.persoooon ,R.drawable.__star5);
        Doc doc4 = new Doc("Maryam Ali Al Husseini" ,"heart section" ,R.drawable.persoooon ,R.drawable.__star4);
        Doc doc5 = new Doc("Mohammed Suleiman Al-Sharrah" ,"Department of Internal Medicine" ,R.drawable.persoooon , R.drawable._star3);
        Doc doc6 = new Doc("Reem Dawood Marafie" ,"Ophthalmology department" ,R.drawable.persoooon ,R.drawable.__star5);


        docArrayList.add(doc1);
        docArrayList.add(doc2);
        docArrayList.add(doc3);
        docArrayList.add(doc4);
        docArrayList.add(doc5);
        docArrayList.add(doc6);


        ListView listView = findViewById(R.id.listview1);
        docAdabter dAdabter = new docAdabter(this ,0 , docArrayList);
listView.setAdapter(dAdabter);
    }
}