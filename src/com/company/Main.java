package com.company;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        CatPrison catP = new CatPrison();
        catP.KattePrision("GangLand");


        String filepath = "Data/Cats.cvs";
ReadFiles newcats = new ReadFiles();

	Katte nykat2 = new Katte(0,"American Bobtail","Abba");
        catP.AddKatteToPrison(nykat2);
        newcats.ImportFiles(filepath);
        printCats();

    }
    private static void printCats(){

        }


    }



