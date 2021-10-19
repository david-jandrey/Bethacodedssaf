package classes;

import java.time.LocalDate;
import enums.Situacao;
import enums.Origem;

public class Pet {
    private int iPet;
    private String nome;
    private String descricao;
    private LocalDate dtNacto;
    private String cor;
    private Double peso;
    private String observacao;
    private Situacao situacao;
    private Origem origem;
    private Double valor;
    private Raca raca;

    public Pet(){
        this.setIPet(0);
        this.setNome("sem nome");
        this.setDescricao(null);
        this.setDtNacto(null);        
        this.setCor(null);
        this.setPeso(0.0);
        this.setObservacao(null);
        this.setSituacao(null);
        this.setOrigem(null);
        this.setValor(0.0);
        this.setRaca(null);
        
    }

    public Pet(int iPet, String nome, String descricao, LocalDate dtNacto, String cor, Double peso, String observacao,
    Situacao situacao, Origem origem, Double valor, Raca raca ){
        this.setIPet(iPet);
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setDtNacto(dtNacto);        
        this.setCor(cor);
        this.setPeso(peso);
        this.setObservacao(observacao);
        this.setSituacao(situacao);
        this.setOrigem(origem);
        this.setValor(valor);
        this.setRaca(raca);
    }
    
    public void setIPet(int iPet){
        this.iPet = iPet;
    }

    public void setNome(String nome){
        this.nome=nome.trim().isEmpty() ? "SEM NOME" : nome.toUpperCase();
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setDtNacto(LocalDate dtNacto){
        this.dtNacto = dtNacto;
    }    
 
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public void setPeso(Double peso){
        this.peso = peso;
    }
    
    public void setObservacao(String observacao){
        this.observacao = observacao;
    }
    
    public void setSituacao(Situacao situacao){
        this.situacao = situacao;
    }
    
    public void setOrigem(Origem origem){
        this.origem = origem;
    }
    
    public void setValor(Double valor){
        this.valor = valor;
    }
    
    public void setRaca(Raca raca){
        this.raca = raca;
    }

    public int getIPet(){
        return this.iPet;
    }

    public String getNome(){
        return this.nome;
    }
    
    public String getDescricao(){
        return this.descricao;
    }

    public LocalDate getDtNacto(){
        return this.dtNacto;
    }
    
    public String getCor(){
        return this.cor;
    }

    public Double getPeso(){
        return this.peso;
    }

    public String getObservacao(){
        return this.observacao;
    }
    
    public Situacao getSituacao(){
        return this.situacao;
    }
    
    public Origem getOrigem(){
        return this.origem;
    }
    
    public Double getValor(){
        return this.valor;
    }

    public Raca getRaca(){
        return this.raca;
    }
}
