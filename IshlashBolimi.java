package org.example;

import java.util.ArrayList;
import java.util.List;

public class IshlashBolimi {

    private List<Xodim> xodimlar;

    public IshlashBolimi() {
        this.xodimlar = new ArrayList<>();
    }

    public void xodimniQoshish(Xodim xodim) {
            xodimlar.add(xodim);
}

    public List<Xodim> getXodimlar() {
        return xodimlar;
    }

}
