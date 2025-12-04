package Modul6.soal1;

import java.util.Scanner;

public class LibrarySystem {
    private BookRepository repo;
    private PageFactory factory;
    private Scanner sc;

    public LibrarySystem() {
        this.repo = new BookRepository();
        this.repo.attach(new Notification());
        this.factory = new PageFactory(repo);
        this.sc = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;
        while (running) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah");
            System.out.println("2. Lihat");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 3) {
                running = false;
                continue;
            }

            Page page = factory.createPage(choice);
            if (page != null) {
                page.display(sc);
            } else {
                System.out.println("Pilihan salah.");
            }
        }
        sc.close();
        System.out.println("Program Selesai.");
    }
}