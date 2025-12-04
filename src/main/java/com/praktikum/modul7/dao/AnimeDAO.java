package com.anitrack.crud.dao;

import com.anitrack.crud.model.Anime;
import java.util.List;

public interface AnimeDAO {
    void addData(Anime anime);
    void updateData(Anime anime);
    void deleteData(Anime anime);
    List<Anime> getAll();
}