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

public class Prontuario {
    private String anamnese;
    private String exame_fisico;
    private String hip_diagnosticos;
    private String diagnosticos;
    private String tratamentos_e;

    public String getTratamentos_e() {
        return tratamentos_e;
    }

    public void setTratamentos_e(String tratamentos_e) {
        this.tratamentos_e = tratamentos_e;
    }

    public String getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(String diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public String getHip_diagnosticos() {
        return hip_diagnosticos;
    }

    public void setHip_diagnosticos(String hip_diagnosticos) {
        this.hip_diagnosticos = hip_diagnosticos;
    }

    public String getExame_fisico() {
        return exame_fisico;
    }

    public void setExame_fisico(String exame_fisico) {
        this.exame_fisico = exame_fisico;
    }

    public String getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(String anamnese) {
        this.anamnese = anamnese;
    }
    
}
