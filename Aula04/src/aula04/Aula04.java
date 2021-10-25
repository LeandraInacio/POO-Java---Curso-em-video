package aula04;

public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Compacto","vermelha",0.5f);
//      c1.setModelo("BIC");
//      c1.setPonta(0.5f);
//      c1.ponta = 0.5f; não poderá ser acessado diretamente, pois é private
        c1.status();
        
/*        System.out.println("Tenho uma caneta "+ c1.getModelo()+" de ponta "+ 
                c1.getPonta());*/
        System.out.println(" ------------------------------ ");
        Caneta c2 = new Caneta("faber castel","preta",0.7f);
        c2.status();
    }
    
}
