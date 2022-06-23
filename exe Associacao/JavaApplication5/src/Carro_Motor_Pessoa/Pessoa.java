package Carro_Motor_Pessoa;

public class Pessoa {

    //atributos
    private String nome;
    private String endereco;

   
    //toString
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nPessoa [nome=");
        builder.append(nome);
        builder.append(", endereco=");
        builder.append(endereco);
        builder.append("]");
        return builder.toString();
    }

    //gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
