package org.example;
import java.util.ArrayList;
import java.util.List;
public class Hodim {

    private String ismi;
    private int yoshi;
    private double maosh;

    public Hodim(String ismi, int yoshi, double maosh) {
        this.ismi = ismi;
        this.yoshi = yoshi;
        this.maosh = maosh;
    }

    // Getter va setter metodlari

    public String getIsmi() {
        return ismi;
    }

    public int getYoshi() {
        return yoshi;
    }

    public double getMaosh() {
        return maosh;
    }
}
