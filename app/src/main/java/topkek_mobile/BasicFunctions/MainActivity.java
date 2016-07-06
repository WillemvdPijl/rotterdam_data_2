package topkek_mobile.BasicFunctions;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;

import topkek_mobile.Note.NoteActivity;
import topkek_mobile.fragments.BarChartFragment;
import topkek_mobile.fragments.BarChartSelectFragment;
import topkek_mobile.fragments.CalenderFragment;
import topkek_mobile.fragments.LineChartFragment;
import topkek_mobile.fragments.MainFragment;
import topkek_mobile.fragments.MapsFragment;
import topkek_mobile.fragments.NoteFragment;
import topkek_mobile.fragments.PieChartFragment;
import topkek_mobile.fragments.PieChartFragment2;
import topkek_mobile.fragments1.R;


public class    MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    public static CSVReader fietsWijken;
    public static CSVReader diefstalMaanden;
    public static CSVReader fietsMerken;
    public static CSVReader fietsKleuren;
    private static final String[] deelgem = new String[]{" ", "Centrum", "Charlois", "Delfshaven", "Feijenoord", "Hillegersberg"};
    private Spinner s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fietsWijken = new CSVReader(this.getApplicationContext(), "fietsTrommels.csv");
        fietsWijken.getWijken();

        diefstalMaanden = new CSVReader(this.getApplicationContext(), "fietsdiefstal.csv");
        diefstalMaanden.getMaanden();

        fietsMerken = new CSVReader(this.getApplicationContext(), "fietsDiefstal_naam.csv");
        fietsMerken.getMerken();

        fietsKleuren = new CSVReader(this.getApplicationContext(), "fietsDiefstal_naam.csv");
        fietsKleuren.getColours();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.content_frame, new MainFragment()).commit();

        //Spinner s = (Spinner) findViewById(R.id.spin);



//        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });


        /** s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedItem = parent.getItemAtPosition(position).toString();
        if(selectedItem.equals("0")){//doe mn stuff hier
        }
        else if (selectedItem.equals("1")){}
        }

        @Override public void onNothingSelected(AdapterView<?> parent) {

        }
        }); **/

//s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//    @Override
//    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> parent) {
//
//    }
//});
    }




    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        FragmentManager fm = getSupportFragmentManager();

        int id = item.getItemId();

        if (id == R.id.nav_barchart) {
            fm.beginTransaction().replace(R.id.content_frame, new BarChartFragment()).commit();
        } else if (id == R.id.nav_barchartselect) {
            fm.beginTransaction().replace(R.id.content_frame, new BarChartSelectFragment()).commit();

        }else if (id == R.id.nav_linechart) {
            fm.beginTransaction().replace(R.id.content_frame, new LineChartFragment()).commit();

        } else if (id == R.id.nav_piechart) {
            fm.beginTransaction().replace(R.id.content_frame, new PieChartFragment()).commit();
        } else if (id == R.id.nav_piechart2) {
            fm.beginTransaction().replace(R.id.content_frame, new PieChartFragment2()).commit();


        } else if (id == R.id.nav_main) {
            fm.beginTransaction().replace(R.id.content_frame, new MainFragment()).commit();
        } else if (id == R.id.nav_maps) {
            fm.beginTransaction().replace(R.id.content_frame, new MapsFragment()).commit();
        } else if (id == R.id.nav_calender) {
            fm.beginTransaction().replace(R.id.content_frame, new CalenderFragment()).commit();
        } else if (id == R.id.nav_note) {
            fm.beginTransaction().replace(R.id.content_frame, new NoteFragment()).commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    //public void ButtonOnClick(View view)
    //{
    //    Intent NoteAct = new Intent(this, NoteActivity.class);
    //    startActivity(NoteAct);
    //}
    public void mapButtonOnClick(View v) {
        Intent MapAct = new Intent(this, MapsActivity.class);
        startActivity(MapAct);
    }

    public void noteButtonOnClick(View v) {
        Intent NoteAct = new Intent(this, NoteActivity.class);
        startActivity(NoteAct);
    }

    public void calButtonOnClick(View v) {
        Intent calAct = new Intent(this, DateActivity.class);
        startActivity(calAct);
    }
}
