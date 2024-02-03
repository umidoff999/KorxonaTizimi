package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TizimXavfsizlik {

    private Map<String, Set<String>> lavozimImkoniyatlar;

    public TizimXavfsizlik() {
        this.lavozimImkoniyatlar = new HashMap<>();
    }

    public void lavozimgaImkoniyatQoshish(String lavozim, Set<String> imkoniyatlar) {
        lavozimImkoniyatlar.put(lavozim, imkoniyatlar);
    }

    public Set<String> lavozimgaImkoniyatlar(String lavozim) {
        return lavozimImkoniyatlar.getOrDefault(lavozim, Collections.emptySet());
    }

    // Boshqa metodlar
}

// Boshqa klasslar va interfeyslar

// Lavozim bo'yicha boshqa turli imkoniyatlarni boshqarish
interface ImkoniyatBoshqaruvchi {
    boolean bajarishRuxsati(String lavozim, String amal);
    void ruxsatsizAmalniBajarishHaqidaXabarYuborish(String lavozim, String amal);
}

class ImkoniyatBoshqaruvchiImpl implements ImkoniyatBoshqaruvchi {
    private TizimXavfsizlik tizimXavfsizlik;

    public ImkoniyatBoshqaruvchiImpl(TizimXavfsizlik tizimXavfsizlik) {
        this.tizimXavfsizlik = tizimXavfsizlik;
    }

    @Override
    public boolean bajarishRuxsati(String lavozim, String amal) {
        Set<String> lavozimImkoniyatlar = tizimXavfsizlik.lavozimgaImkoniyatlar(lavozim);
        return lavozimImkoniyatlar.contains(amal);
    }

    @Override
    public void ruxsatsizAmalniBajarishHaqidaXabarYuborish(String lavozim, String amal) {
        System.out.println("Diqqat! " + lavozim + " lavozimiga " + amal + " amalini bajara olishingiz mumkin emas!");

    }
}
