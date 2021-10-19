package classes;

import java.time.LocalDate;

public class Adocao {
    private int iAdocao;
    private String descricao;
    private String observacao;
    private LocalDate data;
    private Double valor;
    private Pessoa pessoa;
    private Pet pet;

    public Adocao(){
        this.setIAdocao(0);
        this.setDescricao(null);
        this.setData(null);
        this.setValor(0.0);
        this.setPessoa(null);
        this.setPet(null);
    }

    public Adocao(int iAdocao, String descricao, LocalDate data, Double valor, Pessoa pessoa, Pet pet){
        this.setIAdocao(iAdocao);
        this.setDescricao(descricao);
        this.setData(data);
        this.setValor(valor);
        this.setPessoa(pessoa);
        this.setPet(pet);
    }
    
    public void setIAdocao(int iAdocao){
        this.iAdocao = iAdocao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setData(LocalDate data){
        this.data = data;
    }
    
    public void setValor(Double valor){
        this.valor = valor;
    }
    
    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }
    
    public void setPet(Pet pet){
        this.pet = pet;
    }

    public int getIAdocao(){
        return this.iAdocao;
    }

    public String getDescricao(){
        return this.descricao;
    }
    
    public LocalDate getData(){
        return this.data;
    }

    public Double getValor(){
        return this.valor;
    }

    public Pessoa getPessoa(){
        return this.pessoa;
    }

    public Pet getPet(){
        return this.pet;
    }

}
