package Modul4.soal2;

import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama hewan peliharaan: ");
        String name = sc.nextLine();
        System.out.print("Ras: ");
        String breed = sc.nextLine();
        sc.close();

        HewanPeliharaan pet = new HewanPeliharaan(name, breed);
        pet.display();
    }
}