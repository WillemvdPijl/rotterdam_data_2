package topkek_mobile.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

import topkek_mobile.BasicFunctions.MainActivity;
import topkek_mobile.fragments1.R;


public class LineChartFragment extends Fragment{

    private LineChart lineChart;
    private LineData data;

    public LineChartFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_linechart, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        lineChart = (LineChart)view.findViewById(R.id.view2);
        lineChart.setDrawGridBackground(false);
        lineChart.setData(data);
        lineChart.animateY(2500);
        lineChart.setDescription("");
        Legend legend = lineChart.getLegend();
        legend.setPosition(Legend.LegendPosition.BELOW_CHART_CENTER);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(MainActivity.diefstalMaanden.Januari,0));
        entries.add(new Entry(MainActivity.diefstalMaanden.Februari,1));
        entries.add(new Entry(MainActivity.diefstalMaanden.Maart,2));
        entries.add(new Entry(MainActivity.diefstalMaanden.April,3));
        entries.add(new Entry(MainActivity.diefstalMaanden.Mei,4));
        entries.add(new Entry(MainActivity.diefstalMaanden.Juni,5));
        entries.add(new Entry(MainActivity.diefstalMaanden.Juli,6));
        entries.add(new Entry(MainActivity.diefstalMaanden.Augustus,7));
        entries.add(new Entry(MainActivity.diefstalMaanden.September,8));
        entries.add(new Entry(MainActivity.diefstalMaanden.Oktober,9));
        entries.add(new Entry(MainActivity.diefstalMaanden.November,10));
        entries.add(new Entry(MainActivity.diefstalMaanden.December,11));


        LineDataSet dataset = new LineDataSet(entries, "# of Calls");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("januari");
        labels.add("februari");
        labels.add("maart");
        labels.add("april");
        labels.add("mei");
        labels.add("juni");
        labels.add("juli");
        labels.add("augustus");
        labels.add("september");
        labels.add("oktober");
        labels.add("november");
        labels.add("december");

        data = new LineData(labels, dataset);
        dataset.setColor(Color.WHITE);
        dataset.setFillColor(Color.LTGRAY);
        dataset.setValueTextColor(Color.WHITE);
        dataset.setHighLightColor(Color.YELLOW);
        dataset.setCircleColor(Color.YELLOW);
        dataset.setDrawCubic(false);
        dataset.setDrawFilled(true);

    }

}