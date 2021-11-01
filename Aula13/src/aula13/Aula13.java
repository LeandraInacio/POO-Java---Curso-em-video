package aula13;

public class Aula13 {

    public static void main(String[] args) {
        // Animal x = new Animal();  é uma classe abstrata e não pode ser
        //instanciada
        
        Mamifero x = new Mamifero();
        x.emitirSom();
        System.out.println("----------------");
        Lobo y = new Lobo();
        y.emitirSom();
        System.out.println("----------------");
        Cachorro c = new Cachorro();
        c.reagir("Olá");
        System.out.println("----------------");
        c.reagir(19, 0.0f);
        System.out.println("----------------");
        c.reagir(false);
        System.out.println("----------------");
        c.reagir(11, 5);
        
        
    }
    
}
