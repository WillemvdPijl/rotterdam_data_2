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
 * Created by Willem on 6-7-2016.
 */
public class CharloisChart extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charloischarts);
        BarChart chart = (BarChart) findViewById(R.id.uschart1);

        BarData data = new BarData(getXAxisValues(), getDataSet());
        chart.setData(data);
        chart.setDescription("My Chart2");
        chart.animateXY(2000, 2000);
        chart.invalidate();
    }

    private ArrayList<IBarDataSet> getDataSet() {
        ArrayList<IBarDataSet> dataSets = null;

        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
        BarEntry v1e1 = new BarEntry(5.000f, 0); // Jan
        valueSet1.add(v1e1);
        BarEntry v1e2 = new BarEntry(6.000f, 1); // Feb
        valueSet1.add(v1e2);
        BarEntry v1e3 = new BarEntry(7.000f, 2); // Mar
        valueSet1.add(v1e3);
        BarEntry v1e4 = new BarEntry(8.000f, 3); // Apr
        valueSet1.add(v1e4);
        BarEntry v1e5 = new BarEntry(9.000f, 4); // May
        valueSet1.add(v1e5);
        BarEntry v1e6 = new BarEntry(10.000f, 5); // Jun
        valueSet1.add(v1e6);
        BarEntry v1e7 = new BarEntry(11.000f,6); // jul
        valueSet1.add(v1e7);
        BarEntry v1e8 = new BarEntry(120.000f,7); // aug
        valueSet1.add(v1e8);
        BarEntry v1e9 = new BarEntry(13.000f,8); // sep
        valueSet1.add(v1e9);
        BarEntry v1e10 = new BarEntry(14.000f,9); // okt
        valueSet1.add(v1e10);
        BarEntry v1e11 = new BarEntry(150.000f,10); // nov
        valueSet1.add(v1e11);
        BarEntry v1e12 = new BarEntry(16.000f,11); // dec
        valueSet1.add(v1e12);


        ArrayList<BarEntry> valueSet2 = new ArrayList<>();
        BarEntry v2e1 = new BarEntry(50.000f, 0); // Jan
        valueSet2.add(v2e1);
        BarEntry v2e2 = new BarEntry(60.000f, 1); // Feb
        valueSet2.add(v2e2);
        BarEntry v2e3 = new BarEntry(70.000f, 2); // Mar
        valueSet2.add(v2e3);
        BarEntry v2e4 = new BarEntry(80.000f, 3); // Apr
        valueSet2.add(v2e4);
        BarEntry v2e5 = new BarEntry(90.000f, 4); // May
        valueSet2.add(v2e5);
        BarEntry v2e6 = new BarEntry(10.000f, 5); // Jun
        valueSet2.add(v2e6);
        BarEntry v2e7 = new BarEntry(11.000f,6); // jul
        valueSet2.add(v2e7);
        BarEntry v2e8 = new BarEntry(10.000f,7); // aug
        valueSet2.add(v2e8);
        BarEntry v2e9 = new BarEntry(130.000f,8); // sep
        valueSet2.add(v2e9);
        BarEntry v2e10 = new BarEntry(14.000f,9); // okt
        valueSet2.add(v2e10);
        BarEntry v2e11 = new BarEntry(150.000f,10); // nov
        valueSet2.add(v2e11);
        BarEntry v2e12 = new BarEntry(16.000f,11); // dec
        valueSet2.add(v2e12);



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
        xAxis.add("JUL");
        xAxis.add("AUG");
        xAxis.add("SEP");
        xAxis.add("OKT");
        xAxis.add("NOV");
        xAxis.add("DEC");
        return xAxis;
    }
}