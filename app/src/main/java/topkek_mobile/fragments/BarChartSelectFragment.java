package topkek_mobile.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import topkek_mobile.fragments1.R;

/**
 * Created by Willem on 5-7-2016.
 */
public class BarChartSelectFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_barchartselect, container, false);

        return rootView;


    }/**
   private static final String [] hood =
           {"Centrum", "Charlois", "Delfshaven", "Feijenoord", "Hillegersberg", "Noord", "Overschie", "Crooswijk", "Pernis", "Ijsselmonde", "West", "Ommoord", "Hoogvliet",
           };


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_barchartselect, container, false);


        Spinner spinner = (Spinner) v.findViewById(R.id.spin);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this.getActivity(), android.R.layout.simple_spinner_item, hood);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        return v;

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Fragment frag;

        switch(i){
            case 1:

                //frag = new SelectedChart("Centrum");
                //showSelectedArea("Centrum");
                break;
            case 2:
                //frag = new SelectedChart("Charlois");
                //showSelectedArea("Charlois");
                break;


        }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
  }**/
}

