package Modul7.controller;

import Modul7.dao.AnimeDAO;
import Modul7.dao.AnimeListDAO;
import Modul7.model.Anime;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class AnimeController {
    @FXML private TextField inputId;
    @FXML private TextField inputTitle;
    @FXML private TextField inputGenre;
    @FXML private ComboBox<String> comboStatus;

    @FXML private TableView<Anime> tableAnime;
    @FXML private TableColumn<Anime, String> colId;
    @FXML private TableColumn<Anime, String> colTitle;
    @FXML private TableColumn<Anime, String> colGenre;
    @FXML private TableColumn<Anime, String> colStatus;

    private AnimeDAO animeDao;
    private ObservableList<Anime> observableList;

    @FXML
    public void initialize() {
        animeDao = new AnimeListDAO();
        observableList = FXCollections.observableArrayList();

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        colGenre.setCellValueFactory(new PropertyValueFactory<>("genre"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        comboStatus.setItems(FXCollections.observableArrayList("Watching", "Completed", "Plan to Watch"));
        tableAnime.setItems(observableList);
    }

    @FXML
    protected void onAdd() {
        Anime anime = new Anime(inputId.getText(), inputTitle.getText(), inputGenre.getText(), comboStatus.getValue());
        animeDao.addData(anime);
        refreshTable();
        clearForm();
    }

    @FXML
    protected void onUpdate() {
        Anime anime = new Anime(inputId.getText(), inputTitle.getText(), inputGenre.getText(), comboStatus.getValue());
        animeDao.updateData(anime);
        refreshTable();
        clearForm();
    }

    @FXML
    protected void onDelete() {
        Anime selected = tableAnime.getSelectionModel().getSelectedItem();
        if (selected != null) {
            animeDao.deleteData(selected);
            refreshTable();
            clearForm();
        }
    }

    @FXML
    protected void onTableClick() {
        Anime selected = tableAnime.getSelectionModel().getSelectedItem();
        if (selected != null) {
            inputId.setText(selected.getId());
            inputTitle.setText(selected.getTitle());
            inputGenre.setText(selected.getGenre());
            comboStatus.setValue(selected.getStatus());
            inputId.setDisable(true);
        }
    }

    private void refreshTable() {
        observableList.setAll(animeDao.getAll());
        inputId.setDisable(false);
    }

    private void clearForm() {
        inputId.clear(); inputTitle.clear(); inputGenre.clear(); comboStatus.setValue(null);
    }
}