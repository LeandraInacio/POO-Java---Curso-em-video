package aula07;

public class Aula07 {

    public static void main(String[] args) {
        Lutador vetor []= new Lutador[6];
        
        vetor[0]= new Lutador("Pretty Boy","França", 31,1.75f,68.9f,11,3,1);
        vetor[1]= new Lutador("Putscript", "Brasil", 29, 1.68f,57.8f,14,2,3);
        vetor[2] = new Lutador("Dead Code","Austrália",28,1.93f,81.6f,13,0,2);
        vetor[3] = new Lutador("Snapshadow","EUA", 35,1.65f,80.9f,12,2,1);
        vetor[4]= new Lutador("Ufocobol","Brasil",37,1.70f,119.3f,5,4,3);
        vetor[5]= new Lutador ("Nerdaard", "EUA", 30,1.81f,105.7f,12,2,4);
        
    /*    vetor[2].apresentar();
        vetor[2].status();
        
        vetor[0].ganharLuta();
        vetor[0].status();
        
        vetor[4].perderLuta();
        vetor[4].status();*/
    
    Luta luta01 = new Luta();
    luta01.marcarLuta(vetor[0], vetor[1]);
    luta01.lutar();
    vetor[0].apresentar();
    
        
    }
    
}
