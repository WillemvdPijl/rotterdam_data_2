package topkek_mobile.BasicFunctions;

import android.graphics.Color;
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
        chart.setDescription("Aantal diefstallen per wijk");
        chart.animateXY(2000, 2000);
        chart.invalidate();
    }

    private ArrayList<IBarDataSet> getDataSet() {
        ArrayList<IBarDataSet> dataSets = null;

        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
        BarEntry v1e1 = new BarEntry(MainActivity.fietsContainerWijken.CharloisApril, 3); // Jan
        valueSet1.add(v1e1);
        BarEntry v1e2 = new BarEntry(MainActivity.fietsContainerWijken.CharloisMei, 4); // Feb
        valueSet1.add(v1e2);
        BarEntry v1e3 = new BarEntry(MainActivity.fietsContainerWijken.CharloisJuni, 5); // Mar
        valueSet1.add(v1e3);
        BarEntry v1e4 = new BarEntry(MainActivity.fietsContainerWijken.CharloisJuli, 6); // Apr
        valueSet1.add(v1e4);
        BarEntry v1e5 = new BarEntry(MainActivity.fietsContainerWijken.CharloisAugustus, 7); // May
        valueSet1.add(v1e5);
        BarEntry v1e6 = new BarEntry(MainActivity.fietsContainerWijken.CharloisSeptember, 8); // Jun
        valueSet1.add(v1e6);

        ArrayList<BarEntry> valueSet2 = new ArrayList<>();
        BarEntry v2e1 = new BarEntry(MainActivity.fietsmaanddiefstal.TheftCharloisJanuari, 0); // Jan
        valueSet2.add(v2e1);
        BarEntry v2e2 = new BarEntry(MainActivity.fietsmaanddiefstal.TheftCharloisFebruari, 1); // Feb
        valueSet2.add(v2e2);
        BarEntry v2e3 = new BarEntry(MainActivity.fietsmaanddiefstal.TheftCharloisMaart, 2); // Mar
        valueSet2.add(v2e3);
        BarEntry v2e4 = new BarEntry(MainActivity.fietsmaanddiefstal.TheftCharloisApril, 3); // Apr
        valueSet2.add(v2e4);
        BarEntry v2e5 = new BarEntry(MainActivity.fietsmaanddiefstal.TheftCharloisMei, 4); // May
        valueSet2.add(v2e5);
        BarEntry v2e6 = new BarEntry(MainActivity.fietsmaanddiefstal.TheftCharloisJuni, 5); // Jun
        valueSet2.add(v2e6);
        BarEntry v2e7 = new BarEntry(MainActivity.fietsmaanddiefstal.TheftCharloisJuli, 6); // Jun
        valueSet2.add(v2e7);
        BarEntry v2e8 = new BarEntry(MainActivity.fietsmaanddiefstal.TheftCharloisAugustus, 7); // Jun
        valueSet2.add(v2e8);
        BarEntry v2e9 = new BarEntry(MainActivity.fietsmaanddiefstal.TheftCharloisSeptember, 8); // Jun
        valueSet2.add(v2e9);
        BarEntry v2e10 = new BarEntry(MainActivity.fietsmaanddiefstal.TheftCharloisOktober, 9); // Jun
        valueSet2.add(v2e10);
        BarEntry v2e11 = new BarEntry(MainActivity.fietsmaanddiefstal.TheftCharloisNovember, 10); // Jun
        valueSet2.add(v2e11);
        BarEntry v2e12 = new BarEntry(MainActivity.fietsmaanddiefstal.TheftCharloisDecember, 11); // Jun
        valueSet2.add(v2e12);


        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Aantal trommels per maand");
        barDataSet1.setColor(Color.RED);
        BarDataSet barDataSet2 = new BarDataSet(valueSet2, "Aantal fietsdiefstallen per maand");
        barDataSet2.setColor(Color.BLUE);

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