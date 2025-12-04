package Modul3.soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Soal3Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Mahasiswa> studentList = new ArrayList<>();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String name = sc.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = sc.nextLine();

                    boolean exists = false;
                    for (Mahasiswa mhs : studentList) {
                        if (mhs.getNim().equals(nim)) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Mahasiswa dengan NIM tersebut sudah ada!");
                    } else {
                        studentList.add(new Mahasiswa(name, nim));
                        System.out.println("Mahasiswa " + name + " ditambahkan.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String removeNim = sc.nextLine();
                    boolean removed = false;

                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getNim().equals(removeNim)) {
                            studentList.remove(i);
                            removed = true;
                            System.out.println("Mahasiswa dengan NIM " + removeNim + " dihapus.");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang ingin dicari: ");
                    String searchNim = sc.nextLine();
                    boolean found = false;

                    for (Mahasiswa m : studentList) {
                        if (m.getNim().equals(searchNim)) {
                            System.out.println("Data Mahasiswa ditemukan:");
                            System.out.println("NIM: " + m.getNim() + ", Nama: " + m.getName());
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
                    }
                    break;

                case 4:
                    if (studentList.isEmpty()) {
                        System.out.println("Belum ada data mahasiswa.");
                    } else {
                        System.out.println("Daftar Mahasiswa:");
                        for (Mahasiswa m : studentList) {
                            System.out.println("NIM: " + m.getNim() + ", Nama: " + m.getName());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    studentList.clear();
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
        while (choice != 0);

        sc.close();
    }
}