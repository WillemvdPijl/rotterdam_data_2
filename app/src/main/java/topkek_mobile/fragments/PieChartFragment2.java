package topkek_mobile.fragments;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;

import java.util.ArrayList;

import topkek_mobile.BasicFunctions.MainActivity;
import topkek_mobile.fragments1.R;

/**
 * Created by Remco on 28-6-2016....
 */
public class PieChartFragment2 extends Fragment {
    private PieChart pieChartBrand;
    private PieChart pieChartColour;
    private PieData pieDataColour;
    private PieData pieDataBrand;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_piechart2, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        pieChartBrand = (PieChart) view.findViewById(R.id.view4);
        pieChartBrand.setData(pieDataBrand); //set pieData into chart
        pieChartBrand.setDescription("Description");
        pieChartBrand.animateY(1500);
        pieChartBrand.setTouchEnabled(true);

//        pieChartColour = (PieChart) view.findViewById(R.id.piechartColour);
//        pieChartColour.setData(pieDataColour);
//        pieChartColour.setDescription("Desc");
//        pieChartColour.animateY(1500);
//        pieChartColour.setTouchEnabled(false);


//        toggleKnoppie = ButtonFactory.getButton("main");
//        toggleKnop = (ToggleButton) view.findViewById(R.id.toggleButton);
//        toggleKnoppie.action(toggleKnop);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<Entry> entriesColour = new ArrayList<>();
        entriesColour.add(new Entry(MainActivity.fietsKleuren.MEERKLEURIG,0));
        entriesColour.add(new Entry(MainActivity.fietsKleuren.ONBEKEND,1));
        entriesColour.add(new Entry(MainActivity.fietsKleuren.GRIJS,2));
        entriesColour.add(new Entry(MainActivity.fietsKleuren.BLAUW,3));
        entriesColour.add(new Entry(MainActivity.fietsKleuren.GROEN,4));
        entriesColour.add(new Entry(MainActivity.fietsKleuren.CHROOM,5));
        entriesColour.add(new Entry(MainActivity.fietsKleuren.ZILVER,6));
        entriesColour.add(new Entry(MainActivity.fietsKleuren.ZWART,7));
        entriesColour.add(new Entry(MainActivity.fietsKleuren.BEIGE,8));
        entriesColour.add(new Entry(MainActivity.fietsKleuren.ROOD,9));
        entriesColour.add(new Entry(MainActivity.fietsKleuren.WIT,10));
        entriesColour.add(new Entry(MainActivity.fietsKleuren.PAARS,11));
        entriesColour.add(new Entry(MainActivity.fietsKleuren.ORANJE,12));
        entriesColour.add(new Entry(MainActivity.fietsKleuren.BRUIN,13));
        entriesColour.add(new Entry(MainActivity.fietsKleuren.KOPER,14));
        entriesColour.add(new Entry(MainActivity.fietsKleuren.CREME,15));


        ArrayList<Entry> entriesBrand = new ArrayList<>();
        entriesBrand.add(new Entry(MainActivity.fietsKleuren.MEERKLEURIG,0));
        entriesBrand.add(new Entry(MainActivity.fietsKleuren.ONBEKEND,1));
        entriesBrand.add(new Entry(MainActivity.fietsKleuren.GRIJS,2));
        entriesBrand.add(new Entry(MainActivity.fietsKleuren.BLAUW,3));
        entriesBrand.add(new Entry(MainActivity.fietsKleuren.GROEN,4));
        entriesBrand.add(new Entry(MainActivity.fietsKleuren.CHROOM,5));
        entriesBrand.add(new Entry(MainActivity.fietsKleuren.ZILVER,6));
        entriesBrand.add(new Entry(MainActivity.fietsKleuren.ZWART,7));
        entriesBrand.add(new Entry(MainActivity.fietsKleuren.BEIGE,8));
        entriesBrand.add(new Entry(MainActivity.fietsKleuren.ROOD,9));
        entriesBrand.add(new Entry(MainActivity.fietsKleuren.WIT,10));
        entriesBrand.add(new Entry(MainActivity.fietsKleuren.PAARS,11));
        entriesBrand.add(new Entry(MainActivity.fietsKleuren.ORANJE,12));
        entriesBrand.add(new Entry(MainActivity.fietsKleuren.BRUIN,13));
        entriesBrand.add(new Entry(MainActivity.fietsKleuren.KOPER,14));
        entriesBrand.add(new Entry(MainActivity.fietsKleuren.CREME,15));

//        entriesBrand.add(new Entry


        PieDataSet dataSetColour = new PieDataSet(entriesColour, "");
        PieDataSet dataSetBrand = new PieDataSet(entriesBrand,"");
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Meerkleurig");
        labels.add("Onbekend");
        labels.add("Grijs");
        labels.add("Blauw");
        labels.add("Groen");
        labels.add("Chroom");
        labels.add("Zilver");
        labels.add("Zwart");
        labels.add("Beige");
        labels.add("Rood");
        labels.add("Wit");
        labels.add("Paars");
        labels.add("Oranje");
        labels.add("Bruin");
        labels.add("Koper");
        labels.add("Creme");




        pieDataColour = new PieData(labels, dataSetColour);
        pieDataBrand = new PieData(labels, dataSetBrand);
        dataSetColour.setColors(My_Colours);
        dataSetBrand.setColors(My_Colours);

    }

    public static final int[] My_Colours = {
            Color.rgb(180, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120),
            Color.rgb(106, 150, 134), Color.rgb(53, 210, 209), Color.rgb(255, 80, 138),
            Color.rgb(254, 50, 7), Color.rgb(254, 200, 120), Color.rgb(106, 100, 134),
            Color.rgb(106, 200, 134), Color.rgb(5, 175, 254), Color.rgb(102, 51, 0)
    };

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}