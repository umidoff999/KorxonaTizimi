package org.example;
import java.util.ArrayList;
import java.util.List;
public class Bolim {

    private String nomi;
    private List<Hodim> hodimlar;

    public Bolim(String nomi) {
            this.nomi = nomi;
        this.hodimlar = new ArrayList<>();
}

    public void hodimniQoshish(Hodim hodim) {
        hodimlar.add(hodim);
        }

public List<Hodim> getHodimlar() {
        return hodimlar;
        }

    public String getNomi() {
        return "Natija";
    }
}
