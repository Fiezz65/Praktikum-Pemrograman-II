package Modul3.soal2;

import java.util.HashMap;

public class Negara {
    private String name;
    private String governemntType;
    private String leaderName;
    private int date;
    private int month;
    private int year;

    public Negara(String name, String governmentType, String leaderName, int date, int month, int year) {
        this.name = name;
        this.governemntType = governmentType;
        this.leaderName = leaderName;
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public Negara(String name, String governemntType, String leaderName) {
        this(name, governemntType, leaderName, 0, 0, 0);
    }

    public void display(HashMap<Integer, String> monthName) {
        if (governemntType.equalsIgnoreCase("monarki")) {
            System.out.println("Negara " + name + " mempunyai Raja bernama " + leaderName);
        } else {
            System.out.println("Negara " + name + " mempunyai " + governemntType + " bernama " + leaderName);
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + date + " " + monthName.get(month) + " " + year);
        }
        System.out.println();
    }
}