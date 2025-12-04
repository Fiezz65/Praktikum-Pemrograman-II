package Modul6.soal1;

import java.util.ArrayList;
import java.util.List;

public class BookRepository implements IBookRepository, ISubject {
    private List<Book> books = new ArrayList<>();
    private List<IBookObserver> observers = new ArrayList<>();

    @Override
    public void save(Book book) {
        books.add(book);
        notifyUpdate(book);
    }

    @Override
    public List<Book> getAll() {
        return books;
    }

    @Override
    public void attach(IBookObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyUpdate(Book book) {
        for (IBookObserver obs : observers) {
            obs.onBookAdded(book);
        }
    }
}