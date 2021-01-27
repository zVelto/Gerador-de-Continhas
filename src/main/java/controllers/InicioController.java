package controllers;

import entities.Continha;
import enums.Dificuldade;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import services.ContinhaService;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class InicioController implements Initializable {

    @FXML
    private TextField text;

    @FXML
    private ChoiceBox<Dificuldade> choice;

    @FXML
    private Button button;

    @FXML
    private VBox vbox;

    public void onActionButton() {
        ContinhaService service = new ContinhaService();
        List<Continha> list = service.GerarLista(choice.getValue(), Integer.parseInt(text.getText()));

        for (Continha c: list) {
            vbox.getChildren().add(new Label(c.toString()));
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.choice.getItems().addAll(Arrays.asList(
                Dificuldade.MUITO_FACIL,
                Dificuldade.FACIL,
                Dificuldade.INTERMEDIARIO,
                Dificuldade.DIFICIL,
                Dificuldade.MUITO_DIFICIL));
    }
}
