package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Ponta : "+ this.ponta);
        System.out.println("Carga : " + this.carga);
        System.out.println("uma caneta "+ this.cor);
        System.out.println("A caneta está tampada? " + this.tampada);
        
    }
    void rabiscar(){
        if (this.tampada== true ){
            System.out.println("Erro : Caneta está tampada");
        }
         
    }
    void tampar(){
        this.tampada = true;
        
    }
    void destampar(){
       this.tampada= false; 
       System.out.println("Estou rabiscando");
    }
    
}
