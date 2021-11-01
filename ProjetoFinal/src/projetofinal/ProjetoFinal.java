
package projetofinal;


public class ProjetoFinal {


    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 de POO");
        v[2] = new Video("Aula 3 de POO");
        
    //    System.out.println(v[0].toString());
        
        Garfanhoto g[] = new Garfanhoto[2];
        g[0] = new Garfanhoto("Marcos", 15,"M" ,"Marcos@gmail.com");
        g[1] = new Garfanhoto("Maria", 22,"F" ,"Maria@gmail.com");
        
    //    System.out.println(g[0].toString());
        
        Visualizacao vis = new Visualizacao(g[0], v[0]);
        vis.avaliar(8);
        System.out.println(vis.toString());
       

        System.out.println("-------------------------------------------------");
        
        Visualizacao vis02 = new Visualizacao(g[0], v[1]);
        System.out.println(vis.toString());
        
        
    }
    
    
    
}
