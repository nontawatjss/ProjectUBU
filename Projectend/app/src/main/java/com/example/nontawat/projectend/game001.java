package com.example.nontawat.projectend;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import io.github.kexanie.library.MathView;
import lecho.lib.hellocharts.listener.PieChartOnValueSelectListener;
import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;


public class game001 extends AppCompatActivity {



    PieChartView chart;
    List<SliceValue> chartlist;
    int selectQuiz,selectAns = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game001);

        //System.out.println("OS " + contactsList.size());
        chart = (PieChartView) findViewById(R.id.chartQuiz);

        PieChartData chartdata1 = new PieChartData();
        chartlist = new ArrayList<>();


        addQuizData(20,5);
        final PieChartData pieDataQuiz = new PieChartData(chartlist);
        chart.setPieChartData(pieDataQuiz);

    }


    private void addQuizData(int all,int part) {
        chartlist.clear();
        float p = 100/all;
        for (int i =0 ;i<all;i++) {

            if (i < part){
                chartlist.add(new SliceValue(p, Color.parseColor("#ccff00")));
            }else {
                chartlist.add(new SliceValue(p, Color.parseColor("#ffffff")));
            }
        }

    }


}
