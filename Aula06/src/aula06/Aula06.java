package aula06;

public class Aula06 {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.play();
        c.abrirmenu();
        System.out.println();
        System.out.println("-----------------");
       
        c.maisvolume();
        c.abrirmenu();
        System.out.println();
        System.out.println("-----------------");
        
        c.ligarmudo();
        c.abrirmenu();
        System.out.println();
        System.out.println("-----------------");
        
        c.desligarmudo();
        c.ligar();
        c.pause();
        c.abrirmenu();
        System.out.println();
        System.out.println("-----------------");
    }
    
}
