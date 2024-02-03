package org.example;
import java.util.*;
public class Reklama {

    private String tur;
    private double xarajat;
    private Xodim xodim;
    private Date yoqilganSana;
    private Date toxtanganSana;

    public Reklama(String tur, double xarajat, Xodim xodim, Date yoqilganSana, Date toxtanganSana) {
        this.tur = tur;
        this.xarajat = xarajat;
        this.xodim = xodim;
        this.yoqilganSana = yoqilganSana;
        this.toxtanganSana = toxtanganSana;
    }

    // Getter va setter metodlari

    public String getTur() {
        return tur;
    }

    public double getXarajat() {
        return xarajat;
    }

    public Xodim getXodim() {
        return xodim;
    }

    public Date getYoqilganSana() {
        return yoqilganSana;
    }

    public Date getToxtatilganSana() {
        return getToxtatilganSana();
    }
}
