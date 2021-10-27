package aula06;

public class ControleRemoto implements Controlador {
   //Atributos 
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // métodos especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    // métodos abstratos 

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirmenu() {
        System.out.println("Está ligado: "+ this.getLigado());
        System.out.println("Está tocando: "+ this.getTocando());
        System.out.print("Volume: "+ this.getVolume());
            for(int i=0; i<= this.getVolume(); i+=10){
                System.out.print("|");
            }

    }

    @Override
    public void fecharmenu() {
        System.out.println("Fechar Menu");
    }

    @Override
    public void maisvolume() {
        if(this.getLigado() == true){
            this.setVolume(this.getVolume()+10);
        }
    }

    @Override
    public void menosvolume() {
        if(this.getLigado() == true){
            this.setVolume(this.getVolume()-10);
        }

    }

    @Override
    public void ligarmudo() {
        if(this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarmudo() {
        if(this.getVolume()==0 && this.getLigado()== true){
            this.setVolume(50);
        }

    }

    @Override
    public void play() {
        if(this.getLigado() == true && this.getTocando() == false){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() == true && this.getTocando()== true){
            this.setTocando(false);
        }

    }
    
    
}
