package classes;

import java.time.LocalDate;

public class Pessoa {
    private int iPessoa;
    private String nome;
    private String rg;
    private String cpf;
    private LocalDate dtNacto;
    private String cep;
    private int numero;
    private String complemento;
    private Logradouro logradouro;
    private Cidade cidade;
    private Bairro bairro;

    public Pessoa(){
        this.setIPessoa(0);
        this.setNome("sem nome");
        this.setRg(null);
        this.setCpf(null);
        this.setDtNacto(null);
        this.setCep(null);
        this.setNumero(0);
        this.setComplemento(null);
        this.setCidade(null);
        this.setLogradouro(null);
        this.setBairro(null);
    }
    public Pessoa(int iPessoa, String nome,String rg, String cpf, LocalDate dtNacto, String cep,  int numero, String complemento, Cidade cidade, Logradouro logradouro, Bairro bairro){
        this.setIPessoa(iPessoa);
        this.setNome(nome);
        this.setRg(rg);
        this.setCpf(cpf);
        this.setDtNacto(dtNacto);
        this.setCep(cep);
        this.setNumero(numero);
        this.setComplemento(complemento);
        this.setCidade(cidade);
        this.setLogradouro(logradouro);
        this.setBairro(bairro);
    }
    
    public void setIPessoa(int iPessoa){
        this.iPessoa = iPessoa;
    }

    public void setNome(String nome){
        this.nome=nome.trim().isEmpty() ? "SEM NOME" : nome.toUpperCase();
    }
    
    public void setRg(String rg){
        this.rg = rg;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setDtNacto(LocalDate dtNacto){
        this.dtNacto = dtNacto;
    }
    
    
    public void setCep(String cep){
        this.cep = cep;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    
    public void setCidade(Cidade cidade){
        this.cidade = cidade;
    }

    public void setLogradouro(Logradouro logradouro){
        this.logradouro = logradouro;
    }

    public void setBairro(Bairro bairro){
        this.bairro = bairro;
    }
    
    public int getIPessoa(){
        return this.iPessoa;
    }

    public String getNome(){
        return this.nome;
    }
    
    public String getRg(){
        return this.rg;
    }

    public String getCpf(){
        return this.cpf;
    }
    
    public LocalDate getDtNacto(){
        return this.dtNacto;
    }
    
    public String getCep(){
        return this.cep;
    }
    
    public int getNumero(){
        return this.numero;
    }

    public String getComplemento(){
        return this.complemento;
    }

    public Cidade getCidade(){
        return this.cidade;
    }

    public Logradouro getLogradouro(){
        return this.logradouro;
    }

    public Bairro getBairro(){
        return this.bairro;
    }

    @Override
    public String toString(){
        return this.nome;
    }
}
