package org.example;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Mijoz {

    private String ismi;
    private String familiyasi;
    private String passportSeriya;
    private String passportRaqam;
    private String JSHSHIR;
    private String yashashManzili;
    private String sanaVaqt;

    public Mijoz(String ismi, String familiyasi, String passportSeriya, String passportRaqam,
                 String JSHSHIR, String yashashManzili, String sanaVaqt) {
        this.ismi = ismi;
        this.familiyasi = familiyasi;
        this.passportSeriya = passportSeriya;
        this.passportRaqam = passportRaqam;
        this.JSHSHIR = JSHSHIR;
        this.yashashManzili = yashashManzili;
        this.sanaVaqt = sanaVaqt;
    }

    // Getter va setter metodlari

    public String getIsmi() {
        return ismi;
    }

    public String getFamiliyasi() {
        return familiyasi;
    }

    public void YashashManzili(String yangiManzil) {
    }


    private Date royxatdanOtkazilganSana;

    public Mijoz(String ismi, String familiyasi, Date royxatdanOtkazilganSana) {
        this.ismi = ismi;
        this.familiyasi = familiyasi;
        this.royxatdanOtkazilganSana = royxatdanOtkazilganSana;
    }

    public Date getRoyxatdanOtkazilganSana() {
        return royxatdanOtkazilganSana;
    }
}
