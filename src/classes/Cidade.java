package classes;

public class Cidade {
    private int iCidade;
    private String nome;

    public Cidade(){
        this.setICidade(0);
        this.setNome("sem nome");
    }

    public Cidade(int iCidade, String nome){
        this.setICidade(iCidade);
        this.setNome(nome);
    }
    
    public void setICidade(int iCidade){
        this.iCidade = iCidade;
    }

    public void setNome(String nome){
        this.nome=nome.trim().isEmpty() ? "SEM NOME" : nome.toUpperCase();
    }
    
    public int getICidade(){
        return this.iCidade;
    }

    public String getNome(){
        return this.nome;
    }
    
}
