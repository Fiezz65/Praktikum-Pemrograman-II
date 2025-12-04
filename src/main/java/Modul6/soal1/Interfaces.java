package Modul6.soal1;

import java.util.List;

interface IBookRepository {
    void save(Book book);
    List<Book> getAll();
}

interface IBookObserver {
    void onBookAdded(Book book);
}

interface ISubject {
    void attach(IBookObserver observer);
    void notifyUpdate(Book book);
}