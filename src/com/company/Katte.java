
package com.company;

import java.util.Objects;

public class Katte {
    static int idcounter=0;
    int katteID;
    String catNames;
    String catBreeds;

    public Katte(int id, String catBreeds, String katnames) {
        this.katteID = id;
        this.catBreeds = catBreeds;
        this.catNames = katnames;
    }

    public static int getIdcounter() {
        return idcounter;
    }

    public int getKatteID() {
        return katteID;
    }

    public String getCatNames() {
        return catNames;
    }

    public String getCatBreeds() {
        return catBreeds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Katte katte = (Katte) o;
        return katteID == katte.katteID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(katteID);
    }

    @Override
    public String toString() {
        return "Katte: " +
                "ID#" + katteID +
                ", Navn: '" + catNames + '\'' +
                ", Breed: " + catBreeds + '\'' +
                '}';
    }
}

