package org.example;
import java.util.ArrayList;
import java.util.List;
public class MijozlarBoshqarish {

    private List<Mijoz> mijozlar = new ArrayList<>();

    public void mijozniRoyxatdanOtkazish(Mijoz mijoz) {
        mijozlar.add(mijoz);
    }

    public List<Mijoz> getMijozlar() {
        return mijozlar;
    }

    public Mijoz mijozniBatafsilOlish(String ismi, String familiyasi) {
        for (Mijoz mijoz : mijozlar) {
            if (mijoz.getIsmi().equals(ismi) && mijoz.getFamiliyasi().equals(familiyasi)) {
                return mijoz;
            }
        }
        return null;
    }

    public void mijozniTahrirlash(String ismi, String familiyasi, String yangiManzil) {
        for (Mijoz mijoz : mijozlar) {
            if (mijoz.getIsmi().equals(ismi) && mijoz.getFamiliyasi().equals(familiyasi)) {
                mijoz.YashashManzili(yangiManzil);
            }
        }
    }

}
