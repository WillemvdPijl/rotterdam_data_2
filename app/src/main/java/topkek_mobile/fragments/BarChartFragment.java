package topkek_mobile.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

//import topkek_mobile.fragments1.Con_sql;
import topkek_mobile.BasicFunctions.MainActivity;
import topkek_mobile.fragments1.R;

/**
 * Created by Willem on 28-6-2016.
 */
public class BarChartFragment extends Fragment {
    private BarData data;
    private BarChart barChart;


    public BarChartFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_barchart, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        barChart = (BarChart) view.findViewById(R.id.view);
        barChart.setDrawGridBackground(false);
        barChart.setData(data);
        barChart.animateY(2500);
        barChart.setDescription("");
        Legend legend = barChart.getLegend();
        legend.setPosition(Legend.LegendPosition.BELOW_CHART_CENTER);

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        LinkedList list = new LinkedList();
        ArrayList<Object> sorted_array = new ArrayList<>();
        list.add(MainActivity.fietsWijken.Centrum);
        list.add(MainActivity.fietsWijken.Charlois);
        list.add(MainActivity.fietsWijken.Delfshaven);
        list.add(MainActivity.fietsWijken.Feijenoord);
        list.add(MainActivity.fietsWijken.Noord);
        list.add(MainActivity.fietsWijken.Hillegersberg);
        list.add(MainActivity.fietsWijken.Overschie);
        list.add(MainActivity.fietsWijken.Crooswijk);
        Comparator cmp = Collections.reverseOrder();
        Collections.sort(list, cmp);
        // let us print all the elements available in list
//        Collections.sort(list, cmp);
//        Arrays.sort(fArr, comparator.reversed());
//



        for (Object number : list) {
            sorted_array.add(number);
        }
        float pos1 = (float) sorted_array.get(0);
        float pos2 = (float) sorted_array.get(1);
        float pos3 = (float) sorted_array.get(2);
        float pos4 = (float) sorted_array.get(3);
        float pos5 = (float) sorted_array.get(4);

//            entries.add(new BarEntry(Float.parseFloat(number.toString()), 0));
//            entries.add(new BarEntry(Float.parseFloat(number.toString()), 1));
//            entries.add(new BarEntry(Float.parseFloat(number.toString()), 2));
//            entries.add(new BarEntry(Float.parseFloat(number.toString()), 3));
//            entries.add(new BarEntry(Float.parseFloat(number.toString()), 4));

        ;
//        }
//        for(Object i : sorted_array){
//            System.out.println(i);
//        }

        ;


        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(pos1,0));
        entries.add(new BarEntry(pos2,1));
        entries.add(new BarEntry(pos3, 2));
        entries.add(new BarEntry(pos4, 3));
        entries.add(new BarEntry(pos5, 4));


//        System.out.println(MainActivity.fietsTrommels.getIJsselmonde());
//        entries.add(new Entry(18, 4));
//        entries.add(new BarEntry(9, 5));
//        entries.add(new BarEntry(4, 6));
//        entries.add(new BarEntry(8, 7));
//        entries.add(new BarEntry(7, 8));
//        entries.add(new BarEntry(2, 9));
//        entries.add(new BarEntry(14, 10));
////        entries.add(new Entry(9, 11));


        BarDataSet dataset = new BarDataSet(entries, "TEST");
        ArrayList<IBarDataSet> dataset1 = new ArrayList<>();
        dataset1.add(dataset);
//        dataset1.add(dataset);


        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Centrum");
        labels.add("Charlois");
        labels.add("Delfshaven");
        labels.add("A");
        labels.add("M");
//        labels.add("J");
//        labels.add("J");
//        labels.add("A");
//        labels.add("S");
//        labels.add("O");
//        labels.add("N");
//        labels.add("D");

        data = new BarData(labels, dataset1);
        dataset.setColor(Color.RED);
//        dataset.setFillColor(Color.LTGRAY);
        dataset.setValueTextColor(Color.RED);
        dataset.setHighLightColor(Color.YELLOW);
//        dataset.setCircleColor(Color.YELLOW);
//        dataset.setDrawCubic(false);
//        dataset.setDrawFilled(true);

    }

}