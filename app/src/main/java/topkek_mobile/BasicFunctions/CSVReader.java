package topkek_mobile.BasicFunctions;

/**
 * Created by Dave on 28-6-2016.
 */
import android.content.Context;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CSVReader implements Idata {
    InputStream inputStream;

    //Wijken
    public float Centrum = 0;
    public float Charlois = 0;
    public float Delfshaven = 0;
    public float Feijenoord = 0;
    public float Noord = 0;
    public float Hillegersberg = 0;
    public float Overschie = 0;
    public float Crooswijk = 0;
    public float Pernis = 0;
    public float IJsselmonde = 0;
    public float West = 0;
    public float Ommoord = 0;
    public float Hoogvliet = 0;

    //Maanden
    public float Januari = 0;
    public float Februari = 0;
    public float Maart = 0;
    public float April = 0;
    public float Mei = 0;
    public float Juni = 0;
    public float Juli = 0;
    public float Augustus = 0;
    public float September = 0;
    public float Oktober = 0;
    public float November = 0;
    public float December = 0;

    //Fietsmerken
    public float GAZELLE = 0;
    public float BATAVUS = 0;
    public float PEUGEOT = 0;
    public float SPARTA = 0;
    public float GIANT = 0;
    public float UNION = 0;
    public float YAMAHA = 0;
    public float OVERIG = 0;

    Context context;
    String fileName;

    public CSVReader(Context context, String fileName) {
        this.context = context;
        this.fileName = fileName;
    }


    @Override
    public void test_List() {
        BufferedReader bReader = null;
        String line;
        String csvSplitBy = ",";

        try {

            InputStreamReader inputStream = new InputStreamReader(context.getAssets().open(fileName));
            bReader = new BufferedReader(inputStream);

            while ((line = bReader.readLine()) != null) {


                String[] test_row = line.split(csvSplitBy);
//                System.out.println("csvFile [Value= " + test_row[0] + ", Value=" + test_row[1] + ", Value=" + test_row[7] + "]");

                if (test_row[6].contains("Centrum"))
                    Centrum += 1;




                if (test_row[7].contains("Charlois"))
                    Charlois += 1.0;


                if (test_row[7].contains("Delfshaven"))
                    Delfshaven += 1.0;


                if (test_row[7].contains("Feijenoord"))
                    Feijenoord += 1.0;


                if (test_row[7].contains("Noord"))
                    Noord += 1.0;

                if (test_row[7].contains("Hillegersberg"))
                    Hillegersberg += 1.0;

                if (test_row[7].contains("Overschie"))
                    Overschie += 1.0;

                if (test_row[7].contains("Crooswijk"))
                    Crooswijk += 1.0;

                if (test_row[7].contains("Pernis"))
                    Pernis += 1.0;


                if (test_row[7].contains("IJsselmonde"))
                    IJsselmonde += 1.0;

                if (test_row[7].contains("West"))
                    West += 1.0;


                if (test_row[7].contains("Ommoord"))
                    Ommoord += 1.0;

                if (test_row[7].contains("Hoogvliet"))
                    Hoogvliet += 1.0;


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
        System.out.println(Centrum);
    }



    public float getCentrum(){
        return Centrum;
    }

    public float getFeijenoord() {
        return Feijenoord;
    }

    public float getHillegersberg() {
        return Hillegersberg;
    }

    public float getOverschie() {
        return Overschie;
    }

    public float getkCrooswijk() {
        return Crooswijk;
    }

    public float getPernis() {
        return Pernis;
    }

    public float getIJsselmonde() {
        return IJsselmonde;
    }

    public float getWest() {
        return West;
    }

    public float getOmoord() {
        return Ommoord;
    }

    public float getHoogvliet() {
        return Hoogvliet;
    }

    public float getCharlois() {
        return Charlois;
    }

    public float getDelfshaven() {
        return Delfshaven;
    }

    public float getNoord() {
        return Noord;
    }
}







