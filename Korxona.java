package org.example;
import java.util.ArrayList;
import java.util.List;
public class Korxona {

    private List<Bolim> bolimlar;

    public Korxona() {
        this.bolimlar = new ArrayList<>();
    }

    public void bolimniQoshish(Bolim bolim) {
        bolimlar.add(bolim);
    }

    public List<Bolim> getBolimlar() {
        return bolimlar;
    }

}
