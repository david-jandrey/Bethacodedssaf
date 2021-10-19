
package classes;

import enums.TipoLogradouro;

public class Logradouro {
    private int iLogradouro;
    private String nome;
    private TipoLogradouro tipoLogradouro;

    public Logradouro(){
        this.setILogradouro(0);
        this.setNome("sem nome");
        this.setTipoLogradouro(TipoLogradouro.A);
    }

    public Logradouro(int iLogradouro, String nome, TipoLogradouro tipoLogradouro){
        this.setILogradouro(iLogradouro);
        this.setNome(nome);
        this.setTipoLogradouro(tipoLogradouro);
    }
    
    public void setILogradouro(int iLogradouro){
        this.iLogradouro = iLogradouro;
    }

    public void setNome(String nome){
        this.nome=nome.trim().isEmpty() ? "SEM NOME" : nome.toUpperCase();
    }
    
    public void setTipoLogradouro(TipoLogradouro tipoLogradouro){
        this.tipoLogradouro = tipoLogradouro;
    }

    public int getILogradouro(){
        return this.iLogradouro;
    }

    public String getNome(){
        return this.nome;
    }

    public TipoLogradouro getTipoLogradouro(){
        return this.tipoLogradouro;
    }
}
