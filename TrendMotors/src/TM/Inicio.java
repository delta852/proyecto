package TM;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class Inicio {

    @FXML
    Button btncontact;
    @FXML
    Button btnverautos;
    @FXML
    Button btnverf;


    public void Salir(ActionEvent actionEvent) { Platform.exit();
    }


    public void Contactenos(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) btncontact.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Contact.fxml"));
        Parent root = fxmlLoader.load();
        Contact controller = fxmlLoader.getController();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void VerAutos(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) btnverautos.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Autos1.fxml"));
        Parent root = fxmlLoader.load();
        Autos1 controller = fxmlLoader.getController();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void VerF(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) btnverf.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Financimiento.fxml"));
        Parent root = fxmlLoader.load();
        Financiamiento controller = fxmlLoader.getController();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
