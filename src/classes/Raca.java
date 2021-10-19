package classes;

public class Raca {
    private int iRaca;
    private String nome;
    private String observacao;

    public Raca(){
        this.setIRaca(0);
        this.setNome("sem nome");
        this.setObservacao(null);
    }

    public Raca(int iRaca, String nome, String observacao){
        this.setIRaca(iRaca);
        this.setNome(nome);
        this.setObservacao(observacao);
    }
    
    public void setIRaca(int iRaca){
        this.iRaca = iRaca;
    }

    public void setNome(String nome){
        this.nome=nome.trim().isEmpty() ? "SEM NOME" : nome.toUpperCase();
    }
    
    public void setObservacao(String observacao){
        this.observacao = observacao;
    }

    public int getIRaca(){
        return this.iRaca;
    }

    public String getNome(){
        return this.nome;
    }

    public String getObservacao(){
        return this.observacao;
    }

}
