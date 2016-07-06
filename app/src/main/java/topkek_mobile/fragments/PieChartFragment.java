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
public class PieChartFragment extends Fragment {
    private PieChart pieChartBrand;
    private PieChart pieChartColour;
    private PieData pieDataColour;
    private PieData pieDataBrand;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_piechart, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        pieChartBrand = (PieChart) view.findViewById(R.id.view3);
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
//            entriesBrand.add(new Entry(MainActivity.fietsMerken.getGAZELLE(),0));
        entriesColour.add(new Entry(MainActivity.fietsMerken.BATAVUS,1));
        entriesColour.add(new Entry(MainActivity.fietsMerken.PEUGEOT,2));
        entriesColour.add(new Entry(MainActivity.fietsMerken.SPARTA,3));
        entriesColour.add(new Entry(MainActivity.fietsMerken.GIANT,4));
        entriesColour.add(new Entry(MainActivity.fietsMerken.UNION,5));
        entriesColour.add(new Entry(MainActivity.fietsMerken.YAMAHA,6));
        entriesColour.add(new Entry(MainActivity.fietsMerken.TOMOS,7));
        entriesColour.add(new Entry(MainActivity.fietsMerken.PIAGGIO,8));
        entriesColour.add(new Entry(MainActivity.fietsMerken.VESPA,9));
        entriesColour.add(new Entry(MainActivity.fietsMerken.GILERA,10));
        entriesColour.add(new Entry(MainActivity.fietsMerken.SYM,11));
        entriesColour.add(new Entry(MainActivity.fietsMerken.POINTER,12));
        entriesColour.add(new Entry(MainActivity.fietsMerken.ALTRA,13));
        entriesColour.add(new Entry(MainActivity.fietsMerken.OVERIG,14));

        ArrayList<Entry> entriesBrand = new ArrayList<>();
        entriesBrand.add(new Entry(MainActivity.fietsMerken.GAZELLE,0));
        entriesBrand.add(new Entry(MainActivity.fietsMerken.BATAVUS,1));
        entriesBrand.add(new Entry(MainActivity.fietsMerken.PEUGEOT,2));
        entriesBrand.add(new Entry(MainActivity.fietsMerken.SPARTA,3));
        entriesBrand.add(new Entry(MainActivity.fietsMerken.GIANT,4));
        entriesBrand.add(new Entry(MainActivity.fietsMerken.UNION,5));
        entriesBrand.add(new Entry(MainActivity.fietsMerken.YAMAHA,6));
        entriesBrand.add(new Entry(MainActivity.fietsMerken.TOMOS,7));
        entriesBrand.add(new Entry(MainActivity.fietsMerken.PIAGGIO,8));
        entriesBrand.add(new Entry(MainActivity.fietsMerken.VESPA,9));
        entriesBrand.add(new Entry(MainActivity.fietsMerken.GILERA,10));
        entriesBrand.add(new Entry(MainActivity.fietsMerken.SYM,11));
        entriesBrand.add(new Entry(MainActivity.fietsMerken.POINTER,12));
        entriesBrand.add(new Entry(MainActivity.fietsMerken.ALTRA,13));
        entriesBrand.add(new Entry(MainActivity.fietsMerken.OVERIG,14));

//        entriesBrand.add(new Entry


        PieDataSet dataSetColour = new PieDataSet(entriesColour, "");
        PieDataSet dataSetBrand = new PieDataSet(entriesBrand,"");
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Gazelle");
        labels.add("Batavus");
        labels.add("Peugeot");
        labels.add("Sparta");
        labels.add("Giant");
        labels.add("Union");
        labels.add("Yamaha");
        labels.add("Tomos");
        labels.add("Piaggio");
        labels.add("Vespa");
        labels.add("Gilera");
        labels.add("Sym");
        labels.add("Pointer");
        labels.add("Altra");
        labels.add("Overig");




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