
package projetopessoas;


public class Funcionario extends Pessoa {
    // Atriubutos --------------------------
    
    private String setor;
    private boolean trabalhando;
    
    // Métodos ------------------------------
    public void mudarTrabalho(){
        if (this.getTrabalhando()== true){
            this.setTrabalhando(false);
        }else{
            this.setTrabalhando(true);
        }
    }
    
    // Métodos Especiais ---------------------

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
