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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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

public class CadastroMedicoController {

    @FXML
    private TextField nomeTextField,crmTextField;
    @FXML
    private PasswordField senhaTextField;
    @FXML
    private Label infoArea;
    @FXML
    private ComboBox<Especialidade> comboBoxEspecialidade,comboBoxEspecialidade2;

    private Stage stage;
    private Scene scene;
    private Parent root;
    private ObservableList<Especialidade> obEspecialidade;

    public void Cadastrar(ActionEvent event) throws IOException{
        ArrayList<Medico> medicos;
        medicos = Main.getMedicos();
        
        boolean flag = false;
        for(int i=0; i<medicos.size(); i++){
            if(medicos.get(i).getCrm().equals(crmTextField.getText())){
                infoArea.setText("          CRM já cadastrado!");
                flag = true;
            }
        }
        if(!flag){
            Medico aux = new Medico(nomeTextField.getText(), crmTextField.getText(), senhaTextField.getText());
            Especialidade [] esp = new Especialidade[2];
            esp[0] = comboBoxEspecialidade.getSelectionModel().getSelectedItem();
            esp[1] = comboBoxEspecialidade2.getSelectionModel().getSelectedItem();
            aux.setEspecialidade(esp);
            medicos.add(aux);
            infoArea.setText("          Cadastrado com sucesso!");
        }
            
    }
    public void Voltar(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("CentralRecepcionista.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void CarregarList(ActionEvent event) throws IOException{
        ArrayList<Especialidade> especialidades;
        especialidades = Main.getEspecialidades();
        obEspecialidade = FXCollections.observableArrayList(especialidades);
        comboBoxEspecialidade.getItems().setAll(obEspecialidade);
        comboBoxEspecialidade2.getItems().setAll(obEspecialidade);
        infoArea.setText("          Carregado com sucesso!");  
    }
}
