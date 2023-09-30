package lk.ijse.stockmanage.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SupplierFormController {
    public AnchorPane rootNode;
    public void btnBackOnAction(ActionEvent actionEvent) {
        Parent rootNode = null;
        try {
            rootNode = FXMLLoader.load(this.getClass().getResource("/view/main_form.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Scene scene = new Scene(rootNode);

        Stage primaryStage = (Stage) this.rootNode.getScene().getWindow();
        primaryStage.setTitle("Main");

        primaryStage.setScene(scene);

    }
}
