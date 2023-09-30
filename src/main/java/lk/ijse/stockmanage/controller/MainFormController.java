package lk.ijse.stockmanage.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class MainFormController {
    public AnchorPane rootNode;

    public void btnCustomerOnAction(ActionEvent actionEvent) {

        Parent rootNode = null;
        try {
            rootNode = FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Scene scene = new Scene(rootNode);

        Stage primaryStage = (Stage) this.rootNode.getScene().getWindow();
        primaryStage.setTitle("Customer Manager");
        primaryStage.setScene(scene);
    }



    public void btnItemOnAction(ActionEvent actionEvent) {

        Parent rootNode = null;
        try {
            rootNode = FXMLLoader.load(this.getClass().getResource("/view/item_form.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Scene scene = new Scene(rootNode);

        Stage primaryStage = (Stage) this.rootNode.getScene().getWindow();
        primaryStage.setTitle("Item Manager");
        primaryStage.setScene(scene);
    }

    public void btnSupplierOnAction(ActionEvent actionEvent) {

        Parent rootNode = null;
        try {
            rootNode = FXMLLoader.load(this.getClass().getResource("/view/Supplier_form.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Scene scene = new Scene(rootNode);

        Stage primaryStage = (Stage) this.rootNode.getScene().getWindow();
        primaryStage.setTitle("Supplier Manager");
        primaryStage.setScene(scene);
    }

}

