//package com.example.demo1;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.control.Button;
//import javafx.scene.control.ChoiceBox;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//public class DialogWindowController {
//    @FXML
//    private ChoiceBox<String> chb;
//    private Stage dialogStage;
//    public Stage mainStage; // ссылка на главное окно
//    private boolean resolutionSelected = false;
//    private String selectedResolution;
//    public void setMainStage(Stage mainStage) {
//        this.mainStage = mainStage;
//    }
//    public void setDialogStage(Stage dialogStage) {
//        this.dialogStage = dialogStage;
//    }
//    public boolean isResolutionSelected() {
//        return resolutionSelected;
//    }
//
//    public String getSelectedResolution() {
//        return selectedResolution;
//    }
//    @FXML
//    private Button AcceptResolution;
//    @FXML
//    private Text textfield1;
//
//    @FXML
//    public void newResolutionAccept(){
//        selectedResolution = chb.getValue();
//        if(selectedResolution != null){
//            resolutionSelected = true;
//            dialogStage.close();
//        }
//    }
//}
