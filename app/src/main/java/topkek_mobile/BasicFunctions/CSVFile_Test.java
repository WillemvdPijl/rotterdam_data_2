//package topkek_mobile.BasicFunctions;
//
//import android.app.Activity;
//import android.os.Parcelable;
//import android.os.Bundle;
//import android.widget.ListView;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.List;
//
//import topkek_mobile.fragments1.R;
////Mag ik pushen.
//
//public class CSVFile_Test extends Activity {
//    private ListView listView;
//    private ItemArrayAdapter itemArrayAdapter;
//
//    public static void main(String[] args) {
//        ArrayList<Integer> months = new ArrayList<>(12);
//        for ( int i = 0 ; i < 12 ; i ++){
//            months.add(0);
//        }
//
//        //loop over al je csv record
//        if(isJan("01/01/2011")){
//            System.out.println("jeeej");
//            months.set(0, months.get(0)++);
//        }
//    }
//
//    private static int toMonthNumber(String s) {
//        System.out.println();
//
//        return Integer.parseInt(s.substring(3,4));
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_csvfile__test);
//        listView = (ListView) findViewById(R.id.listView);
//        itemArrayAdapter = new ItemArrayAdapter(getApplicationContext(), R.layout.item_layout);
//
//        Parcelable state = listView.onSaveInstanceState();
//        listView.setAdapter(itemArrayAdapter);
//        listView.onRestoreInstanceState(state);
//
//        InputStream inputStream = getResources().openRawResource(R.raw.fietsdiefstal);
//        CSVFile csvFile = new CSVFile(inputStream);
//        List<String[]> scoreList = csvFile.read();
//
//        for(String[] scoreData:scoreList ) {
//            itemArrayAdapter.add(scoreData);
//        }
//    }
//}