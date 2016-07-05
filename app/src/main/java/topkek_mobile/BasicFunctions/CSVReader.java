package topkek_mobile.BasicFunctions;

/**
 * Created by Dave on 7-6-2016.
 */
import android.content.Context;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CSVReader implements Idata {
    InputStream inputStream;
    ArrayList<Float> test = new ArrayList<>();
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
    public float TOMOS = 0;
    public float PIAGGIO = 0;
    public float VESPA = 0;
    public float GILERA = 0;
    public float SYM = 0;
    public float POINTER = 0;
    public float ALTRA = 0;
    public float OVERIG = 0;

    public float MEERKLEURIG = 0;
    public float ONBEKEND = 0;
    public float GRIJS = 0;
    public float BLAUW = 0;
    public float GROEN = 0;
    public float CHROOM = 0;
    public float ZILVER = 0;
    public float ZWART = 0;
    public float BEIGE = 0;
    public float ROOD = 0;
    public float WIT = 0;
    public float PAARS = 0;
    public float ORANJE = 0;
    public float BRUIN = 0;
    public float KOPER = 0;
    public float CREME = 0;

    Context context;
    String fileName;

    public CSVReader(Context context, String fileName) {
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
//                System.out.println("csvFile [Value= " + test_row[0] + ", Value=" + test_row[1] + ", Value=" + test_row[7] + "]");

                if (test_row[7].contains("Centrum"))
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
        System.out.println(Noord);
    }


    @Override
    public void getMaanden() {
        BufferedReader bReader = null;
        String line;
        String csvSplitBy = ",";

        try {
            InputStreamReader inputStream = new InputStreamReader(context.getAssets().open(fileName));
            bReader = new BufferedReader(inputStream);

            while ((line = bReader.readLine()) != null) {

                String[] test_row = line.split(csvSplitBy);
//                System.out.println("csvFile [Value= " + test_row[0] + ", Value=" + test_row[1] + ", Value=" + test_row[2] + "]");

                if (test_row[1].substring(3,5).contains("01"))
                    Januari += 1;

                if (test_row[1].substring(3,5).contains("02"))
                    Februari += 1.0;

                if (test_row[1].substring(3,5).contains("03"))
                    Maart += 1.0;

                if (test_row[1].substring(3,5).contains("04"))
                    April += 1.0;

                if (test_row[1].substring(3,5).contains("05"))
                Mei += 1.0;

                if (test_row[1].substring(3,5).contains("06"))
                    Juni += 1.0;

                if (test_row[1].substring(3,5).contains("07"))
                    Juli += 1.0;

                if (test_row[1].substring(3,5).contains("07"))
                    Augustus += 1.0;

                if (test_row[1].substring(3,5).contains("09"))
                    September += 1.0;

                if (test_row[1].substring(3,5).contains("10"))
                    Oktober += 1.0;

                if (test_row[1].substring(3,5).contains("11"))
                    November += 1.0;

                if (test_row[1].substring(3,5).contains("12"))
                    December += 1.0;
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
        System.out.println("FIETSDIEFSTALLEN    " + Januari+ "      " + Februari+ "    " + Maart+"   " + April+ "   " + Mei+ "  " + Juni+ "  " + Juli+" " + Augustus + "  " + September + " " + Oktober +" " + November+ "   " + December);
    }



    @Override
    public void getMerken() {
        BufferedReader bReader = null;
        String line;
        String csvSplitBy = ",";

        try {
            InputStreamReader inputStream = new InputStreamReader(context.getAssets().open(fileName));
            bReader = new BufferedReader(inputStream);

            while ((line = bReader.readLine()) != null) {

                String[] test_row = line.split(csvSplitBy);
//                System.out.println("csvFile [Value= " + test_row[0] + ", Value=" + test_row[1] + ", Value=" + test_row[7] + "]");

                if (test_row[1].contains("GAZELLE"))
                    GAZELLE += 1;

                if (test_row[1].contains("BATAVUS"))
                    BATAVUS += 1.0;
                if (test_row[1].contains("PEUGEOT"))
                    PEUGEOT += 1.0;

                if (test_row[1].contains("SPARTA"))
                    SPARTA += 1.0;

                if (test_row[1].contains("GIANT"))
                    GIANT += 1.0;

                if (test_row[1].contains("UNION"))
                    UNION += 1.0;

                if (test_row[1].contains("YAMAHA"))
                    YAMAHA += 1.0;

                if (test_row[1].contains("TOMOS"))
                    TOMOS += 1.0;

                if (test_row[1].contains("PIAGGIO"))
                    PIAGGIO += 1.0;

                if (test_row[1].contains("VESPA"))
                    VESPA += 1.0;

                if (test_row[1].contains("GILERA"))
                    GILERA += 1.0;

                if (test_row[1].contains("SYM"))
                    SYM += 1.0;

                if (test_row[1].contains("POINTER"))
                    POINTER += 1.0;

                if (test_row[1].contains("ALTRA"))
                    ALTRA += 1.0;
                if (test_row[1].contains("ONBEKEND"))
                    OVERIG += 1.0;
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
        System.out.println(Noord);

    }
    @Override
    public void getColours() {
        BufferedReader bReader = null;
        String line;
        String csvSplitBy = ",";

        try {
            InputStreamReader inputStream = new InputStreamReader(context.getAssets().open(fileName));
            bReader = new BufferedReader(inputStream);

            while ((line = bReader.readLine()) != null) {

                String[] test_row = line.split(csvSplitBy);
//                System.out.println("csvFile [Value= " + test_row[0] + ", Value=" + test_row[1] + ", Value=" + test_row[7] + "]");

                if (test_row[3].contains("MEERKLEURIG"))
                    MEERKLEURIG += 1;

                if (test_row[3].contains("ONBEKEND"))
                    ONBEKEND += 1.0;

                if (test_row[3].contains("GRIJS"))
                    GRIJS += 1.0;

                if (test_row[3].contains("BLAUW"))
                    BLAUW += 1.0;

                if (test_row[3].contains("GROEN"))
                    GROEN += 1.0;

                if (test_row[3].contains("CHROOM"))
                    CHROOM += 1.0;

                if (test_row[3].contains("ZILVER"))
                    ZILVER += 1.0;

                if (test_row[3].contains("BEIGE"))
                    BEIGE += 1.0;

                if (test_row[3].contains("ROOD"))
                    ROOD += 1.0;

                if (test_row[3].contains("WIT"))
                    WIT += 1.0;

                if (test_row[3].contains("PAARS"))
                    PAARS += 1.0;

                if (test_row[3].contains("ORANJE"))
                    ORANJE += 1.0;

                if (test_row[3].contains("BRUIN"))
                    BRUIN += 1.0;
                if (test_row[3].contains("KOPER"))
                    KOPER += 1.0;
                if (test_row[3].contains("CREME"))
                    CREME += 1.0;
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
        System.out.println(Noord);
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
    public float getCrooswijk() {
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



    public float getJanuari(){
        return Januari;
    }
    public float getFebruari(){
        return Februari;
    }
    public float getMaart(){
        return Maart;
    }
    public float getApril(){
        return April;
    }
    public float getMei(){
        return Mei;
    }
    public float getJuni(){
        return Juni;
    }
    public float getJuli(){
        return Juli;
    }
    public float getAugustus(){
        return Augustus;
    }
    public float getSeptember(){
        return September;
    }
    public float getOktober(){
        return Oktober;
    }
    public float getNovember(){
        return November;
    }
    public float getDecember(){
        return December;
    }

    public  float getGAZELLE(){
        return GAZELLE;
    }
    public float getBATAVUS(){
        return BATAVUS;
    }
    public float getPEUGEOT(){
        return PEUGEOT;
    }
    public float getSPARTA(){
        return SPARTA;
    }
    public float getGIANT(){
        return GIANT;
    }
    public float getUNION(){
        return UNION;
    }
    public float getYAMAHA(){
        return YAMAHA;
    }
    public float getTOMOS(){
        return TOMOS;
    }
    public float getPIAGGIO(){
        return PIAGGIO;
    }
    public float getVESPA(){
        return VESPA;
    }
    public float getGILERA(){
        return GILERA;
    }
    public float getSYM(){
        return SYM;
    }
    public float getPOINTER(){
        return POINTER;
    }
    public float getALTRA(){
        return ALTRA;
    }
    public float getOVERIG(){
        return OVERIG;
    }

    public float getMEERKLEURIG(){ return MEERKLEURIG;}
    public float getONBEKEND(){return ONBEKEND;}
    public float getGRIJS(){return GRIJS;}
    public float getBLAUW(){return BLAUW;}
    public float getGROEN(){return GROEN;}
    public float getCHROOM(){return CHROOM;}
    public float getZILVER(){return ZILVER;}
    public float getZWART(){return ZWART;}
    public float getBEIGE(){return BEIGE;}
    public float getROOD(){return ROOD;}
    public float getWIT(){return WIT;}
    public float getPAARS(){return PAARS;}
    public float getORANJE(){return ORANJE;}
    public float getBRUIN(){return BRUIN;}
    public float getKOPER(){return KOPER;}
    public float getCREME(){return CREME;}
}







