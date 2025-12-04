package Modul7.dao;

import Modul7.model.Anime;
import java.util.List;

public interface AnimeDAO {
    void addData(Anime anime);
    void updateData(Anime anime);
    void deleteData(Anime anime);
    List<Anime> getAll();
}