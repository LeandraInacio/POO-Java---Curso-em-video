
package aula11;


public class Aula11 {


    public static void main(String[] args) {
        Visitante v = new Visitante();
        v.setNome(" Vitor");
        v.setIdade(35);
        v.setSexo(" M");
        System.out.println (v.toString());
        
        Alunos a = new Alunos();
        a.setNome(" Maria");
        a.setIdade(15);
        a.setSexo(" F");
        System.out.println (a.toString());
        a.pagarMensalidade();
        
        Bolsista b = new Bolsista();
        b.setNome(" Pedro");
        b.setIdade(17);
        b.setSexo(" M");
        System.out.println (b.toString());
        b.pagarMensalidade();        
    }
    
}
