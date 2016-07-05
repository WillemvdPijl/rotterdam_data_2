package topkek_mobile.Note;

/**
 * Created by Anthony on 30-6-2016.
 */

import android.content.Intent;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.List;
import java.util.Locale;

import topkek_mobile.BasicFunctions.GPSTracker;
import topkek_mobile.fragments1.R;

public class TaskDescriptionActivity extends AppCompatActivity {

    GPSTracker gps;

    public static final String EXTRA_TASK_DESCRIPTION = "task";

    private EditText mDescriptionView;

    private String getCompleteAddressString(double LATITUDE, double LONGITUDE) {
        String strAdd = "";
        Geocoder geocoder = new Geocoder(this, Locale.getDefault());
        try {
            List<android.location.Address> addresses = geocoder.getFromLocation(LATITUDE, LONGITUDE, 1);
            if (addresses != null) {
                android.location.Address returnedAddress = addresses.get(0);
                StringBuilder strReturnedAddress = new StringBuilder("");

                for (int i = 0; i < returnedAddress.getMaxAddressLineIndex(); i++) {
                    strReturnedAddress.append(returnedAddress.getAddressLine(i)).append("\n");
                }
                strAdd = strReturnedAddress.toString();
                Log.w("My Current address",""+strReturnedAddress.toString());
            } else {
                Log.w("My Current address", "No Address returned!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.w("My Current address", "Canont get Address!");
        }
        return strAdd;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_description);

        mDescriptionView = (EditText) findViewById(R.id.descriptionText);
        gps = new GPSTracker(TaskDescriptionActivity.this);


        }

    public void doneClicked(View view) {


        if(gps.canGetLocation()) {
            /**double latitude = gps.getLatitude();
             double longitude = gps.getLongitude();

             Toast.makeText(
             getApplicationContext(),
             "Your Location is -\nLat: " + latitude + "\nLong: "
             + longitude, Toast.LENGTH_LONG).show(); **/


            String taskDescription = (mDescriptionView.getText().toString() + " - " + (getCompleteAddressString(gps.getLatitude(),gps.getLongitude())));


            if (!taskDescription.isEmpty()) {
                // 2
                Intent result = new Intent();
                result.putExtra(EXTRA_TASK_DESCRIPTION, taskDescription);
                setResult(RESULT_OK, result);
                } else {
                // 3
                setResult(RESULT_CANCELED);
                }

            //Intent noteAct = new Intent(this, NoteActivity.class);
            //startActivity(noteAct);
            finish();




            } else {
            gps.showSettingsAlert();
            }
        System.out.println("LATITUDEEEEE:" + gps.getLatitude()+"LONGITUDEEEEE " + gps.getLongitude());
        }

}