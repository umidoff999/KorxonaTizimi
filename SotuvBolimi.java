package org.example;
import java.util.ArrayList;
import java.util.List;
public class SotuvBolimi {

    private List<SotuvXodimi> sotuvXodimlari = new ArrayList<>();

    public void xodimniRoyxatdanOtkazish(SotuvXodimi xodim) {
        sotuvXodimlari.add(xodim);
    }

    public List<SotuvXodimi> getSotuvXodimlari() {
        return sotuvXodimlari;
    }

    public List<SotuvXodimi> sahifalabOlish(int sahifa, int elementlarSoni) {
        int boshlanishi = (sahifa - 1) * elementlarSoni;
        int oxirgi = Math.min(boshlanishi + elementlarSoni, sotuvXodimlari.size());
        return sotuvXodimlari.subList(boshlanishi, oxirgi);
    }


    private List<Reklama> reklamalar;
    private List<Xodim> xodimlar;

    public SotuvBolimi() {
        this.reklamalar = new ArrayList<>();
        this.xodimlar = new ArrayList<>();
    }

    public void reklamaniQoshish(Reklama reklama) {
            reklamalar.add(reklama);
    Xodim xodim = reklama.getXodim();
        if (!xodimlar.contains(xodim)) {
        xodimlar.add(xodim);
    }
}

    public List<Reklama> getReklamalar() {
        return reklamalar;
    }

    public List<Xodim> getXodimlar() {
        return xodimlar;
    }
}
