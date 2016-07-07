package topkek_mobile.BasicFunctions;

import android.content.Context;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Dave on 06-07-16.
 */
public class CSVReader_monthTheft extends  monthThefts {


    Context context;
    String fileName;

    public CSVReader_monthTheft(Context context, String fileName) {
        this.context = context;
        this.fileName = fileName;
    }

    @Override
    public void getWijken() {
        BufferedReader bReader = null;
        String line;
        String csvSplitBy = ",";
        try {
            InputStreamReader inputStream = new InputStreamReader(context.getAssets().open(fileName));
            bReader = new BufferedReader(inputStream);
            while ((line = bReader.readLine()) != null) {
                String[] test_row = line.split(csvSplitBy);
//                System.out.println(test_row[9].substring(0, 1));
                if (test_row[6].contains("STAD")) {
                    if (test_row[2].substring(2,3).contains("1"))
                        TheftCentrumJanuari += 1;
                    if (test_row[2].substring(2,3).contains("2"))
                        TheftCentrumFebruari += 1;
                    if (test_row[2].substring(2,3).contains("3"))
                        TheftCentrumMaart += 1;
                    if (test_row[2].substring(2,3).contains("4"))
                        TheftCentrumApril += 1;
                    if (test_row[2].substring(2,3).contains("5"))
                        TheftCentrumMei += 1;
                    if (test_row[2].substring(2,3).contains("6"))
                        TheftCentrumJuni += 1;
                    if (test_row[2].substring(2,3).contains("7"))
                        TheftCentrumJuli += 1;
                    if (test_row[2].substring(2,3).contains("8"))
                        TheftCentrumAugustus += 1;
                    if (test_row[2].substring(2,3).contains("9"))
                        TheftCentrumSeptember += 1;
                    if (test_row[2].substring(2,3).contains("10"))
                        TheftCentrumOktober += 1;
                    if (test_row[2].substring(2,3).contains("11"))
                        TheftCentrumNovember += 1;
                    if (test_row[2].substring(2,3).contains("12"))
                        TheftCentrumDecember += 1;

                }
//                if (test_row[7].contains("Charlois")) {
//                    if (test_row[9].substring(0, 1).contains("4"))
//                        CharloisApril += 1;
//                    if (test_row[9].substring(0, 1).contains("1"))
//                        CharloisJanuari += 1;
//                    if (test_row[9].substring(0, 1).contains("8"))
//                        CharloisAugustus += 1;
//                    if (test_row[9].substring(0, 1).contains("12"))
//                        CharloisDecember += 1;
//                    if (test_row[9].substring(0, 1).contains("7"))
//                        CharloisJuli += 1;
//                    if (test_row[9].substring(0, 1).contains("6"))
//                        CharloisJuni += 1;
//                    if (test_row[9].substring(0, 1).contains("4"))
//                        CharloisApril += 1;
//                    if (test_row[9].substring(0, 1).contains("5"))
//                        CharloisMei += 1;
//                    if (test_row[9].substring(0, 1).contains("9"))
//                        CharloisSeptember += 1;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bReader != null) {
                try {
                    bReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

//        System.out.println(CentrumApril+"TESTTTTT?" + CentrumMei + CentrumSeptember + CentrumJuni+ "  " + DelfshavenSeptember);
    }
}