package topkek_mobile.BasicFunctions;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import topkek_mobile.fragments1.R;

/**
 * Created by Willem on 12-7-2016.
 */
public class GazChart extends AppCompatActivity{

    private PieChart GazelleChart;
    private PieData GazelleData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gazchart);


        LinkedList list = new LinkedList();
        ArrayList<Object> sorted_Gazelle = new ArrayList<>();

        list.add(MainActivity.GazelleWijken.Stad2);
        list.add(MainActivity.GazelleWijken.Charlois2);
        list.add(MainActivity.GazelleWijken.Spijkenisse2);
        list.add(MainActivity.GazelleWijken.Schiedam2);
        list.add(MainActivity.GazelleWijken.Zuid2);
        list.add(MainActivity.GazelleWijken.Ridderkerk2);
        list.add(MainActivity.GazelleWijken.Crooswijk2);
        list.add(MainActivity.GazelleWijken.Maassluis2);
        list.add(MainActivity.GazelleWijken.Kralingen2);
        list.add(MainActivity.GazelleWijken.Capelle2);
        list.add(MainActivity.GazelleWijken.Krimpen2);
        list.add(MainActivity.GazelleWijken.OudeWesten2);
        list.add(MainActivity.GazelleWijken.Maashaven2);
        list.add(MainActivity.GazelleWijken.Hoogvliet2);
        list.add(MainActivity.GazelleWijken.AlexanderZuid2);
        list.add(MainActivity.GazelleWijken.Lansingerland2);
        list.add(MainActivity.GazelleWijken.Hellevoetsluis2);

        Comparator cmp = Collections.reverseOrder();
        Collections.sort(list, cmp);

        for (Object number : list) {
            sorted_Gazelle.add(number);
        }
        float pos1 = (float) sorted_Gazelle.get(0);
        float pos2 = (float) sorted_Gazelle.get(1);
        float pos3 = (float) sorted_Gazelle.get(2);
        float pos4 = (float) sorted_Gazelle.get(3);
        float pos5 = (float) sorted_Gazelle.get(4);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(pos1,0));
        entries.add(new Entry(pos2,1));
        entries.add(new Entry(pos3,2));
        entries.add(new Entry(pos4,3));
        entries.add(new Entry(pos5,4));

        System.out.println("PRINT HIER JE ENTRIES MAAR HOOR JOA " + entries);

        PieDataSet dataSetGazelle = new PieDataSet(entries,""); //HIERRRRRR
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Schiedam");
        labels.add("Capelle");
        labels.add("Zuid");
        labels.add("Stad");
        labels.add("Lansingerland");
        System.out.println("HIERRRR STAAT JE DATA SET, DIES NIE MOOI NIE " + dataSetGazelle);

        GazelleData = new PieData(labels, dataSetGazelle);
        System.out.println("GazelleData print: " + GazelleData);
        dataSetGazelle.setColors(My_Colours);


        GazelleChart = (PieChart) findViewById(R.id.viewgazelle);
        GazelleChart.setData(GazelleData); //set pieData into chart
        GazelleChart.setDescription("Description");
        GazelleChart.animateY(1500);
        GazelleChart.setTouchEnabled(true);



    }


    public static final int[] My_Colours = {
            Color.rgb(180, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120),
            Color.rgb(106, 150, 134), Color.rgb(53, 210, 209), Color.rgb(255, 80, 138),
            Color.rgb(254, 50, 7), Color.rgb(254, 200, 120), Color.rgb(106, 100, 134),
            Color.rgb(106, 200, 134), Color.rgb(5, 175, 254), Color.rgb(102, 51, 0)
    };


}
