package enums;

public enum Situacao {
    A("Ativo"),
    I("Inativo");

    private String descricao;

    private Situacao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return descricao;
    }
}
