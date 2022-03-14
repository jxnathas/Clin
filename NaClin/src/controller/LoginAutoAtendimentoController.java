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
import java.io.IOException;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Node;


public class LoginAutoAtendimentoController {

    @FXML 
    private Button entrarButton;
    @FXML
    private TextField cpfTextField;
    @FXML
    private Label infoArea;
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void Login(ActionEvent event) throws IOException {
        ArrayList<Paciente> paciente;
        paciente = Main.getPacientes();

        if(!paciente.isEmpty()){
            for(int i=0;i<paciente.size();i++){
                if(cpfTextField.getText().equals(paciente.get(i).getCpf())){
                    root = FXMLLoader.load(getClass().getResource("TelaPaciente.fxml"));
                    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }else
                    infoArea.setText("          Dirija-se a recepção");
            }
        }else
            infoArea.setText("          Dirija-se a recepção");
    }
    public void Voltar(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("TelaDeAcesso.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    } 
}
