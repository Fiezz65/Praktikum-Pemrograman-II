package com.anitrack.crud.dao;

import com.anitrack.crud.model.Anime;
import java.util.ArrayList;
import java.util.List;

public class AnimeListDAO implements AnimeDAO {
    private final List<Anime> animeList = new ArrayList<>();

    @Override
    public void addData(Anime anime) {
        animeList.add(anime);
    }

    @Override
    public void updateData(Anime anime) {
        for (int i = 0; i < animeList.size(); i++) {
            if (animeList.get(i).getId().equals(anime.getId())) {
                animeList.set(i, anime);
                break;
            }
        }
    }

    @Override
    public void deleteData(Anime anime) {
        animeList.removeIf(a -> a.getId().equals(anime.getId()));
    }

    @Override
    public List<Anime> getAll() {
        return new ArrayList<>(animeList);
    }
}