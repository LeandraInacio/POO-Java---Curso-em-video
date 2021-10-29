
package aula11;

public class Bolsista extends Alunos {
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovação de bolsa do aluno "+ this.getNome());
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome()+ " teve o pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
