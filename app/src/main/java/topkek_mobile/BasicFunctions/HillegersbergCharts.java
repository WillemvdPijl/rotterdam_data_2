package topkek_mobile.BasicFunctions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.util.ArrayList;

import topkek_mobile.fragments1.R;

/**
 * Created by Anthony on 6-7-2016.
 */
public class HillegersbergCharts extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hillegersberg);
        BarChart chart = (BarChart) findViewById(R.id.uschart);

        BarData data = new BarData(getXAxisValues(), getDataSet());
        chart.setData(data);
        chart.setDescription("My Chart");
        chart.animateXY(2000, 2000);
        chart.invalidate();
    }

    private ArrayList<IBarDataSet> getDataSet() {

        ArrayList<IBarDataSet> dataSets = null;
        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
        ArrayList<BarEntry> valueSet2 = new ArrayList<>();

        BarEntry v1e1 = new BarEntry(10.000f, 0); // Jan
        valueSet1.add(v1e1);
        BarEntry v1e2 = new BarEntry(3.000f, 1); // Feb
        valueSet1.add(v1e2);
        BarEntry v1e3 = new BarEntry(4.000f, 2); // Mar
        valueSet1.add(v1e3);
        BarEntry v1e4 = new BarEntry(6.000f, 3); // Apr
        valueSet1.add(v1e4);
        BarEntry v1e5 = new BarEntry(8.000f, 4); // May
        valueSet1.add(v1e5);
        BarEntry v1e6 = new BarEntry(1.000f, 5); // Jun
        valueSet1.add(v1e6);

        BarEntry v2e1 = new BarEntry(175.000f, 0); // Jan
        valueSet2.add(v2e1);
        BarEntry v2e2 = new BarEntry(85.000f, 1); // Feb
        valueSet2.add(v2e2);
        BarEntry v2e3 = new BarEntry(100.000f, 2); // Mar
        valueSet2.add(v2e3);
        BarEntry v2e4 = new BarEntry(75.000f, 3); // Apr
        valueSet2.add(v2e4);
        BarEntry v2e5 = new BarEntry(30.000f, 4); // May
        valueSet2.add(v2e5);
        BarEntry v2e6 = new BarEntry(70.000f, 5); // Jun
        valueSet2.add(v2e6);

        IBarDataSet barDataSet1 = new BarDataSet(valueSet1, "Brand 1");
        //barDataSet1.setColor(Color.rgb(0, 155, 0));
        IBarDataSet barDataSet2 = new BarDataSet(valueSet2, "Brand 2");
        //barDataSet2.setColors(ColorTemplate.COLORFUL_COLORS);

        dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        dataSets.add(barDataSet2);
        return dataSets;
    }

    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("JAN");
        xAxis.add("FEB");
        xAxis.add("MAR");
        xAxis.add("APR");
        xAxis.add("MAY");
        xAxis.add("JUN");
        return xAxis;
    }
}