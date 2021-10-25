package aula04;

public final class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private  String cor;
    
    public Caneta(String m, String c, float p){ // este é o contrutor 
        this.setModelo(m);
        this.cor = c;
        this.setPonta(p);
        
    }
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
        
    }
    
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta : " + this.getPonta());
        System.out.println("Cor : "+ this.cor);
        System.out.println("está tampada? "+ this.tampada);
    }
    public void tampar(){
        this.tampada = true;
        
    }
    public void destampar(){
        this.tampada=false;
    }
    
}
