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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Node;

public class LoginController {
    @FXML
    private TextField loginTextField;
    @FXML
    private PasswordField senhaTextField;
    @FXML
    private Label infoArea;


    private Stage stage;
    private Scene scene;
    private Parent root;

    public void Login(ActionEvent event) throws IOException {
        ArrayList<Recepcionista> recepcionista;
        recepcionista = Main.getRecepcionistas();

        for(int i=0;i<recepcionista.size();i++){
            if(loginTextField.getText().equals(recepcionista.get(i).getCpf()) && senhaTextField.getText().equals(recepcionista.get(i).getSenha())){
                root = FXMLLoader.load(getClass().getResource("CentralRecepcionista.fxml"));
                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }else
                infoArea.setText("Login ou Senha Incorretos");              
        }

    }
    public void SwitchToTelaCadastro(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("CadastroRecepcionista.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void Voltar(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("TelaDeAcesso.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    } 
}
