package TM;



import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class Presentation {

    @FXML
    Button btningresar;

    public void salir(ActionEvent actionEvent) { Platform.exit();
    }

    public void ingresar(ActionEvent actionEvent)  throws IOException {
        Stage stage = (Stage) btningresar.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Inicio.fxml"));
        Parent root = fxmlLoader.load();
        Inicio controller = fxmlLoader.getController();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}