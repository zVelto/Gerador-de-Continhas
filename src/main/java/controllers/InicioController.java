package controllers;

import entities.Continha;
import enums.Dificuldade;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import services.ContinhaService;

import java.io.IOException;
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

    public void onActionButton() throws IOException {
        ContinhaService service = new ContinhaService();
        List<Continha> list = service.GerarLista(choice.getValue(), Integer.parseInt(text.getText()));

        for (Continha c: list) {
            VBox v = FXMLLoader.load(getClass().getResource("/teste.fxml"));

            Label l1 = (Label) v.getChildren().get(0);
            String t1 = l1.getText();
            t1 += c.getDividendo();
            l1.setText(t1);
            v.getChildren().set(0,l1);

            Label l2 = (Label) v.getChildren().get(1);
            String t2 = l2.getText();
            t2 += c.getDivisor();
            l2.setText(t2);
            v.getChildren().set(1,l2);

            Label l3 = (Label) v.getChildren().get(2);
            String t3 = l3.getText();
            t3 += c.getLinhasNecessarias();
            l3.setText(t3);
            v.getChildren().set(2,l3);

            vbox.getChildren().add(v);
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
