package aula07;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //métodos ----------------------------------------------------------------
    public void marcarLuta(Lutador l1,Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && 
                l1.getNome()!= l2.getNome())
        {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null); 
        }
        
    }
    public void lutar(){
        
        if(this.aprovada == true){
            
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
            case 0:
                System.out.println(" Empatou");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
                
                break;
            case 1:
                System.out.println("Vencedor : "+ desafiado.getNome());
                desafiado.ganharLuta();
                desafiante.perderLuta();
                break;
            case 2:
                System.out.println("Vencedor : "+ desafiado.getNome());
                desafiante.ganharLuta();
                desafiado.perderLuta();
                
                break;
                     
            }
        }else{
            System.out.println("A luta não poderá acontecer");
        }
        
    }
    //Métodos especiaisn ------------------------------------------------------ 

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    
}
