package atividade_8_herancaITEM;

public abstract class Item {  //CLASSE ABSTRATA

    //atributos:
    private int codigo;
    private String descricao;

    //construtor
    public Item(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    //construtor vazio
    public Item() {
    }

    //gets e sets
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao.length() > 0) {
            this.descricao = descricao;
        }
    }

    //toString:
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Item [codigo=");
        builder.append(codigo);
        builder.append(", descrição=");
        builder.append(descricao);
        builder.append("]");
        return builder.toString();
    }

}
