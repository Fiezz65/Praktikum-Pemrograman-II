package Modul1;

import java.util.Scanner;

public class PRAK101_2410817210027_HafizPerdana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String name = sc.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String birthPlace = sc.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int birthDate = sc.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int birthMonth = sc.nextInt();
        sc.nextLine();

        String monthName = switch (birthMonth) {
            case 1 -> "Januari";
            case 2 -> "Februari";
            case 3 -> "Maret";
            case 4 -> "April";
            case 5 -> "Mei";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "Agustus";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "November";
            case 12 -> "Desember";
            default -> "Bulan tidak valid";
        };

        System.out.print("Masukkan Tahun Lahir: ");
        int birthYear = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan Tinggi Badan: ");
        String height = sc.nextLine();

        System.out.print("Masukkan Berat Badan: ");
        String weight = sc.nextLine();

        System.out.print("\nNama Lengkap " + name + ", Lahir di " + birthPlace + " pada Tanggal " + birthDate + " " + monthName + " " + birthYear + "\nTinggi Badan " + height + " cm dan Berat Badan " + weight + " kilogram");
    }
}