package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco contaCreusa = new ContaBanco();
        
        
        contaCreusa.abrirconta("cc");
        contaCreusa.setDono("Creusa Silva");
        contaCreusa.setNumeroconta(123);
       
        System.out.println(" Dono: "+ contaCreusa.getDono() + " Numero : " +
                contaCreusa.getNumeroconta()+ " Tipo : "+ contaCreusa.getTipo()+
                " Status : "+ contaCreusa.getStatus()+ " Saldo : "
                + contaCreusa.getSaldo());
        
        // operações
        
        contaCreusa.depositar(500);
        
        System.out.println(" Dono: "+ contaCreusa.getDono() + " Numero : " +
                contaCreusa.getNumeroconta()+ " Tipo : "+ contaCreusa.getTipo()+
                " Status : "+ contaCreusa.getStatus()+ " Saldo : "
                + contaCreusa.getSaldo());    
        
        contaCreusa.sacar(250);
        
        System.out.println(" Dono: "+ contaCreusa.getDono() + " Numero : " +
                contaCreusa.getNumeroconta()+ " Tipo : "+ contaCreusa.getTipo()+
                " Status : "+ contaCreusa.getStatus()+ " Saldo : "
                + contaCreusa.getSaldo());
        
        contaCreusa.pagamentomensal();
        
        System.out.println(" Dono: "+ contaCreusa.getDono() + " Numero : " +
                contaCreusa.getNumeroconta()+ " Tipo : "+ contaCreusa.getTipo()+
                " Status : "+ contaCreusa.getStatus()+ " Saldo : "
                + contaCreusa.getSaldo());
        
        contaCreusa.fecharconta();
        contaCreusa.sacar(288);
        
        System.out.println(" Dono: "+ contaCreusa.getDono() + " Numero : " +
                contaCreusa.getNumeroconta()+ " Tipo : "+ contaCreusa.getTipo()+
                " Status : "+ contaCreusa.getStatus()+ " Saldo : "
                + contaCreusa.getSaldo());
        
        contaCreusa.fecharconta();
        
        System.out.println(" Status Conta: "+ contaCreusa.getStatus());
        
        

    }
    
}
