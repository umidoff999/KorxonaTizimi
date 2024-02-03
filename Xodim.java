package org.example;

public class Xodim {

    private String ismi;
    private String familiyasi;
    private int yoshi;
    private Lavozim lavozim;

    public Xodim(String ismi, String familiyasi, int yoshi, Lavozim lavozim) {
        this.ismi = ismi;
        this.familiyasi = familiyasi;
        this.yoshi = yoshi;
        this.lavozim = lavozim;
    }


    public String getIsmi() {
        return ismi;
    }

    public String getFamiliyasi() {
        return familiyasi;
    }

    public int getYoshi() {
        return yoshi;
    }

    public Lavozim getLavozim() {
        return lavozim;
    }

    private int mijozlarSoni;

    public Xodim(String ismi) {
        this.ismi = ismi;
        this.mijozlarSoni = 0;
    }

    public int getMijozlarSoni() {
        return mijozlarSoni;
    }

    public void mijozniRoyxatdanOtkazish() {
        mijozlarSoni++;
    }


    public String getLavozimi() {
        return ismi;
    }
}
