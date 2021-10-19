package enums;

public enum Origem {
    D("Doação"),
    O("Ong"),
    R("Rua");

    private String descricao;

    private Origem(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return descricao;
    }
}
