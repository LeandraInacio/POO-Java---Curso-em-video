package aula05;

public class ContaBanco {
    //Atributos
    public int numeroconta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos

    public void abrirconta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "cc"){
            this.setSaldo(50);
        }
        if (t =="cp"){
            this.setSaldo(150);
        }
        
    }
    public void fecharconta(){
        if(this.getSaldo() == 0){
            System.out.println("conta encerrada");
            this.setStatus(false);
        }else {
            System.out.println("Não é possível fechar a conta, pois o saldo está"
                    + "positivo ou em débito");
        }
        
    }
    public void sacar(float v){
        if(this.getStatus()==true && this.getSaldo()>=v){
            this.setSaldo(this.getSaldo()-v);
                        
        }else{
            System.out.println("Saldo insuficiente ou conta fechada");
        }
        
    }
    public void depositar(float v){
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo()+v);
            
        }else{
            System.out.println("Impossível depositar");
        }
        
    }
    public void pagamentomensal(){
        float mensal = 0;
        if( this.getTipo()== "cc"){
            mensal = 12;
        }
        if(this.getTipo()=="cp"){
            mensal = 20;
        }
        if (this.getStatus() == true){
            if(this.getSaldo()>= mensal){
                this.setSaldo(this.getSaldo()-mensal);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Conta fechada");
        }
        
    }
    
    // Métodos especiais 
    
    public ContaBanco(){
        this.status= false;
        this.saldo = 0f;
    }    
    
    public int getNumeroconta() {
        return numeroconta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setNumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
