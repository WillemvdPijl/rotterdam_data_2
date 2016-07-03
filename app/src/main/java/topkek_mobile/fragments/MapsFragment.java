package topkek_mobile.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import topkek_mobile.BasicFunctions.MapsActivity;
import topkek_mobile.fragments1.R;

/**
 * Created by Willem on 27-6-2016.
 */
public class MapsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_maps, container, false);

        return rootView;


    }


/**
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Intent GoToMaps = new Intent(this, MapsFragment.class);
        Button button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(testPageOne);
            }
        });
    }
**/

}