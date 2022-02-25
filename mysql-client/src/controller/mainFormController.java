package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class mainFormController {
    public TextField txtHost;
    public TextField txtPort;
    public TextField txtUserName;
    public TextField txtPassword;
    public Button btnConnect;
    public Button btnExit;

    public void initialize(){
        Platform.runLater(()-> txtUserName.requestFocus());
    }

    public void btnConnectOnAction(ActionEvent actionEvent) {
        
        String command= String.format("mysql -h %s -u %s -p%s --port %s",
                txtHost.getText(),
                txtUserName.getText(),
                txtPassword.getText(),
                txtPort.getText());
    }

    public void btnExitOnAction(ActionEvent actionEvent) {
        System.exit();
    }
}
