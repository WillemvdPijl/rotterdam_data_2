package topkek_mobile.BasicFunctions;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

import topkek_mobile.fragments1.R;


public class MapsActivity extends FragmentActivity {
    GoogleMap mMap;
    ArrayList<LatLng> markerPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Creating the marker points
        markerPoints = new ArrayList<LatLng>();

        // Reference to the supportmapfragment
        SupportMapFragment fm = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);

        // Getting the map and enabling the location of the device
        fm.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                mMap = googleMap;
                mMap.setMyLocationEnabled(true);

            }
        });
        try {
            fm.wait(1000);
        }
        catch(Exception e){}
        if (mMap != null) {

            // Enable the mylocation button in the map fragment
            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                return;
            }
            mMap.setMyLocationEnabled(true);


        }
    }


    public void changeType(View view) {
        if (mMap.getMapType() == GoogleMap.MAP_TYPE_NORMAL) {
            mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        } else
            mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }
    private void setUpMap() {

        mMap.addMarker(new MarkerOptions().position(new LatLng(0, 0)).title("Marker"));
        LatLng test = new LatLng(51.823963, 4.477295);
        mMap.addMarker(new MarkerOptions().position(test).title("iets"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(test));
    }

}