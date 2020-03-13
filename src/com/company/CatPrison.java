package com.company;

import java.util.ArrayList;

public class CatPrison {
    static int prisionId;
    int instpriosnid;
    String prisionname;
   public ArrayList<Katte> katte = new ArrayList<>();


    public void KattePrision(String name){
         this.prisionname=name;
         this.instpriosnid=prisionId;
         instpriosnid++;
     }
     public void AddKatteToPrison(Katte kat){
         if(katte.contains(kat)){
             System.out.println("Kat already registered "+ kat.getCatNames());

         }
         else {
             katte.add(kat);
             System.out.println("kat added "+kat);
         }

     }

}
