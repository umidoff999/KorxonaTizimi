package org.example;

import java.util.ArrayList;
import java.util.List;
public class XodimlarBoshqarish {

    private List<Xodimlar> xodimlar = new ArrayList<>();

    // Xodim qo'shish, o'zgartirish, o'chirish, ma'lumotlarni ko'rish metodlari

    public void xodimQoshish(Xodimlar xodim) {
            xodimlar.add(xodim);
}

    public List<Xodimlar> getXodimlar() {
        return xodimlar;
    }
}
