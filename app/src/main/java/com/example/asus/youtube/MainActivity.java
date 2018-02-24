package com.example.asus.youtube;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create an ArrayList of AndroidFlavor objects
        ArrayList<youtube> youtubeproject = new ArrayList<youtube>();
        youtubeproject.add(new youtube("جافا سكريبت فى 48 دقيقة-مدخل شامل إلى مفاهيم اللغة", "Nour Hosni قبل سنة واحدة...", R.drawable.javax));
        youtubeproject.add(new youtube("مقدمة:ماهى لغة جافا سكريبت", "TheNewBaghdad قبل سنة واحدة... ", R.drawable.javay));
        youtubeproject.add(new youtube("JavaScript for beginners  اساسيات الجافا...", "TheNewBaghdad  مقطع فيديو 24", R.drawable.javaz));
        youtubeproject.add(new youtube("دورة JavaScript", "Hamed Oumoumeen  مقطع فيديو 26 ", R.drawable.javao));
        youtubeproject.add(new youtube("JavaScript Tutorial for Beginner Complete...", "Awais Mirza قبل 11 شهراً", R.drawable.javap));
        youtubeproject.add(new youtube("Anjana Vakil:Learning Functional...", "JSConf قبل سنة واحدة...", R.drawable.javascriptx));
        youtubeproject.add(new youtube("JavaScript تعلم جافا سكريبت", "Hassouna Academy مقطع فيديو 32", R.drawable.javascripty));
        youtubeproject.add(new youtube("Programowanie w JavaScript od podstaw...", "Samuraj ... مقطع فيديو 18", R.drawable.javascriptz));
        youtubeproject.add(new youtube("JavaScript Tutorial", "KudvenKat  مقطع فيديو 27", R.drawable.javascripto));
        youtubeproject.add(new youtube("JavaScript in Half an Hour(Without jQuery!) ", "LearnWebCode قبل سنة واحدة...", R.drawable.javascriptp));

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        Youtubeadapter youtubeAdapter = new Youtubeadapter(this, youtubeproject);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_youtube);
        listView.setAdapter(youtubeAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    Intent intent = new Intent(MainActivity.this,VideoActivity.class);
                    intent.putExtra("url","https://www.youtube.com/watch?v=1l_8nECYRvQ");
                    startActivity(intent);
                }else if (i==1){
                    Intent intent = new Intent(MainActivity.this,VideoActivity.class);
                    intent.putExtra("url","https://www.youtube.com/watch?v=TgB6RXP6QI0");
                    startActivity(intent);
                }
                else if (i==2){
                    Intent intent = new Intent(MainActivity.this,VideoActivity.class);
                    intent.putExtra("url","https://www.youtube.com/watch?v=TgB6RXP6QI0&list=PLF8OvnCBlEY0fv5T2yTMroCAjKEcWV770");
                    startActivity(intent);
                }else if (i==3){
                    Intent intent = new Intent(MainActivity.this,VideoActivity.class);
                    intent.putExtra("url","https://www.youtube.com/watch?v=tTgD9m1p5Ss&list=PLT56sSeAKiIvfQhsA2lXUUmjfh0JyEFU7");
                    startActivity(intent);
                }else if (i==4){
                    Intent intent = new Intent(MainActivity.this,VideoActivity.class);
                    intent.putExtra("url","https://www.youtube.com/watch?v=PwsigsH4oXw");
                    startActivity(intent);
                }else if (i==5){
                    Intent intent = new Intent(MainActivity.this,VideoActivity.class);
                    intent.putExtra("url","https://www.youtube.com/watch?v=e-5obm1G_FY");
                    startActivity(intent);
                }else if (i==6){
                    Intent intent = new Intent(MainActivity.this,VideoActivity.class);
                    intent.putExtra("url","https://www.youtube.com/watch?v=lcEj0WH5xvQ&list=PLHIfW1KZRIfmiYYwt29BG7N9zzsd-jLRQ");
                    startActivity(intent);
                }else if (i==7){
                    Intent intent = new Intent(MainActivity.this,VideoActivity.class);
                    intent.putExtra("url","https://www.youtube.com/watch?v=JFDScHg6Dws&list=PLTs20Q-BTEMPRSzhrlAuu7yus1BuOLVrS");
                    startActivity(intent);
                }else if (i==8){
                    Intent intent = new Intent(MainActivity.this,VideoActivity.class);
                    intent.putExtra("url","https://www.youtube.com/watch?v=fju9ii8YsGs");
                    startActivity(intent);
                }else if (i==9){
                    Intent intent = new Intent(MainActivity.this,VideoActivity.class);
                    intent.putExtra("url","https://www.youtube.com/watch?v=zPHerhks2Vg");
                    startActivity(intent);
                }
            }
        });
        }
    }

