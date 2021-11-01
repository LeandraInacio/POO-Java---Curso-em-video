
package projetofinal;


public class Visualizacao {
    //Atributos ------------------------------------------------
    private Garfanhoto espectador;
    private Video filme;
    
    //Construtor -----------------------------------------------

    public Visualizacao(Garfanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }
    
      
    // métodos --------------------------------------------------
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar( float porcent){
        int tot = 0;
        if(porcent<=20){
            tot = 3;
        }else if (porcent<= 50){
            tot = 5;
          
        }else if (porcent <=90){
            tot = 8;
        }else{
            tot =10;
        }
        this.filme.setAvaliacao(tot);
    }
    
    // Métodos especias --------------------------------------------

    public Garfanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Garfanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    // To string -----------------------------------------------------------
    @Override
    public String toString() {
        return "Visualizacao{" + "espectador = " + espectador +
                ",\n filme = " + filme + '}';
    }
    
    
}
