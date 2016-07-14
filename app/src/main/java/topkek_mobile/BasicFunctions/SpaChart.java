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
public class SpaChart extends AppCompatActivity{

    private PieChart SpartaChart;
    private PieData SpartaData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sparchart);


        LinkedList list = new LinkedList();
        ArrayList<Object> sorted_Sparta = new ArrayList<>();

        list.add(MainActivity.SpartaWijken.Stad2);
        list.add(MainActivity.SpartaWijken.Charlois2);
        list.add(MainActivity.SpartaWijken.Spijkenisse2);
        list.add(MainActivity.SpartaWijken.Schiedam2);
        list.add(MainActivity.SpartaWijken.Zuid2);
        list.add(MainActivity.SpartaWijken.Ridderkerk2);
        list.add(MainActivity.SpartaWijken.Crooswijk2);
        list.add(MainActivity.SpartaWijken.Maassluis2);
        list.add(MainActivity.SpartaWijken.Kralingen2);
        list.add(MainActivity.SpartaWijken.Capelle2);
        list.add(MainActivity.SpartaWijken.Krimpen2);
        list.add(MainActivity.SpartaWijken.OudeWesten2);
        list.add(MainActivity.SpartaWijken.Maashaven2);
        list.add(MainActivity.SpartaWijken.Hoogvliet2);
        list.add(MainActivity.SpartaWijken.AlexanderZuid2);
        list.add(MainActivity.SpartaWijken.Lansingerland2);
        list.add(MainActivity.SpartaWijken.Hellevoetsluis2);

        Comparator cmp = Collections.reverseOrder();
        Collections.sort(list, cmp);

        for (Object number : list) {
            sorted_Sparta.add(number);
        }
        float pos1 = (float) sorted_Sparta.get(0);
        float pos2 = (float) sorted_Sparta.get(1);
        float pos3 = (float) sorted_Sparta.get(2);
        float pos4 = (float) sorted_Sparta.get(3);
        float pos5 = (float) sorted_Sparta.get(4);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(pos1,0));
        entries.add(new Entry(pos2,1));
        entries.add(new Entry(pos3,2));
        entries.add(new Entry(pos4,3));
        entries.add(new Entry(pos5,4));

        System.out.println("PRINT HIER JE ENTRIES MAAR HOOR JOA " + entries);

        PieDataSet dataSetSparta = new PieDataSet(entries,""); //HIERRRRRR
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Sciedam");
        labels.add("Lansingerland");
        labels.add("Zuid");
        labels.add("Capelle");
        labels.add("Stad");
        System.out.println("HIERRRR STAAT JE DATA SET, DIES NIE MOOI NIE " + dataSetSparta);

        SpartaData = new PieData(labels, dataSetSparta);
        System.out.println("SpartaData print: " + SpartaData);
        dataSetSparta.setColors(My_Colours);


        SpartaChart = (PieChart) findViewById(R.id.viewsparta);
        SpartaChart.setData(SpartaData); //set pieData into chart
        SpartaChart.setDescription("Description");
        SpartaChart.animateY(1500);
        SpartaChart.setTouchEnabled(true);



    }


    public static final int[] My_Colours = {
            Color.rgb(180, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120),
            Color.rgb(106, 150, 134), Color.rgb(53, 210, 209), Color.rgb(255, 80, 138),
            Color.rgb(254, 50, 7), Color.rgb(254, 200, 120), Color.rgb(106, 100, 134),
            Color.rgb(106, 200, 134), Color.rgb(5, 175, 254), Color.rgb(102, 51, 0)
    };


}
