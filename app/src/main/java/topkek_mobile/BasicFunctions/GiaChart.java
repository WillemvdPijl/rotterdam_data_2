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
public class GiaChart extends AppCompatActivity{

    private PieChart GiantChart;
    private PieData GiantData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giachart);


        LinkedList list = new LinkedList();
        ArrayList<Object> sorted_Giant = new ArrayList<>();

        list.add(MainActivity.GiantWijken.Stad2);
        list.add(MainActivity.GiantWijken.Charlois2);
        list.add(MainActivity.GiantWijken.Spijkenisse2);
        list.add(MainActivity.GiantWijken.Schiedam2);
        list.add(MainActivity.GiantWijken.Zuid2);
        list.add(MainActivity.GiantWijken.Ridderkerk2);
        list.add(MainActivity.GiantWijken.Crooswijk2);
        list.add(MainActivity.GiantWijken.Maassluis2);
        list.add(MainActivity.GiantWijken.Kralingen2);
        list.add(MainActivity.GiantWijken.Capelle2);
        list.add(MainActivity.GiantWijken.Krimpen2);
        list.add(MainActivity.GiantWijken.OudeWesten2);
        list.add(MainActivity.GiantWijken.Maashaven2);
        list.add(MainActivity.GiantWijken.Hoogvliet2);
        list.add(MainActivity.GiantWijken.AlexanderZuid2);
        list.add(MainActivity.GiantWijken.Lansingerland2);
        list.add(MainActivity.GiantWijken.Hellevoetsluis2);

        Comparator cmp = Collections.reverseOrder();
        Collections.sort(list, cmp);

        for (Object number : list) {
            sorted_Giant.add(number);
        }
        float pos1 = (float) sorted_Giant.get(0);
        float pos2 = (float) sorted_Giant.get(1);
        float pos3 = (float) sorted_Giant.get(2);
        float pos4 = (float) sorted_Giant.get(3);
        float pos5 = (float) sorted_Giant.get(4);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(pos1,0));
        entries.add(new Entry(pos2,1));
        entries.add(new Entry(pos3,2));
        entries.add(new Entry(pos4,3));
        entries.add(new Entry(pos5,4));

        System.out.println("PRINT HIER JE ENTRIES MAAR HOOR JOA " + entries);

        PieDataSet dataSetGiant = new PieDataSet(entries,""); //HIERRRRRR
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Schiedam");
        labels.add("Spijkenisse");
        labels.add("Zuid");
        labels.add("Stad");
        labels.add("Capelle");
        System.out.println("HIERRRR STAAT JE DATA SET, DIES NIE MOOI NIE " + dataSetGiant);

        GiantData = new PieData(labels, dataSetGiant);
        System.out.println("GiantData print: " + GiantData);
        dataSetGiant.setColors(My_Colours);


        GiantChart = (PieChart) findViewById(R.id.viewgiant);
        GiantChart.setData(GiantData); //set pieData into chart
        GiantChart.setDescription("Description");
        GiantChart.animateY(1500);
        GiantChart.setTouchEnabled(true);



    }


    public static final int[] My_Colours = {
            Color.rgb(180, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120),
            Color.rgb(106, 150, 134), Color.rgb(53, 210, 209), Color.rgb(255, 80, 138),
            Color.rgb(254, 50, 7), Color.rgb(254, 200, 120), Color.rgb(106, 100, 134),
            Color.rgb(106, 200, 134), Color.rgb(5, 175, 254), Color.rgb(102, 51, 0)
    };


}
