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
        entries.add(new Entry(4, 0));
        entries.add(new Entry(8, 1));
        entries.add(new Entry(6, 2));
        entries.add(new Entry(2, 3));
        entries.add(new Entry(18, 4));
        entries.add(new Entry(9, 5));
        entries.add(new Entry(4, 6));
        entries.add(new Entry(8, 7));
        entries.add(new Entry(7, 8));
        entries.add(new Entry(2, 9));
        entries.add(new Entry(14, 10));
        entries.add(new Entry(9, 11));

        LineDataSet dataset = new LineDataSet(entries, "# of Calls");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("J");
        labels.add("F");
        labels.add("M");
        labels.add("A");
        labels.add("M");
        labels.add("J");
        labels.add("J");
        labels.add("A");
        labels.add("S");
        labels.add("O");
        labels.add("N");
        labels.add("D");

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



