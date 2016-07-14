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
public class UniChart extends AppCompatActivity{

    private PieChart UnionChart;
    private PieData UnionData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unichart);


        LinkedList list = new LinkedList();
        ArrayList<Object> sorted_Union = new ArrayList<>();

        list.add(MainActivity.UnionWijken.Stad2);
        list.add(MainActivity.UnionWijken.Charlois2);
        list.add(MainActivity.UnionWijken.Spijkenisse2);
        list.add(MainActivity.UnionWijken.Schiedam2);
        list.add(MainActivity.UnionWijken.Zuid2);
        list.add(MainActivity.UnionWijken.Ridderkerk2);
        list.add(MainActivity.UnionWijken.Crooswijk2);
        list.add(MainActivity.UnionWijken.Maassluis2);
        list.add(MainActivity.UnionWijken.Kralingen2);
        list.add(MainActivity.UnionWijken.Capelle2);
        list.add(MainActivity.UnionWijken.Krimpen2);
        list.add(MainActivity.UnionWijken.OudeWesten2);
        list.add(MainActivity.UnionWijken.Maashaven2);
        list.add(MainActivity.UnionWijken.Hoogvliet2);
        list.add(MainActivity.UnionWijken.AlexanderZuid2);
        list.add(MainActivity.UnionWijken.Lansingerland2);
        list.add(MainActivity.UnionWijken.Hellevoetsluis2);

        Comparator cmp = Collections.reverseOrder();
        Collections.sort(list, cmp);

        for (Object number : list) {
            sorted_Union.add(number);
        }
        float pos1 = (float) sorted_Union.get(0);
        float pos2 = (float) sorted_Union.get(1);
        float pos3 = (float) sorted_Union.get(2);
        float pos4 = (float) sorted_Union.get(3);
        float pos5 = (float) sorted_Union.get(4);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(pos1,0));
        entries.add(new Entry(pos2,1));
        entries.add(new Entry(pos3,2));
        entries.add(new Entry(pos4,3));
        entries.add(new Entry(pos5,4));

        System.out.println("PRINT HIER JE ENTRIES MAAR HOOR JOA " + entries);

        PieDataSet dataSetUnion = new PieDataSet(entries,""); //HIERRRRRR
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Sciedam");
        labels.add("Spijkenisse");
        labels.add("Zuid");
        labels.add("Capelle");
        labels.add("Stad");
        System.out.println("HIERRRR STAAT JE DATA SET, DIES NIE MOOI NIE " + dataSetUnion);

        UnionData = new PieData(labels, dataSetUnion);
        System.out.println("UnionData print: " + UnionData);
        dataSetUnion.setColors(My_Colours);


        UnionChart = (PieChart) findViewById(R.id.viewunion);
        UnionChart.setData(UnionData); //set pieData into chart
        UnionChart.setDescription("Description");
        UnionChart.animateY(1500);
        UnionChart.setTouchEnabled(true);



    }


    public static final int[] My_Colours = {
            Color.rgb(180, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120),
            Color.rgb(106, 150, 134), Color.rgb(53, 210, 209), Color.rgb(255, 80, 138),
            Color.rgb(254, 50, 7), Color.rgb(254, 200, 120), Color.rgb(106, 100, 134),
            Color.rgb(106, 200, 134), Color.rgb(5, 175, 254), Color.rgb(102, 51, 0)
    };


}
