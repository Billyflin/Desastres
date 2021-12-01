package servicio;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import interfaz.CRUD;
import modelo.Desastre;

import java.io.*;
import java.util.ArrayList;


public class ServicioDesastre implements CRUD {

    private ArrayList<Desastre> desastres;
    private File archivo;

    public ServicioDesastre() {
    }

    public ServicioDesastre(String ruta) {
        this.desastres = leer(ruta);
        this.archivo = new File(ruta);
    }

    @Override
    public boolean crear() {
        if (!archivo.exists()) {
            try {
                return archivo.createNewFile();
            } catch (IOException e) {
                System.err.println(e.getMessage());
                return false;
            }
        }
        return true;
    }

    @Override
    public ArrayList<Desastre> leer(String ruta) {ArrayList<Desastre> desastres=new ArrayList<>();
        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
        CSVReaderBuilder builder = null;
        try {
            builder = new CSVReaderBuilder(new FileReader(ruta));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        double counter=0;
        try {
            assert builder != null;
            try (CSVReader reader = builder.withCSVParser(parser).withSkipLines(8).build()) {
                String[] nextLine;
                while ((nextLine = reader.readNext()) != null) {
                    counter++;
                    String disNo= nextLine[0];
                    int year;
                    try{
                        year= Integer.parseInt(nextLine[1]);
                    }catch(NumberFormatException e){
                        year=0;
                    }
                    double seq;
                    try{
                        seq= Double.parseDouble(nextLine[2]);
                    }catch(NumberFormatException e) {
                        seq = 0;
                    }
                    String glide= nextLine[3];
                    String disasterGroup= nextLine[4];
                    String disasterSubgroup= nextLine[5];
                    String disasterType= nextLine[6];
                    String disasterSubtype= nextLine[7];
                    String disasterSubsubtype= nextLine[8];
                    String eventName= nextLine[9];
                    String country= nextLine[10];
                    String ISO= nextLine[11];
                    String region= nextLine[12];
                    String continent= nextLine[13];
                    String location= nextLine[14];
                    String origin= nextLine[15];
                    String associatedDis= nextLine[16];
                    String associatedDis2= nextLine[17];
                    String OFDAResponse= nextLine[18];
                    String appeal= nextLine[19];
                    String declaration= nextLine[20];
                    String aidContribution= nextLine[21];
                    int disMagValue;
                    try {
                        disMagValue= Integer.parseInt(nextLine[22]);
                    }catch(NumberFormatException e) {
                        disMagValue=0;
                    }
                    String disMagScale= nextLine[23];
                    double latitude;
                    try{
                        latitude= Double.parseDouble(nextLine[24]);
                    }catch(NumberFormatException e){
                        latitude=0;
                    }
                    double longitude;
                    try {
                        longitude= Double.parseDouble(nextLine[25]);
                    }catch(NumberFormatException e){
                        longitude = 0;
                    }
                    String localTime= nextLine[26];
                    String riverBasin= nextLine[27];
                    int startYear;
                    try {
                        startYear = Integer.parseInt(nextLine[28]);
                    }catch(NumberFormatException e){
                        startYear=0;
                    }
                    int startMonth;
                    try {
                        startMonth= Integer.parseInt(nextLine[29]);}
                    catch(NumberFormatException e){
                        startMonth=0;
                    }
                    int startDay;
                    try{
                        startDay= Integer.parseInt(nextLine[30]);
                    }catch(NumberFormatException e){
                        startDay=0;
                    }
                    int endYear;
                    try{
                        endYear= Integer.parseInt(nextLine[31]);
                    }catch(NumberFormatException e){
                        endYear=0;
                    }
                    int endMonth;
                    try{
                        endMonth= Integer.parseInt(nextLine[32]);
                    }catch(NumberFormatException e){
                        endMonth=0;
                    }
                    int endDay;
                    try {
                        endDay = Integer.parseInt(nextLine[33]);
                    }catch(NumberFormatException e){
                        endDay=0;
                    }
                    int totalDeaths;
                    try {
                        totalDeaths = Integer.parseInt(nextLine[34]);
                    }catch(NumberFormatException e){
                        totalDeaths=0;
                    }
                    int noInjured;
                    try {
                        noInjured = Integer.parseInt(nextLine[35]);
                    }catch(NumberFormatException e){
                        noInjured=0;
                    }
                    int noAffected;
                    try {
                        noAffected = Integer.parseInt(nextLine[36]);
                    }catch(NumberFormatException e){
                        noAffected=0;
                    }
                    int noHomeless;
                    try {
                        noHomeless = Integer.parseInt(nextLine[37]);
                    }catch(NumberFormatException e){
                        noHomeless=0;
                    }
                    int totalAffected;
                    try {
                        totalAffected= Integer.parseInt(nextLine[38]);
                    }catch(NumberFormatException e) {
                        totalAffected = 0;
                    }
                    int reconstructionCosts;
                    try {
                        reconstructionCosts= Integer.parseInt(nextLine[39]);
                    }catch(NumberFormatException e) {
                        reconstructionCosts = 0;
                    }
                    int reconstructionCostsAdjusted;
                    try {
                        reconstructionCostsAdjusted= Integer.parseInt(nextLine[40]);
                    }catch(NumberFormatException e) {
                        reconstructionCostsAdjusted = 0;
                    }
                    int insuredDamages;
                    try {
                        insuredDamages= Integer.parseInt(nextLine[41]);
                    }catch(NumberFormatException e) {
                        insuredDamages = 0;
                    }
                    int insuredDamagesAdjusted;
                    try {
                        insuredDamagesAdjusted= Integer.parseInt(nextLine[42]);
                    }catch(NumberFormatException e) {
                        insuredDamagesAdjusted = 0;
                    }
                    int totalDamages;
                    try {
                        totalDamages= Integer.parseInt(nextLine[43]);
                    }catch(NumberFormatException e){
                        totalDamages=0;}

                    int totalDamagesAdjusted;
                    try {
                        totalDamagesAdjusted= Integer.parseInt(nextLine[44]);
                    }catch(NumberFormatException e){
                        totalDamagesAdjusted=0;
                    }
                    String CPI= nextLine[45];
                    String admevel= nextLine[46];
                    String admin1Code= nextLine[47];
                    String admin2Code= nextLine[48];
                    String geoLocations= nextLine[49];
                    try {
                        desastres.add(new Desastre(disNo, year, seq, glide, disasterGroup, disasterSubgroup, disasterType, disasterSubtype, disasterSubsubtype, eventName, country, ISO, region, continent, location, origin, associatedDis, associatedDis2, OFDAResponse, appeal, declaration, aidContribution,  disMagValue,  disMagScale, latitude,  longitude,  localTime,  riverBasin,  startYear, startMonth, startDay,  endYear,  endMonth, endDay, totalDeaths, noInjured, noAffected, noHomeless,  totalAffected, reconstructionCosts, reconstructionCostsAdjusted, insuredDamages, insuredDamagesAdjusted, totalDamages, totalDamagesAdjusted, CPI, admevel,  admin1Code,  admin2Code,  geoLocations ));

                    }catch(Exception e){
                        System.out.println("era esta wea");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        return desastres;

    }


    @Override
    public boolean actualizar(String nuevaData) {

        if(!archivo.exists()){
            return false;
        }
        FileWriter escritor = null;
        try {
            escritor = new FileWriter(archivo);
            escritor.write(nuevaData);
            escritor.close();
        } catch (IOException e) {
            System.err.println("Fallo al leer el archivo: " + e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public boolean borrar() {

        if (archivo.exists()) {
            return archivo.delete();
        }
        return false;
    }

    public ArrayList<Desastre> getDesastres() {
        return desastres;
    }
}
