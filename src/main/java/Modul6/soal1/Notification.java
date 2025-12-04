package Modul6.soal1;

public class Notification implements IBookObserver {
    @Override
    public void onBookAdded(Book book) {
        System.out.println("[NOTIFIKASI SISTEM]: Buku baru berhasil disimpan -> " + book.getTitle());
    }
}