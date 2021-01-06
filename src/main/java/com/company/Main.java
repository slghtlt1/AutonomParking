package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String arg[]){
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Numar de inmatriculare");
            String nrInmatriculare = s.next();
            System.out.println("Data si ora la care ai intrat");
            LocalDate dataIntrare = LocalDate.now();
            LocalTime oraIntrare = LocalTime.now();
            System.out.println(dataIntrare + " " + oraIntrare);
            AdaugareMasina.AdaugareMasina(nrInmatriculare, dataIntrare, oraIntrare);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
