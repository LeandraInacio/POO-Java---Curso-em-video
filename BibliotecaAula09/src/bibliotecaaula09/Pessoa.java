package bibliotecaaula09;

public class Pessoa {
    
    private String nome;
    private int idade;
    private String sexo;
    
    //Métodos -----------------------------------------------------------------
    public void fazerAniversario(){
        this.setIdade(this.getIdade()+1);
        
        System.out.println(this.getNome() + " tem "+ this.getIdade()+" anos"
                            + "e é do sexo "+ this.getSexo());
    }
    
    // Métodos Especiais ------------------------------------------------------

    public Pessoa(String nome, String sexo, int id) {
        this.setIdade(id);
        this.setSexo(sexo);
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
