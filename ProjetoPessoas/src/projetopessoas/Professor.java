
package projetopessoas;


public class Professor extends Pessoa {
    //Atributos ------------------------------------
    private String especialidade;
    private float salario;
    
    //Métodos -------------------------------------
    public void recebverAumento(float valor){
        this.setSalario(this.getSalario()+valor );
    }
        // Métodos especias ---------------------------

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
