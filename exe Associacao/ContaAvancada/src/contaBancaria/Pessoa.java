package contaBancaria;
public class Pessoa {
    
    private String nome;
    private String endereco;

    @Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[nome=");
		builder.append(nome);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}
    
    
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
