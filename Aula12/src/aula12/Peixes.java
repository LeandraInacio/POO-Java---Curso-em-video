
package aula12;


public class Peixes extends Animal {
    private String corEscama;
    
    public void soltarBolha(){
        System.out.println("Soltou uma Bolha");
    }
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("coisas do mar");
    }

    @Override
    public void emitirSom() {
        System.out.println("não tem som");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
