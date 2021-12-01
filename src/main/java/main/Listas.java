package main;

import modelo.Desastre;
import servicio.ServicioDesastre;

import java.util.ArrayList;
import java.util.Collections;

public class Listas {
    public Listas() {
    }

    public static final String RUTA_DB= "src/main/resources/emdat_public_2021_11_30_query_uid-3KlQWY - emdat data.csv";
    public static ArrayList<Desastre> desastres=new ServicioDesastre().leer(RUTA_DB);
    public static ArrayList<String> listDisasterType(){
        ArrayList<String> listaDesastres=new ArrayList<>();
        for (Desastre d:desastres
        ) {
            if(!listaDesastres.contains(d.getDisasterType())){
                listaDesastres.add(d.getDisasterType());
            }
        }
        return listaDesastres;
    }
    public static ArrayList<String> listDisasterSubtype(){
        ArrayList<String> listaSubDesastres=new ArrayList<>();
        for (Desastre d:desastres
        ) {
            if(!listaSubDesastres.contains(d.getDisasterSubtype())){
                listaSubDesastres.add(d.getDisasterSubtype());
            }
        }
        return listaSubDesastres;
    }
    public static ArrayList<String> listCountry(){
        ArrayList<String> listaCountry = new ArrayList<>();
        for (Desastre d:desastres
             ) {
            if(!listaCountry.contains(d.getCountry())){
                listaCountry.add(d.getCountry());
            }
        }
        return listaCountry;
    }
    public static ArrayList<String> listDisasterGroup(){
        ArrayList<String> listaDesastresGrupo=new ArrayList<>();
        for (Desastre d:desastres
        ) {
            if(!listaDesastresGrupo.contains(d.getDisasterGroup())){
                listaDesastresGrupo.add(d.getDisasterGroup());
            }
        }
        return listaDesastresGrupo;
    }
    public static ArrayList<String> listDisasterSubgroup(){
        ArrayList<String> listaDisasterSubgroup = new ArrayList<>();
        for (Desastre d:desastres
        ) {
            if(!listaDisasterSubgroup.contains(d.getDisasterSubgroup())){
                listaDisasterSubgroup.add(d.getDisasterSubgroup());
            }
        }
        return listaDisasterSubgroup;
    }
    public int totalDamageAdjustedbyCountry(String country,Integer year){
        int realDamage=0;
        for (Desastre d:desastres
             ) {
            if(d.getCountry().equalsIgnoreCase(country)&&d.getYear()==year){
                realDamage=realDamage+d.getTotalDamagesAdjusted();
            }
        }
        return realDamage;
    }
    public int insuredDamageAdjustedCountry(String country,Integer year){
        int realInsuredAdjustedDamage=0;
        for (Desastre d:desastres
        ) {
            if(d.getCountry().equalsIgnoreCase(country)&&d.getYear()==year){
                realInsuredAdjustedDamage=realInsuredAdjustedDamage+d.getInsuredDamagesAdjusted();
            }
        }
        return realInsuredAdjustedDamage;
    }
    public int ReconstructionbyCountry(String country,Integer year){
        int reconstructionbyCountry=0;
        for (Desastre d:desastres
        ) {
            System.out.println(d.getCountry()+country);
            System.out.println(year);
            System.out.println(d.getYear());
            if(d.getCountry().equalsIgnoreCase(country)&&d.getYear()==year){
                System.out.println(d.getReconstructionCostsAdjusted());
            }
        }
        return reconstructionbyCountry;
    }
    public static ArrayList<Integer> CountryYearList(String country){
        ArrayList<Integer> yearList= new ArrayList<>();
        for (Desastre d:desastres
        ) {
            if(d.getCountry().equalsIgnoreCase(country)){
                if(!yearList.contains(d.getYear())){
                    yearList.add(d.getYear());
                }
            }
        }
        return yearList;
    }
    public static ArrayList<Desastre> getDisasterByCountry(String country){
        ArrayList<Desastre> listaDesastres=new ArrayList<>();
        for (Desastre d:desastres
        ) {
            if((d.getCountry().equalsIgnoreCase(country))){
                listaDesastres.add(d);
            }
        }
        return listaDesastres;
    }

    public static ArrayList<Desastre> getDisasterType(ArrayList<Desastre> desastres,String disasterType){
        ArrayList<Desastre> listaDesastres=new ArrayList<>();
        for (Desastre d:desastres) {
                if(d.getDisasterType().equalsIgnoreCase(disasterType)){
                    listaDesastres.add(d);
            }
        }
        return listaDesastres;
    }

    public static ArrayList<Desastre> getDisasterTypebyDate(ArrayList<Desastre> desastres,String disasterType,Integer date){
        ArrayList<Desastre> listaDesastres=new ArrayList<>();
        for (Desastre d:desastres
        ) {
            if(d.getDisasterType().equalsIgnoreCase(disasterType)&& d.getYear()==date){
                listaDesastres.add(d);
            }
        }
        return listaDesastres;
    }
    public static ArrayList<Desastre> getDisasterlocation(ArrayList<Desastre> desastres,String disasterType,String location) {
        ArrayList<Desastre> locaciondesastre = new ArrayList<>();
        for (Desastre d : desastres
        ) {
            if (d.getDisasterType().equalsIgnoreCase(disasterType) && d.getLocation().equals(location)) {
                locaciondesastre.add(d);
            }
        }
        return locaciondesastre;
    }

}
