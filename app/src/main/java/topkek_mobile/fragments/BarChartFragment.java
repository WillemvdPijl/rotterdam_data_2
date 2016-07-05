package topkek_mobile.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import topkek_mobile.fragments1.Con_sql;
import topkek_mobile.BasicFunctions.MainActivity;
import topkek_mobile.fragments1.R;

import static android.text.TextUtils.isEmpty;

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

       barChart = (BarChart)view.findViewById(R.id.view);
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


        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(MainActivity.fietsWijken.getCentrum(),0));
        entries.add(new BarEntry(MainActivity.fietsWijken.getCharlois(),1));
        entries.add(new BarEntry(MainActivity.fietsWijken.getDelfshaven(),2));
        entries.add(new BarEntry(MainActivity.fietsWijken.getFeijenoord(),3));
        entries.add(new BarEntry(MainActivity.fietsWijken.getHillegersberg(),4));


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