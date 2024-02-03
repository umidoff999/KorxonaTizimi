package org.example;

public class Xodimlar {

    private String ismi;
    private String familiyasi;
    private String sharifi;
    private int yoshi;
    private String passportSeriya;
    private String passportRaqam;
    private String JSHSHIR;
    private String millati;
    private double ishHaqi;
    private String yashashManzili;
    private String boLimi;

    // Konstruktor va getter/setter metodlari

    public Xodimlar(String ismi, String familiyasi, String sharifi, int yoshi, String passportSeriya,
                    String passportRaqam, String JSHSHIR, String millati, double ishHaqi, String yashashManzili, String boLimi) {
        this.ismi = ismi;
        this.familiyasi = familiyasi;
        this.sharifi = sharifi;
        this.yoshi = yoshi;
        this.passportSeriya = passportSeriya;
        this.passportRaqam = passportRaqam;
        this.JSHSHIR = JSHSHIR;
        this.millati = millati;
        this.ishHaqi = ishHaqi;
        this.yashashManzili = yashashManzili;
        this.boLimi = boLimi;
    }

    public void mijozniRoyxatdanOtkazish() {
    }
}
