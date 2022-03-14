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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
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

public class TelaPacienteController {

    @FXML
    private ChoiceBox<Medico> choiceBox;
    @FXML
    private TextField textField,textField1;
    @FXML
    private Label infoArea;

    private Stage stage;
    private Scene scene;
    private Parent root;
    private ObservableList<Medico> obMedicos;
    
    public void Marcar(ActionEvent event) throws IOException{
        ArrayList<Medico> medicos;
        medicos = Main.getMedicos();
        ArrayList<Paciente> pacientes;
        pacientes = Main.getPacientes();
        ArrayList<Consulta> auxConsultas;
        Paciente auxPaciente;
        Medico auxMedico;
        Consulta auxConsulta;
        
        auxMedico = choiceBox.getSelectionModel().getSelectedItem();
        for(int i=0;i<medicos.size();i++){
            if(auxMedico.getCrm().equals(medicos.get(i).getCrm())){
               auxConsultas = auxMedico.getConsultas();
               for(int j=0;j<auxConsultas.size();j++){
                    if(!auxConsultas.get(j).getData().equals(textField.getText())){
                        for(int k=0;k<pacientes.size();k++){
                            if(textField.getText().equals(pacientes.get(k).getCpf())){
                                auxPaciente = pacientes.get(k);
                                auxPaciente = new Paciente(pacientes.get(i).getNome(), pacientes.get(i).getCpf());
                                auxConsulta = new Consulta(auxPaciente, auxMedico, textField.getText(), false);
                                auxConsultas.add(auxConsulta);
                                medicos.get(i).setConsultas(auxConsultas);
                                infoArea.setText("          Você marcou uma consulta!");  
                            }
                        }
                    }
               }
            }
        }
    }

    public void CarregarList(ActionEvent event) throws IOException{
        ArrayList<Medico> medicos;
        medicos = Main.getMedicos();
        obMedicos = FXCollections.observableArrayList(medicos);
        choiceBox.getItems().setAll(obMedicos);
        infoArea.setText("          Carregado com sucesso!");  
    }
    public void Voltar(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("TelaDeAcesso.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    } 
}
