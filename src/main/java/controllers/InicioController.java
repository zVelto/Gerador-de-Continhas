package controllers;

import entities.Continha;
import enums.Dificuldade;
import javafx.collections.ObservableList;
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
    private Button respostas;

    @FXML
    private VBox vbox;

    private List<Continha> list;

    public void onActionButton() throws IOException {
        vbox.getChildren().clear();

        ContinhaService service = new ContinhaService();
        list = service.GerarLista(choice.getValue(), Integer.parseInt(text.getText()));

        adicionaAoVBox();

        respostas.setDisable(false);
    }

    public void onActionResposta() {
        adicionaRespostas();
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

    public void adicionaAoVBox() throws IOException {

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

            Label l4 = (Label) v.getChildren().get(3);
            String t4 = l4.getText();
            t4 += c.getQuociente();
            l4.setText(t4);
            l4.setVisible(false);
            v.getChildren().set(3,l4);

            Label l5 = (Label) v.getChildren().get(4);
            String t5 = l5.getText();
            t5 += c.getResto();
            l5.setText(t5);
            l5.setVisible(false);
            v.getChildren().set(4,l5);

            vbox.getChildren().add(v);
        }
    }

    public void adicionaRespostas() {

        ObservableList<Node> listVbox = vbox.getChildren();

        for (Node n : listVbox) {

            VBox vb = (VBox) n;

            vb.getChildren().get(3).setVisible(true);
            vb.getChildren().get(4).setVisible(true);
        }
    }
}