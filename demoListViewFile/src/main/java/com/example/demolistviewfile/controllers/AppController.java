package com.example.demolistviewfile.controllers;

import com.example.demolistviewfile.services.PersonService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.List;

public class AppController {

    @FXML
    private Label lblMsg;
    @FXML
    private ListView<String> listView;

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtedad;
    @FXML
    private Label lblMsge;


    private ObservableList<String> data = FXCollections.observableArrayList();
    PersonService service= new PersonService();

    @FXML
    public void initialize(){
        listView.setItems(data);
        loadFromFile();
    }

    @FXML
    public void onReload(){
        loadFromFile();
    }

    @FXML
    public void onAddPerson() {
        try {
            String edadt = txtedad.getText();
            int edad = Integer.parseInt(edadt);
            String name = txtNombre.getText();
            String email = txtEmail.getText();
            service.addPerson(name, email, edad);
            lblMsg.setText("Usuario Creado correctamente");
            lblMsg.setStyle("-fx-text-fill: green");
            txtNombre.clear();
            txtEmail.clear();
            txtedad.clear();
            loadFromFile();
            if (edad<0||edad>120){
                lblMsge.setText("Error edad no validad");
                lblMsg.setStyle("-fx-text-fill: red");
            }else {
                lblMsge.setText("Edad valida");
                lblMsge.setStyle("-fx-text-fill: green");
            }

        } catch (IOException e) {
            lblMsg.setText("Error de archivo" + e.getMessage());
            lblMsg.setStyle("-fx-text-fill: red");
        } catch (IllegalArgumentException e) {
            lblMsg.setText("Error de datos" + e.getMessage());
            lblMsg.setStyle("-fx-text-fill: red");
        }
    }
    private void loadFromFile(){
        try{
            List<String> items = service.loadForListView();
            data.setAll(items);
            lblMsg.setText("Datos cargados correctamente");
            lblMsg.setStyle("-fx-text-fill: green");
        } catch (IOException e) {
            lblMsg.setText("Error: "+e.getMessage());
            lblMsg.setStyle("-fx-text-fill: red");
        }
    }
}
