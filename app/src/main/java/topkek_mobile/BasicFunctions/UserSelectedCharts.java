//package topkek_mobile.BasicFunctions;
//
//import android.graphics.Color;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//
//import com.github.mikephil.charting.charts.BarChart;
//import com.github.mikephil.charting.data.BarData;
//import com.github.mikephil.charting.data.BarDataSet;
//import com.github.mikephil.charting.data.BarEntry;
//import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
//import com.github.mikephil.charting.utils.ColorTemplate;
//
//import java.util.ArrayList;
//
//import topkek_mobile.fragments1.R;
//
///**
// * Created by Willem on 6-7-2016.
// */
//public class UserSelectedCharts extends AppCompatActivity {
//
//
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_userselectedcharts);
//        BarChart chart = (BarChart) findViewById(R.id.uschart);
//
//        BarData data = new BarData(getXAxisValues(), getDataSet());
//        chart.setData(data);
//        chart.setDescription("My Chart");
//        chart.animateXY(2000, 2000);
//        chart.invalidate();
//    }
//
//    private ArrayList<IBarDataSet> getDataSet() {
//        ArrayList<IBarDataSet> dataSets = null;
//
//        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
        //BarEntry v1e1 = new BarEntry(MainActivity.fietsContainerWijken.CentrumApril, 0); // Jan
        //valueSet1.add(v1e1);
        //BarEntry v1e2 = new BarEntry(MainActivity.fietsContainerWijken.CentrumMei, 1); // Feb
        //valueSet1.add(v1e2);
        //BarEntry v1e3 = new BarEntry(MainActivity.fietsContainerWijken.CentrumJuni, 2); // Mar
        //valueSet1.add(v1e3);
        //BarEntry v1e4 = new BarEntry(MainActivity.fietsContainerWijken.CentrumJuli, 3); // Apr
        //valueSet1.add(v1e4);
        //BarEntry v1e5 = new BarEntry(MainActivity.fietsContainerWijken.CentrumAugustus, 4); // May
        //valueSet1.add(v1e5);
        //BarEntry v1e6 = new BarEntry(MainActivity.fietsContainerWijken.CentrumSeptember, 5); // Jun
        //valueSet1.add(v1e6);
//
        //ArrayList<BarEntry> valueSet2 = new ArrayList<>();
        //BarEntry v2e1 = new BarEntry(MainActivity.fietsmaanddiefstal.TheftCentrumJanuari, 0); // Jan
        //valueSet2.add(v2e1);
        //BarEntry v2e2 = new BarEntry(MainActivity.fietsmaanddiefstal.TheftCentrumFebruari, 1); // Feb
        //valueSet2.add(v2e2);
        //BarEntry v2e3 = new BarEntry(MainActivity.fietsmaanddiefstal.TheftCentrumMaart, 2); // Mar
        //valueSet2.add(v2e3);
//        BarEntry v2e4 = new BarEntry(60.000f, 3); // Apr
//        valueSet2.add(v2e4);
//        BarEntry v2e5 = new BarEntry(20.000f, 4); // May
//        valueSet2.add(v2e5);
//        BarEntry v2e6 = new BarEntry(80.000f, 5); // Jun
//        valueSet2.add(v2e6);

        //IBarDataSet barDataSet1 = new BarDataSet(valueSet1, "Brand 1");
//        barDataSet1.setColor(Color.rgb(0, 155, 0));
       // IBarDataSet barDataSet2 = new BarDataSet(valueSet2, "Brand 2");
//        barDataSet2.setColors(ColorTemplate.COLORFUL_COLORS);

//        dataSets = new ArrayList<>();
//        dataSets.add(barDataSet1);
//        dataSets.add(barDataSet2);
//        return dataSets;
//    }
//
//    private ArrayList<String> getXAxisValues() {
//        ArrayList<String> xAxis = new ArrayList<>();
//        xAxis.add("Apr");
//        xAxis.add("Mei");
//        xAxis.add("Juni");
//        xAxis.add("Juli");
//        xAxis.add("Aug");
//        xAxis.add("Sept");
//        return xAxis;
//    }
//
//}