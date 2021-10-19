package classes;

public class Bairro {
    private int iBairro;
    private String nome;

    public Bairro(){
        this.setIBairro(0);
        this.setNome("sem nome");
    }

    public Bairro(int iBairro, String nome){
        this.setIBairro(iBairro);
        this.setNome(nome);
    }
    
    public void setIBairro(int iBairro){
        this.iBairro = iBairro;
    }

    public void setNome(String nome){
        this.nome=nome.trim().isEmpty() ? "SEM NOME" : nome.toUpperCase();
    }
    
    public int getIBairro(){
        return this.iBairro;
    }

    public String getNome(){
        return this.nome;
    }
    
}