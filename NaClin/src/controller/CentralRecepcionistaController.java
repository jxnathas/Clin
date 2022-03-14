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
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class CentralRecepcionistaController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public void cadastrarPaciente(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("CadastroPaciente.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void cadastrarMedico(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("CadastroMedico.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void cadastrarEspecialidade(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("CadastroEspecialidade.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void editarPacientes(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("EditarPacientes.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void editarEspecialidade(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("EditarEspecialidades.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void editarMedicos(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("EditarMedicos.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void ListarPacientes(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("ListarPacientes.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void ListarMedicos(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("ListarMedicos.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void ListarEspecialidades(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("ListarEspecialidades.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void Voltar(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    } 
}
