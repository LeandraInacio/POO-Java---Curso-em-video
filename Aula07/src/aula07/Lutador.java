package aula07;

public class Lutador {
    //Atributos ---------------------------------------------------------------
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    // Métodos --------------------------------------------------------------- 
    
    public void apresentar(){
        System.out.println("APRESENTAÇÃO LUTADOR "+ this.getNome());
        System.out.println(" Nascionalidade: "+ this.getNacionalidade());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Altura: "+ this.getAltura());
        System.out.println("Peso: "+ this.getPeso()+ " kg");
        System.out.println("Categoria: "+ this.getCategoria());
        System.out.println("Ganhou: "+ this.getVitorias());
        System.out.println("Perdeu: "+ this.getDerrotas());
        System.out.println("Empatou: "+ this.getEmpates());
        System.out.println("-------------------------------");
    }
    public void status(){
        System.out.println("--------------------------------------------------");
        System.out.println("Lutador: "+ this.getNome()+ " É um peso: "
                + this.getCategoria()+ " Ganhou: "+ this.getVitorias()+ " Perdeu: "+ 
                this.getDerrotas()+" Empatou: "+ this.getEmpates());
        System.out.println("--------------------------------------------------");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
        
    }
    
    //métodos especiais -------------------------------------------------------

    public Lutador(String nome, String nasc, int id, float altura, float peso,
                    int vit, int der, int emp) {
        this.setNome(nome);
        this.setNacionalidade(nasc);
        this.setIdade(id);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vit);
        this.setDerrotas(der);
        this.setEmpates(emp);
        
    
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private void setCategoria() {
        if(peso<52.2f){
            this.categoria=("Inválido");
        }else if(this.peso<= 70.3f){
            this.categoria = ("leve");
        }else if(this.peso <=83.9f){
            this.categoria = ("médio");
        }else if (this.peso <= 120.2f){
            this.categoria = ("Pesado");
        }else{
            this.categoria = ("inválido");
        }
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
