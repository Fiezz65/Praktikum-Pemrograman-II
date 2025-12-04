package Modul6.soal1;

public class PageFactory {
    private IBookRepository repository;

    public PageFactory(IBookRepository repository) {
        this.repository = repository;
    }

    public Page createPage(int choice) {
        switch (choice) {
            case 1: return new InputPage(repository);
            case 2: return new DisplayPage(repository);
            default: return null;
        }
    }
}