package aula02;

public class Caneta {
  public String modelo;
  public String cor;
  private float ponta;
  protected int carga;
  private boolean tampada;
    
  public void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Ponta : "+ this.ponta);
        System.out.println("Carga : " + this.carga);
        System.out.println("cor : "+ this.cor);
        System.out.println("A caneta está tampada? " + this.tampada);
        
    }
  private void rabiscar(){
        if (this.tampada== true ){
            System.out.println("Erro : Caneta está tampada");
        }
         
    }
  public void tampar(){
        this.tampada = true;
        
    }
  public void destampar(){
       this.tampada= false; 
       System.out.println("Estou rabiscando");
    }
    
}
