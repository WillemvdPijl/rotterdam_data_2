package topkek_mobile.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import topkek_mobile.fragments1.R;

/**
 * Created by Remco on 28-6-2016.
 */
public class PieChartFragment extends Fragment {
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_piechart, container, false);

        return rootView;
    }




}
