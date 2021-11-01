
package projetofinal;


public class Garfanhoto extends Pessoa {
    //Atributos --------------------------------------------
    private String login;
    private int totAssistido;
    
    // Construtor -----------------------------------------

    public Garfanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        
        this.login = login;
        this.totAssistido = 0;
    }
        
    //Métodos ---------------------------------------------
    
    public void viuMaisUm(){
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    //To String -------------------------------------------------------

    @Override
    public String toString() {
        return "Garfanhoto{" +super.toString() + ", login=" + login +
                ", totAssistido=" + totAssistido + '}';
    }
    
    
}
