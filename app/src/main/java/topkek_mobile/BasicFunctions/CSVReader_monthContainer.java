package topkek_mobile.BasicFunctions;

import android.content.Context;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Dave on 06-07-16.
 */
public class CSVReader_monthContainer extends monthContainer {


    Context context;
    String fileName;

    public CSVReader_monthContainer(Context context, String fileName) {
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
                System.out.println(test_row[9].substring(0,1));
                if (test_row[7].contains("Centrum")) {
                    if (test_row[9].substring(0,1).contains("4"))
                        CentrumApril += 1;
                    if (test_row[9].substring(0,1).contains("8"))
                        CentrumAugustus += 1;
                    if (test_row[9].substring(0,1).contains("6"))
                        CentrumJuni += 1;
                    if (test_row[9].substring(0,1).contains("7"))
                        CentrumJuli += 1;
                    if (test_row[9].substring(0,1).contains("5"))
                        CentrumMei += 1;
                    if (test_row[9].substring(0,1).contains("9"))
                        CentrumSeptember += 1;
                }
                if (test_row[7].contains("Charlois")){
                    if (test_row[9].substring(0,1).contains("4"))
                        CharloisApril += 1;
                    if (test_row[9].substring(0,1).contains("1"))
                        CharloisJanuari += 1;
                    if (test_row[9].substring(0,1).contains("8"))
                        CharloisAugustus += 1;
                    if (test_row[9].substring(0,1).contains("12"))
                        CharloisDecember += 1;
                    if (test_row[9].substring(0,1).contains("7"))
                        CharloisJuli += 1;
                    if (test_row[9].substring(0,1).contains("6"))
                        CharloisJuni += 1;
                    if (test_row[9].substring(0,1).contains("4"))
                        CharloisApril += 1;
                    if (test_row[9].substring(0,1).contains("5"))
                        CharloisMei += 1;
                    if (test_row[9].substring(0,1).contains("9"))
                        CharloisSeptember += 1;
                }
                if (test_row[7].contains("Delfshaven")){
                    if (test_row[9].substring(0,1).contains("4"))
                        DelfshavenApril += 1;
                    if (test_row[9].substring(0,1).contains("8"))
                        DelfshavenAugustus +=1 ;
                    if (test_row[9].substring(0,1).contains("1"))
                        DelfshavenJanuari +=1 ;
                    if (test_row[9].substring(0,1).contains("7"))
                        DelfshavenJuli +=1 ;
                    if (test_row[9].substring(0,1).contains("6"))
                        DelfshavenJuni +=1 ;
                    if (test_row[9].substring(0,1).contains("5"))
                        DelfshavenMei +=1 ;
                    if (test_row[9].substring(0,1).contains("11"))
                        DelfshavenNovember +=1 ;
                    if (test_row[9].substring(0,1).contains("9"))
                        DelfshavenSeptember +=1 ;
                }
                if (test_row[7].contains("Feijenoord")) {
                    if (test_row[9].substring(0, 1).contains("4"))
                        FeijenoordApril += 1;
                    if (test_row[9].substring(0, 1).contains("8"))
                        FeijenoordAugustus += 1;
                    if (test_row[9].substring(0, 1).contains("7"))
                        FeijenoordJuli += 1;
                    if (test_row[9].substring(0, 1).contains("6"))
                        FeijenoordJuni += 1;
                    if (test_row[9].substring(0, 1).contains("3"))
                        FeijenoordMaart += 1;
                    if (test_row[9].substring(0, 1).contains("11"))
                        FeijenoordNovember += 1;
                    if (test_row[9].substring(0, 1).contains("10"))
                        FeijenoordOktober += 1;
                    if (test_row[9].substring(0, 1).contains("9"))
                        FeijenoordSeptember += 1;
                }
                if (test_row[7].contains("Noord")){
                    if (test_row[9].substring(0,1).contains("4"))
                        NoordApril += 1;
                    if (test_row[9].substring(0,1).contains("8"))
                        NoordAugustus += 1;
                    if (test_row[9].substring(0,1).contains("2"))
                        NoordFebruari += 1;
                    if (test_row[9].substring(0,1).contains("1"))
                        NoordJanuari += 1;
                    if (test_row[9].substring(0,1).contains("7"))
                        NoordJuli += 1;
                    if (test_row[9].substring(0,1).contains("6"))
                        NoordJuni += 1;
                    if (test_row[9].substring(0,1).contains("3"))
                        NoordMaart += 1;
                    if (test_row[9].substring(0,1).contains("5"))
                        NoordMei += 1;
                    if (test_row[9].substring(0,1).contains("11"))
                        NoordNovember += 1;
                    if (test_row[9].substring(0,1).contains("10"))
                        NoordOktober += 1;
                    if (test_row[9].substring(0,1).contains("9"))
                        NoordSeptember += 1;
                }
                if (test_row[7].contains("Hillegersberg")){
                    if (test_row[9].substring(0,1).contains("4"))
                        HillegersbergApril += 1;
                    if (test_row[9].substring(0,1).contains("8"))
                        HillegersbergAugustus += 1;
                    if (test_row[9].substring(0,1).contains("7"))
                        HillegersbergJuli += 1;
                    if (test_row[9].substring(0,1).contains("6"))
                        HillegersbergJuni += 1;
                    if (test_row[9].substring(0,1).contains("11"))
                        HillegersbergSeptember += 1;

                }
                if (test_row[7].contains("Delfshaven")){
                    if (test_row[9].substring(0,1).contains("4"))
                        DelfshavenApril += 1;
                    if (test_row[9].substring(0,1).contains("8"))
                        DelfshavenAugustus += 1;
                    if (test_row[9].substring(0,1).contains("2"))
                        DelfshavenFebruari += 1;
                    if (test_row[9].substring(0,1).contains("1"))
                        DelfshavenJanuari += 1;
                    if (test_row[9].substring(0,1).contains("7"))
                        DelfshavenJuli += 1;
                    if (test_row[9].substring(0,1).contains("6"))
                        DelfshavenJuni += 1;
                    if (test_row[9].substring(0,1).contains("3"))
                        DelfshavenMaart += 1;
                    if (test_row[9].substring(0,1).contains("5"))
                        DelfshavenMei += 1;
                    if (test_row[9].substring(0,1).contains("11"))
                        DelfshavenNovember += 1;
                    if (test_row[9].substring(0,1).contains("10"))
                        DelfshavenOktober += 1;
                    if (test_row[9].substring(0,1).contains("9"))
                        DelfshavenSeptember += 1;
                }

//                    centrumJanuari += 1;
//                if (test_row[7].contains("Charlois"))
//                    Charlois += 1.0;
//                if (test_row[7].contains("Delfshaven"))
//                    Delfshaven += 1.0;
//                if (test_row[7].contains("Feijenoord"))
//                    Feijenoord += 1.0;
//                if (test_row[7].contains("Noord"))
//                    Noord += 1.0;
//                if (test_row[7].contains("Hillegersberg"))
//                    Hillegersberg += 1.0;
//                if (test_row[7].contains("Overschie"))
//                    Overschie += 1.0;
//                if (test_row[7].contains("Crooswijk"))
//                    Crooswijk += 1.0;
//                if (test_row[7].contains("Pernis"))
//                    Pernis += 1.0;
//                if (test_row[7].contains("IJsselmonde"))
//                    IJsselmonde += 1.0;
//                if (test_row[7].contains("West"))
//                    West += 1.0;
//                if (test_row[7].contains("Ommoord"))
//                    Ommoord += 1.0;
//                if (test_row[7].contains("Hoogvliet"))
//                    Hoogvliet += 1.0;
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

        System.out.println(CentrumApril+"TESTTTTT?" + CentrumMei + CentrumSeptember + CentrumJuni+ "  " + DelfshavenSeptember);
    }
}