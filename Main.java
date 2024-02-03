package org.example;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        XodimlarBoshqarish xodimlarBoshqarish = new XodimlarBoshqarish();

        Xodimlar xodim1 = new Xodimlar("Ismi1", "Familiyasi1", "Sharifi1", 25, "AB", "1234567", "JSH123456", "Uzbek", 1500.0, "Toshkent", "Boshqarish");
        Xodimlar xodim2 = new Xodimlar("Ismi2", "Familiyasi2", "Sharifi2", 30, "CD", "7654321", "JSH987654", "Uzbek", 2000.0, "Samarqand", "Moliya");
        Xodimlar xodim3 = new Xodimlar("Ismi3", "Familiyasi3","Sharifi3",25,"AA","6330012","JSH987589","o'zbek",4000000.0,"Toshkent","Moliya");

        xodimlarBoshqarish.xodimQoshish(xodim1);
        xodimlarBoshqarish.xodimQoshish(xodim2);
        xodimlarBoshqarish.xodimQoshish(xodim3);

        Lavozim direktor = new Lavozim("Direktor");
        Lavozim boLimBoshligi = new Lavozim("Bo'lim boshlig'i");
        Lavozim xodimLavozimi = new Lavozim("Xodim");

        // Xodimlar
        Xodim direktorXodimi = new Xodim("Ismi1", "Familiyasi1", 40, direktor);
        Xodim boLimBoshligiXodimi = new Xodim("Ismi2", "Familiyasi2", 35, boLimBoshligi);
        Xodim xodimXodimi = new Xodim("Ismi3", "Familiyasi3", 25, xodimLavozimi);

        // Test qilish
        System.out.println(direktorXodimi.getIsmi() + " - " + direktorXodimi.getLavozim().getNomi());
        System.out.println(boLimBoshligiXodimi.getIsmi() + " - " + boLimBoshligiXodimi.getLavozim().getNomi());
        System.out.println(xodimXodimi.getIsmi() + " - " + xodimXodimi.getLavozim().getNomi());


        MijozlarBoshqarish mijozlarBoshqarish = new MijozlarBoshqarish();

        // Mijoz qo'shish
        Mijoz mijoz1 = new Mijoz("John", "Doe", "AB", "123456", "JSH123456", "New York", "2022-02-03 15:30");
        mijozlarBoshqarish.mijozniRoyxatdanOtkazish(mijoz1);

        // Mijozni tahrirlash
        mijozlarBoshqarish.mijozniTahrirlash("John", "Doe", "Los Angeles");

        // Mijoz haqida batafsil ma'lumot olish
        Mijoz batafsilMijoz = mijozlarBoshqarish.mijozniBatafsilOlish("John", "Doe");
        if (batafsilMijoz != null) {
            System.out.println("Mijoz haqida ma'lumotlar: " + batafsilMijoz.toString());
        } else {
            System.out.println("Mijoz topilmadi");
        }


        SotuvBolimi sotuvBolimi = new SotuvBolimi();

        // Xodim qo'shish
        SotuvXodimi sotuvXodimi1 = new SotuvXodimi("Ismi1", "Familiyasi1", "Instagram ads", 500.0, 30, "2022-02-03 15:30", "Xodim1");
        SotuvXodimi sotuvXodimi2 = new SotuvXodimi("Ismi2", "Familiyasi2", "Google ads", 800.0, 45, "2022-02-03 18:00", "Xodim2");

        sotuvBolimi.xodimniRoyxatdanOtkazish(sotuvXodimi1);
        sotuvBolimi.xodimniRoyxatdanOtkazish(sotuvXodimi2);

        // Sahifalab olish
        int sahifa = 1;
        int elementlarSoni = 1;
        List<SotuvXodimi> sahifadagiXodimlar = sotuvBolimi.sahifalabOlish(sahifa, elementlarSoni);
        for (SotuvXodimi xodim : sahifadagiXodimlar) {
            System.out.println("Xodim: " + xodim.getIsmi() + " - " + xodim.getReklamaTuri());
        }


        Korxona korxona = new Korxona();

        // Bo'limlar yaratish
        Bolim bolim1 = new Bolim("Bolim 1");
        Bolim bolim2 = new Bolim("Bolim 2");

        // Hodimlar yaratish va bo'limga qo'shish
        Hodim hodim1 = new Hodim("Hodim 1", 30, 500.0);
        Hodim hodim2 = new Hodim("Hodim 2", 25, 600.0);
        Hodim hodim3 = new Hodim("Hodim 3", 35, 700.0);

        bolim1.hodimniQoshish(hodim1);
        bolim1.hodimniQoshish(hodim2);
        bolim2.hodimniQoshish(hodim3);

        // Bo'limlarni korxonaga qo'shish
        korxona.bolimniQoshish(bolim1);
        korxona.bolimniQoshish(bolim2);

        // Statistikalar
        System.out.println("Bo'limlar kesimida xodimlar soni:");
        for (Bolim bolim : korxona.getBolimlar()) {
        int xodimlarSoni = bolim.getHodimlar().size();
        System.out.println(bolim.getNomi() + " - " + xodimlarSoni + " xodim (" + (xodimlarSoni * 100.0 / korxona.getBolimlar().size()) + "%)");
    }

        System.out.println("\nXodimlarni yosh bo'yicha filterlash:");
        for (Bolim bolim : korxona.getBolimlar()) {
            System.out.println(bolim.getNomi() + ":");
            for (Hodim hodim : bolim.getHodimlar()) {
            if (hodim.getYoshi() < 30) {
        System.out.println(hodim.getIsmi() + " - " + hodim.getYoshi() + " yosh");
    }
}
        }

                System.out.println("\nBarcha hodimlar jadvalini pagination bilan chiqarish:");
                for (Bolim bolim : korxona.getBolimlar()) {
                System.out.println(bolim.getNomi() + ":");
                List<Hodim> hodimlar = bolim.getHodimlar();
        for (int i = 0; i < hodimlar.size(); i++) {
        System.out.println((i + 1) + ". " + hodimlar.get(i).getIsmi() + " - " + hodimlar.get(i).getYoshi() + " yosh");
        }
        }

        System.out.println("\nXodimlarni maoshlarining umumiy summalarini topish:");
        for (Bolim bolim : korxona.getBolimlar()) {
        double umumiyMaosh = 0.0;
        for (Hodim hodim : bolim.getHodimlar()) {
        umumiyMaosh += hodim.getMaosh();
        }
        System.out.println(bolim.getNomi() + " - Umumiy maosh: " + umumiyMaosh);
        }


        IshlashBolimi ishlashBolimi = new IshlashBolimi();

        // Xodimlar yaratish
        Xodim xodimBir = new Xodim("Xodim 1");
        Xodim xodimIkki = new Xodim("Xodim 2");
        Xodim xodimUch = new Xodim("Xodim 3");

        ishlashBolimi.xodimniQoshish(xodimBir);
        ishlashBolimi.xodimniQoshish(xodimIkki);
        ishlashBolimi.xodimniQoshish(xodimUch);

        // Mijozlar yaratish
        Mijoz mijozBir = new Mijoz("Mijoz 1", "Familiya 1", new Date());
        Mijoz mijozIkki = new Mijoz("Mijoz 2", "Familiya 2", new Date());
        Mijoz mijozUch = new Mijoz("Mijoz 3", "Familiya 3", new Date());

        xodim1.mijozniRoyxatdanOtkazish();
        xodim2.mijozniRoyxatdanOtkazish();
        xodim2.mijozniRoyxatdanOtkazish();
        xodim3.mijozniRoyxatdanOtkazish();

        // Statistikalar
        System.out.println("Kunlik ro’yxatdan o’tgan mijozlar soni: " + ishlashBolimi.getXodimlar().stream().mapToInt(Xodim::getMijozlarSoni).sum());

        System.out.println("Xodimlarning mijozlar soniga ko'ra teskari tartibi:");
        ishlashBolimi.getXodimlar().stream()
                .sorted(Comparator.comparingInt(Xodim::getMijozlarSoni).reversed())
                .forEach(xodim -> System.out.println(xodim.getIsmi() + " - " + xodim.getMijozlarSoni() + " mijoz"));

        System.out.println("Eng ko’p mijoz ro’yxatdan o’tkazgan top 3 xodim:");
        ishlashBolimi.getXodimlar().stream()
                .sorted(Comparator.comparingInt(Xodim::getMijozlarSoni).reversed())
                .limit(3)
                .forEach(xodim -> System.out.println(xodim.getIsmi() + " - " + xodim.getMijozlarSoni() + " mijoz"));


        SotuvBolimi sotuvBolim = new SotuvBolimi();


        // Reklamalar yaratish
        Reklama reklama1 = new Reklama("Reklama tur 1", 1000.0, xodimBir, new Date(), new Date());
        Reklama reklama2 = new Reklama("Reklama tur 2", 1500.0, xodimIkki, new Date(), new Date());
        Reklama reklama3 = new Reklama("Reklama tur 1", 800.0, xodimIkki, new Date(), new Date());
        Reklama reklama4 = new Reklama("Reklama tur 3", 1200.0, xodimIkki, new Date(), new Date());

        // Reklamalarni sotuv bo'limiga qo'shish
        sotuvBolimi.reklamaniQoshish(reklama1);
        sotuvBolimi.reklamaniQoshish(reklama2);
        sotuvBolimi.reklamaniQoshish(reklama3);
        sotuvBolimi.reklamaniQoshish(reklama4);

        // Statistikalar
        System.out.println("Eng ko’p reklama xarajatlari qaysi reklama turiga mansub?");
        Map<String, Double> reklamaTurXarajatlari = new HashMap<>();
        for (Reklama reklama : sotuvBolimi.getReklamalar()) {
            reklamaTurXarajatlari.merge(reklama.getTur(), reklama.getXarajat(), Double::sum);
        }
        String engKopXarajatliTur = Collections.max(reklamaTurXarajatlari.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(engKopXarajatliTur);

        System.out.println("\nQaysi xodim eng ko’p reklama xarajatlarini kiritgan?");
        Map<Xodim, Double> xodimlarXarajatlari = new HashMap<>();
        for (Reklama reklama : sotuvBolimi.getReklamalar()) {
            xodimlarXarajatlari.merge(reklama.getXodim(), reklama.getXarajat(), Double::sum);
        }
        Xodim engKopXarajatKiritganXodim = Collections.max(xodimlarXarajatlari.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(engKopXarajatKiritganXodim.getIsmi());


        // Tizim xavfsizlik qismlarini yaratish
        TizimXavfsizlik tizimXavfsizlik = new TizimXavfsizlik();

        // Xodimlarga imkoniyatlar taqsimlash
        tizimXavfsizlik.lavozimgaImkoniyatQoshish("Direktor", Set.of("Barcha amallar", "Maxfiylik"));
        tizimXavfsizlik.lavozimgaImkoniyatQoshish("Bo'lim boshlig'i", Set.of("Barcha bo'lim amallari", "Maxfiylik"));
        tizimXavfsizlik.lavozimgaImkoniyatQoshish("Xodim", Set.of("Mijoz ma'lumotlarini ko'rish", "Hisobni o'zgartirish"));

        // Imkoniyat boshqaruvchisini yaratish
        ImkoniyatBoshqaruvchi imkoniyatBoshqaruvchi = new ImkoniyatBoshqaruvchiImpl(tizimXavfsizlik);

        // Amallarni bajaramiz
        amalBajaramiz(imkoniyatBoshqaruvchi, xodimBir, "Barcha amallar");
        amalBajaramiz(imkoniyatBoshqaruvchi, xodimIkki, "Maxfiylik");
        amalBajaramiz(imkoniyatBoshqaruvchi, xodimUch, "Mijoz ma'lumotlarini ko'rish");

        // ...
    }

    public static void amalBajaramiz(ImkoniyatBoshqaruvchi imkoniyatBoshqaruvchi, Xodim xodim, String amal) {
        if (imkoniyatBoshqaruvchi.bajarishRuxsati(xodim.getLavozimi(), amal)) {
            System.out.println(xodim.getLavozimi() + " " + amal + " amalini bajara oladi.");
        } else {
            imkoniyatBoshqaruvchi.ruxsatsizAmalniBajarishHaqidaXabarYuborish(xodim.getLavozimi(), amal);
        }


        // Log fayli yaratish
        LogFayl logFayl = new LogFayl("tizim_log.txt");

        // Tizimni boshqarish uchun Tizim klassini yaratish
        Tizim tizim = new Tizim(logFayl);

        // Amalni bajarish
        tizim.amalBajaraOlish("foydalanuvchi1", "Amal1", "Jadval1");
        tizim.amalBajaraOlish("foydalanuvchi2", "Amal2", "Jadval2");

    }
}