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
public class YahChart extends AppCompatActivity{

    private PieChart YamahaChart;
    private PieData YamahaData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yahchart);


        LinkedList list = new LinkedList();
        ArrayList<Object> sorted_Yamaha = new ArrayList<>();

        list.add(MainActivity.YamahaWijken.Stad2);
        list.add(MainActivity.YamahaWijken.Charlois2);
        list.add(MainActivity.YamahaWijken.Spijkenisse2);
        list.add(MainActivity.YamahaWijken.Schiedam2);
        list.add(MainActivity.YamahaWijken.Zuid2);
        list.add(MainActivity.YamahaWijken.Ridderkerk2);
        list.add(MainActivity.YamahaWijken.Crooswijk2);
        list.add(MainActivity.YamahaWijken.Maassluis2);
        list.add(MainActivity.YamahaWijken.Kralingen2);
        list.add(MainActivity.YamahaWijken.Capelle2);
        list.add(MainActivity.YamahaWijken.Krimpen2);
        list.add(MainActivity.YamahaWijken.OudeWesten2);
        list.add(MainActivity.YamahaWijken.Maashaven2);
        list.add(MainActivity.YamahaWijken.Hoogvliet2);
        list.add(MainActivity.YamahaWijken.AlexanderZuid2);
        list.add(MainActivity.YamahaWijken.Lansingerland2);
        list.add(MainActivity.YamahaWijken.Hellevoetsluis2);

        Comparator cmp = Collections.reverseOrder();
        Collections.sort(list, cmp);

        for (Object number : list) {
            sorted_Yamaha.add(number);
        }
        float pos1 = (float) sorted_Yamaha.get(0);
        float pos2 = (float) sorted_Yamaha.get(1);
        float pos3 = (float) sorted_Yamaha.get(2);
        float pos4 = (float) sorted_Yamaha.get(3);
        float pos5 = (float) sorted_Yamaha.get(4);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(pos1,0));
        entries.add(new Entry(pos2,1));
        entries.add(new Entry(pos3,2));
        entries.add(new Entry(pos4,3));
        entries.add(new Entry(pos5,4));

        System.out.println("PRINT HIER JE ENTRIES MAAR HOOR JOA " + entries);

        PieDataSet dataSetYamaha = new PieDataSet(entries,""); //HIERRRRRR
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Sciedam");
        labels.add("Spijkenisse");
        labels.add("Hoogvliet");
        labels.add("Capelle");
        labels.add("Charlois");
        System.out.println("HIERRRR STAAT JE DATA SET, DIES NIE MOOI NIE " + dataSetYamaha);

        YamahaData = new PieData(labels, dataSetYamaha);
        System.out.println("YamahaData print: " + YamahaData);
        dataSetYamaha.setColors(My_Colours);


        YamahaChart = (PieChart) findViewById(R.id.viewyamaha);
        YamahaChart.setData(YamahaData); //set pieData into chart
        YamahaChart.setDescription("Description");
        YamahaChart.animateY(1500);
        YamahaChart.setTouchEnabled(true);



    }


    public static final int[] My_Colours = {
            Color.rgb(180, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120),
            Color.rgb(106, 150, 134), Color.rgb(53, 210, 209), Color.rgb(255, 80, 138),
            Color.rgb(254, 50, 7), Color.rgb(254, 200, 120), Color.rgb(106, 100, 134),
            Color.rgb(106, 200, 134), Color.rgb(5, 175, 254), Color.rgb(102, 51, 0)
    };


}
