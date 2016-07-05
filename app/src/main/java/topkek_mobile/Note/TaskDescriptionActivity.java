package topkek_mobile.Note;

/**
 * Created by Anthony on 30-6-2016.
 */

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import topkek_mobile.BasicFunctions.GPSTracker;
import topkek_mobile.fragments1.R;

public class TaskDescriptionActivity extends AppCompatActivity {

    GPSTracker gps;

    private TextView myAddress;

    public static final String EXTRA_TASK_DESCRIPTION = "task";

    private EditText mDescriptionView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_description);

        mDescriptionView = (EditText) findViewById(R.id.descriptionText);
        gps = new GPSTracker(TaskDescriptionActivity.this);


    }

   /** public void getMyLocationAddress() {


    }**/

    public void doneClicked(View view) {


        if(gps.canGetLocation()) {
            /**double latitude = gps.getLatitude();
            double longitude = gps.getLongitude();

            Toast.makeText(
                    getApplicationContext(),
                    "Your Location is -\nLat: " + latitude + "\nLong: "
                            + longitude, Toast.LENGTH_LONG).show(); **/



            Geocoder geocoder= new Geocoder(this, Locale.ENGLISH);

            try {

                //Place your latitude and longitude
                List<Address> addresses = geocoder.getFromLocation(gps.getLatitude(),gps.getLongitude(), 0);

                if(addresses != null) {

                    Address fetchedAddress = addresses.get(0);
                    StringBuilder strAddress = new StringBuilder();

                    for(int i=0; i<fetchedAddress.getMaxAddressLineIndex(); i++) {
                        strAddress.append(fetchedAddress.getAddressLine(i)).append("\n");
                    }

                    myAddress.setText("I am at: " +strAddress.toString());
                    String taskDescription = (mDescriptionView.getText().toString() + "\n" + strAddress.toString());



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

                }

                else {
                    String taskDescription = (mDescriptionView.getText().toString() + "\n Location not found...");
                }

            }
            catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Toast.makeText(getApplicationContext(),"Could not get address..!", Toast.LENGTH_LONG).show();
            }



        } else {
            gps.showSettingsAlert();
        }

    }

}