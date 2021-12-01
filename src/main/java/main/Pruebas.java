package main;

import static main.Listas.*;

public class Pruebas {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(getDisasterType(getDisasterByCountry("Chile"),"Earthquake"));
        System.out.println(getDisasterTypebyDate(getDisasterByCountry("Chile"),"Earthquake",2010));

    }
}
