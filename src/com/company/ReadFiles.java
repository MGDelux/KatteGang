package com.company;

import java.io.*;
import java.util.Scanner;

public class ReadFiles {

public int ImportFiles(String filepath) throws FileNotFoundException  {
    CatPrison kitty = new CatPrison();
    int nrofcats  = 0;
    File fh = new File(filepath);
    String lne = "";
    if (fh.exists()) {
        Scanner ms = new Scanner(fh);
        while (ms.hasNextLine()) {
            lne = ms.nextLine();
            String[] lineArr = lne.split(",");
            Katte tempkat = new Katte(Integer.parseInt(lineArr[0]),lineArr[1],lineArr[2]);
            kitty.AddKatteToPrison(tempkat);
            nrofcats++;
        }
    }else {
        throw new FileNotFoundException();
    }
    return nrofcats;
}
}
