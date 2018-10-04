package com.example.pavithrachamala.healthontips;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> arrayListobj;
    ArrayAdapter<String> arrayAdapterobj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView=findViewById(R.id.lv);
        arrayListobj=new ArrayList<String>();
        arrayListobj.add("Cold/CommonFlue");
        arrayListobj.add("Ashthma");
        arrayListobj.add("Headache");
        arrayListobj.add("Stomach Pain");
        arrayListobj.add("Motions");
        arrayListobj.add("SunStroke");
        arrayListobj.add("KneePain");
        arrayListobj.add("HairFall");
        arrayListobj.add("Vomitings");
        arrayListobj.add("SummerTips");
        arrayListobj.add("GastericProblem");
        arrayListobj.add("Reeling Sensation");
        arrayListobj.add("Menstrual Cramps");
        arrayListobj.add("Pimples");
        arrayListobj.add("Mouth Ulcers");
        arrayAdapterobj=new ArrayAdapter<String>(Main2Activity.this,android.R.layout.simple_expandable_list_item_1,arrayListobj);
        listView.setAdapter(arrayAdapterobj);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent i1=new Intent(Main2Activity.this,Main3Activity.class);
                i1.putExtra("selected",i);
                startActivity(i1);

            }
        });

    }
}
