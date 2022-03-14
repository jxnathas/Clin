/*******************************************************************************
Autor: Jonathas Santos e Santos
Componente Curricular: Algoritmos II
Concluido em: 30/08/2021
Declaro que este código foi elaborado por mim de forma individual e não contém nenhum
trecho de código de outro colega ou de outro autor, tais como provindos de livros e
apostilas, e páginas ou documentos eletrônicos da Internet. Qualquer trecho de código
de outra autoria que não a minha está destacado com uma citação para o autor e a fonte
do código, e estou ciente que estes trechos não serão considerados para fins de avaliação.
******************************************************************************************/
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Node;

public class TelaDeAcessoController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void SwitchToLogin(ActionEvent event) throws IOException {
        ArrayList<Recepcionista> recepcionista;
        recepcionista = Main.getRecepcionistas();
        if(recepcionista.isEmpty()){
            Recepcionista aux = new Recepcionista("GERENTE", "12345", "123");
            recepcionista.add(aux);
        }
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void SwitchToLoginAutoAtendimento(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("LoginAutoAtendimento.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void SwitchToLoginMedico (ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("LoginMedico.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
