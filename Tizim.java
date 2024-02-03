package org.example;

public class Tizim {

    private LogFayl logFayl;

    public Tizim(LogFayl logFayl) {
        this.logFayl = logFayl;
    }

    public void amalBajaraOlish(String foydalanuvchi, String amal, String jadval) {
        // Amalni bajarish
        // ...

        // Logni yaratish va yozish
        Log log = new Log(foydalanuvchi, amal, jadval);
        logFayl.logYozish(log);
    }
}
