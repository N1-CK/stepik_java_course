package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowController{

    @FXML
    private BorderPane buttonFromFirst;

    @FXML
    private void showDialog() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DialogWindow.fxml"));
            Stage dialogStage = new Stage();
            dialogStage.initModality(Modality.APPLICATION_MODAL);
            dialogStage.setTitle("Выберите разрешение");
            dialogStage.setScene(new Scene(loader.load()));
            DialogWindowController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setMainStage((Stage) buttonFromFirst.getScene().getWindow());
            dialogStage.initOwner(buttonFromFirst.getScene().getWindow());
            dialogStage.showAndWait();

            if (controller.isResolutionSelected()) {
                String[] resolution = controller.getSelectedResolution().split("x");
                controller.mainStage.setWidth(Integer.parseInt(resolution[0])); // установка ширины главного окна
                controller.mainStage.setHeight(Integer.parseInt(resolution[1])); // установка высоты главного окна
                System.out.println(resolution[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
