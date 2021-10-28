package bibliotecaaula09;

public class BibliotecaAula09 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("lucas","Masc", 35);
        
        Livro l1 = new Livro("Sapiens", "Harari", 300,250,p1);
        l1.abrir();
        l1.folhear(200);
        System.out.println(l1.detalhes());
    }
    
}
