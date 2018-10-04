package com.example.pavithrachamala.healthontips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    TextView textView;
    ArrayAdapter<String> arrayAdapter;
    ArrayList<String> arrayList;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView=findViewById(R.id.tv);
        arrayList=new ArrayList<String>();
        i=getIntent().getIntExtra("selected",0);
        switch (i){
            case 0:
                textView.setText(R.string.coldcommonflue);
                break;
            case 1:
                textView.setText(R.string.asthma);
                break;
            case 2:
                textView.setText(R.string.headache);
                break;
            case 3:
                textView.setText(R.string.stomachpain);
                break;
            case 4:
                textView.setText(R.string.motions);
                break;
            case 5:
                textView.setText(R.string.sunstroke);
                break;
            case 6:
                textView.setText(R.string.kneepain);
                break;
            case 7:
                textView.setText(R.string.hairfall);
                break;
            case 8:
                textView.setText(R.string.vomitings);
                break;
            case 9:
                textView.setText(R.string.summertips);
                break;

            case 10:
                textView.setText(R.string.gastericproblem);
                break;
            case 11:
                textView.setText(R.string.reelingsensation);
                break;
            case 12:
                textView.setText(R.string.menstrualcramps);
                break;
            case 13:
                textView.setText(R.string.pimples);
                break;
            case 14:
                textView.setText(R.string.mouthulcers);
                break;

        }
    }
}
