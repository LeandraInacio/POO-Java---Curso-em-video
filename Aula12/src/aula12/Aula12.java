package aula12;

public class Aula12 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixes p = new Peixes();
        Ave a = new Ave();
        

        /*m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println("------------------");
        r.locomover();
        r.alimentar();
        r.emitirSom();
        System.out.println("------------------");
        p.locomover();
        p.alimentar();
        p.emitirSom();
        System.out.println("------------------");
        a.locomover();
        a.alimentar();
        a.emitirSom();        
        */
        
        Canguru c = new Canguru();
        c.locomover();
        
        Galinha g = new Galinha();
        g.locomover();
        
        Cobra cobra = new Cobra();
        cobra.alimentar();
        
        Nemo n = new Nemo();
        n.emitirSom();
    }
    
}
