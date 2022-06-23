package atividade_8_herancaPESSOA;

public abstract class Pessoa {  //abstrata, nao pode ser instanciada

    //atributos:
    private String nome;
    private String endereco;

    //construtor
    public Pessoa(String nome, String endereco) {
        setNome(nome);
        setEndereco(endereco);
    }
    //construtor vazio
    public Pessoa() {
    }

    //gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco.length() > 0) {
            this.endereco = endereco;
        }
    }

    //toString:
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Pessoa [nome=");
        builder.append(nome);
        builder.append(", endereço=");
        builder.append(endereco);
        builder.append("]");
        return builder.toString();
    }

}
