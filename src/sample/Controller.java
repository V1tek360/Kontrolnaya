package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    TextField login;
    @FXML
    TextField password;
    @FXML
    TextField text;
    @FXML
    Button enter;

    @FXML
    void clickEnter(ActionEvent eventOne) {
        String a = login.getText();
        String b = password.getText();
        if (a.equals("admin")){
            if (b.equals("pass")) {
                text.setText("Hello Admin!");
            }
        }
        else{
            text.setText("Ошибка авторизации");
        }
    }
}
