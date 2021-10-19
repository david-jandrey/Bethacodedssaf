package enums;

public enum TipoLogradouro {

    A("Avenida"),
    B("Beco"),
    E("Estrada");

    private String descricao;

    private TipoLogradouro(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return descricao;
    }

}
