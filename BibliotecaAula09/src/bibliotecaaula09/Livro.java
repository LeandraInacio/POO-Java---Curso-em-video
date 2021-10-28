package bibliotecaaula09;

public class Livro implements Publicacao{
    private String livro;
    private String autor;
    private int totpaginas;
    private int pag_atual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Métodos ---------------------------------------------------------------
    
    public String detalhes() {
        return "Livro{" + "livro=" + livro + ",\n autor=" + autor +
                ",\n totpaginas=" + totpaginas + ",\n pag_atual=" + pag_atual + 
                ",\n aberto=" + aberto + ",\n leitor=" + leitor.getNome() +
                "\nidade= "+ leitor.getIdade()+"\n sexo= "+leitor.getSexo()+'}';
    }
   
   
   // Métodos Especiais -------------------------------------------------------

    public Livro(String livro, String autor, int totpaginas, int pag_atual,
            Pessoa leitor) {
        this.livro = livro;
        this.autor = autor;
        this.totpaginas = totpaginas;
        this.pag_atual = 0;
        this.aberto= false;
        this.leitor = leitor;
    }

   
    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotpaginas() {
        return totpaginas;
    }

    public void setTotpaginas(int totpaginas) {
        this.totpaginas = totpaginas;
    }

    public int getPag_atual() {
        return pag_atual;
    }

    public void setPag_atual(int pag_atual) {
        this.pag_atual = pag_atual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
        
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
   
   // Métodos Abstratos ------------------------------------------------------

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(this.totpaginas<p){
            this.setPag_atual(0);
        }else{
            this.pag_atual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pag_atual++;
    }

    @Override
    public void voltarPag() {
        this.pag_atual--;
        
    }
    
    
}
