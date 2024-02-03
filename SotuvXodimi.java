package org.example;
import java.util.ArrayList;
import java.util.List;
public class SotuvXodimi {

    private String ismi;
    private String familiyasi;
    private String reklamaTuri;
    private double reklamaXarajati;
    private int reklamaMuddati;
    private String reklamaBoshlanishi;
    private String reklamaKiritganXodim;

    public SotuvXodimi(String ismi, String familiyasi, String reklamaTuri, double reklamaXarajati,
                       int reklamaMuddati, String reklamaBoshlanishi, String reklamaKiritganXodim) {
        this.ismi = ismi;
        this.familiyasi = familiyasi;
        this.reklamaTuri = reklamaTuri;
        this.reklamaXarajati = reklamaXarajati;
        this.reklamaMuddati = reklamaMuddati;
        this.reklamaBoshlanishi = reklamaBoshlanishi;
        this.reklamaKiritganXodim = reklamaKiritganXodim;
    }

    // Getter va setter metodlari

    public String getIsmi() {
        return ismi;
    }

    public String getFamiliyasi() {
        return familiyasi;
    }

    public String getReklamaTuri() {
        return reklamaTuri;
    }
}
