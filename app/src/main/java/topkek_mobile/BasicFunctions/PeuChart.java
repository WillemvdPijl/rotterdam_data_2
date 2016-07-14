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
public class PeuChart extends AppCompatActivity{

    private PieChart PeugeotChart;
    private PieData PeugeotData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peuchart);


        LinkedList list = new LinkedList();
        ArrayList<Object> sorted_Peugeot = new ArrayList<>();

        list.add(MainActivity.PeugeotWijken.Stad2);
        list.add(MainActivity.PeugeotWijken.Charlois2);
        list.add(MainActivity.PeugeotWijken.Spijkenisse2);
        list.add(MainActivity.PeugeotWijken.Schiedam2);
        list.add(MainActivity.PeugeotWijken.Zuid2);
        list.add(MainActivity.PeugeotWijken.Ridderkerk2);
        list.add(MainActivity.PeugeotWijken.Crooswijk2);
        list.add(MainActivity.PeugeotWijken.Maassluis2);
        list.add(MainActivity.PeugeotWijken.Kralingen2);
        list.add(MainActivity.PeugeotWijken.Capelle2);
        list.add(MainActivity.PeugeotWijken.Krimpen2);
        list.add(MainActivity.PeugeotWijken.OudeWesten2);
        list.add(MainActivity.PeugeotWijken.Maashaven2);
        list.add(MainActivity.PeugeotWijken.Hoogvliet2);
        list.add(MainActivity.PeugeotWijken.AlexanderZuid2);
        list.add(MainActivity.PeugeotWijken.Lansingerland2);
        list.add(MainActivity.PeugeotWijken.Hellevoetsluis2);

        Comparator cmp = Collections.reverseOrder();
        Collections.sort(list, cmp);

        for (Object number : list) {
            sorted_Peugeot.add(number);
        }
        float pos1 = (float) sorted_Peugeot.get(0);
        float pos2 = (float) sorted_Peugeot.get(1);
        float pos3 = (float) sorted_Peugeot.get(2);
        float pos4 = (float) sorted_Peugeot.get(3);
        float pos5 = (float) sorted_Peugeot.get(4);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(pos1,0));
        entries.add(new Entry(pos2,1));
        entries.add(new Entry(pos3,2));
        entries.add(new Entry(pos4,3));
        entries.add(new Entry(pos5,4));

        System.out.println("PRINT HIER JE ENTRIES MAAR HOOR JOA " + entries);

        PieDataSet dataSetPeugeot = new PieDataSet(entries,""); //HIERRRRRR
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Schiedam");
        labels.add("Charlois");
        labels.add("Zuid");
        labels.add("Spijkenisse");
        labels.add("Maashaven");
        System.out.println("HIERRRR STAAT JE DATA SET, DIES NIE MOOI NIE " + dataSetPeugeot);

        PeugeotData = new PieData(labels, dataSetPeugeot);
        System.out.println("PeugeotData print: " + PeugeotData);
        dataSetPeugeot.setColors(My_Colours);


        PeugeotChart = (PieChart) findViewById(R.id.viewpeugeot);
        PeugeotChart.setData(PeugeotData); //set pieData into chart
        PeugeotChart.setDescription("Description");
        PeugeotChart.animateY(1500);
        PeugeotChart.setTouchEnabled(true);



    }


    public static final int[] My_Colours = {
            Color.rgb(180, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120),
            Color.rgb(106, 150, 134), Color.rgb(53, 210, 209), Color.rgb(255, 80, 138),
            Color.rgb(254, 50, 7), Color.rgb(254, 200, 120), Color.rgb(106, 100, 134),
            Color.rgb(106, 200, 134), Color.rgb(5, 175, 254), Color.rgb(102, 51, 0)
    };


}
