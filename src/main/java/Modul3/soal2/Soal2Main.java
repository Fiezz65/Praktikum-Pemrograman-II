package Modul3.soal2;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.HashMap;

public class Soal2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Negara> countryList = new LinkedList<>();
        HashMap<Integer, String> monthName = new HashMap<>();

        monthName.put(1, "Januari");
        monthName.put(2, "Februari");
        monthName.put(3, "Maret");
        monthName.put(4, "April");
        monthName.put(5, "Mei");
        monthName.put(6, "Juni");
        monthName.put(7, "Juli");
        monthName.put(8, "Agustus");
        monthName.put(9, "September");
        monthName.put(10, "Oktober");
        monthName.put(11, "November");
        monthName.put(12, "Desember");

        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            String countryName = sc.nextLine();
            String governmentType = sc.nextLine();
            String leaderName = sc.nextLine();

            if (governmentType.equals("monarki")) {
                Negara country = new Negara(countryName, governmentType, leaderName);
                countryList.add(country);
            } else {
                int date = sc.nextInt();
                int month = sc.nextInt();
                int year = sc.nextInt();
                sc.nextLine();
                Negara country = new Negara(countryName, governmentType, leaderName, date, month, year);
                countryList.add(country);
            }
        }

        for (int i = 0; i < countryList.size(); i++) {
            Negara country = countryList.get(i);
            country.display(monthName);
        }

        sc.close();
    }
}