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
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Node;

public class ListarEspecialidadesController {
    @FXML
    private ListView<Especialidade> especialidadesListView;
    @FXML
    private Label infoArea;
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    private ObservableList<Especialidade> obEspecialidades;
    
    public void CarregarList(ActionEvent event) throws IOException{
        ArrayList<Especialidade> especialidades;
        especialidades = Main.getEspecialidades();
        obEspecialidades = FXCollections.observableArrayList(especialidades);
        especialidadesListView.getItems().setAll(obEspecialidades);
        infoArea.setText("          Carregado com sucesso!");  
    }

    public void Voltar(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("CentralRecepcionista.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
