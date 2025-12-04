package Modul4.soal3;

import java.util.Scanner;

public class Soal3Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");

        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            System.out.print("Nama hewan peliharaan: ");
            String name = sc.nextLine();
            System.out.print("Ras: ");
            String breed = sc.nextLine();
            System.out.print("Warna Bulu: ");
            String furColor = sc.nextLine();
            Kucing cat = new Kucing(name, breed, furColor);
            cat.display();
        } else if (choice == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String name = sc.nextLine();
            System.out.print("Ras: ");
            String breed = sc.nextLine();
            System.out.print("Warna Bulu: ");
            String furColor = sc.nextLine();
            System.out.print("Kemampuan: ");
            String ability = sc.nextLine();
            Anjing dog = new Anjing(name, breed, furColor, ability);
            dog.display();
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        sc.close();
    }
}