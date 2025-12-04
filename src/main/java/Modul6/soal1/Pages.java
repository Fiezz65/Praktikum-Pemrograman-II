package Modul6.soal1;

import java.util.Scanner;

abstract class Page {
    protected IBookRepository repository;
    public Page(IBookRepository repository) { this.repository = repository; }
    public abstract void display(Scanner sc);
}

class InputPage extends Page {
    public InputPage(IBookRepository repository) { super(repository); }

    @Override
    public void display(Scanner sc) {
        System.out.println("\n=== TAMBAH BUKU ===");
        System.out.print("Judul: ");
        String title = sc.nextLine();
        System.out.print("Penulis: ");
        String author = sc.nextLine();
        System.out.print("Tahun: ");
        int year = sc.nextInt();
        sc.nextLine();

        repository.save(new Book(title, author, year));
    }
}

class DisplayPage extends Page {
    public DisplayPage(IBookRepository repository) { super(repository); }

    @Override
    public void display(Scanner sc) {
        System.out.println("\n=== DAFTAR BUKU ===");
        for (Book book : repository.getAll()) {
            System.out.println("- " + book.toString());
        }
    }
}