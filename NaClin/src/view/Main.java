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
import java.util.ArrayList;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
    
    static ArrayList<Medico> medicos = new ArrayList<Medico>();
    static ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
    static ArrayList<Recepcionista> recepcionistas = new ArrayList<Recepcionista>();
    static ArrayList<Especialidade> especialidades = new ArrayList<Especialidade>();
    static ArrayList<Consulta> consultas = new ArrayList<Consulta>();


    @Override
    public void start(Stage stage){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("TelaDeAcesso.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception{
        launch(args);
    }
    
    public static ArrayList<Medico> getMedicos() {
        return medicos;
    }
    public static ArrayList<Paciente> getPacientes() {
        return pacientes;
    }
    public static ArrayList<Recepcionista> getRecepcionistas() {
        return recepcionistas;
    }
    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }
    public static ArrayList<Consulta> getConsultas() {
        return consultas;
    }

}
