package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Log {

    private String foydalanuvchi;
    private String amal;
    private String jadval;
    private Date vaqt;


    public Log(String foydalanuvchi, String amal, String jadval) {
        this.foydalanuvchi = foydalanuvchi;
        this.amal = amal;
        this.jadval = jadval;
        this.vaqt = new Date();
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "[" + sdf.format(vaqt) + "] " + foydalanuvchi + " - " + amal + " - " + jadval;
    }
}

// Log fayli klassi
class LogFayl {
    private String faylNomi;

    public LogFayl(String faylNomi) {
        this.faylNomi = faylNomi;
    }

    public void logYozish(Log log) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(faylNomi, true))) {
            pw.println(log.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
