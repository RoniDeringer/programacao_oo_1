package atividade_8_herancaPESSOA;

public class PessoaFisica extends Pessoa {  //subClasse de Pessoa

    private String cpf;
    private String estadoCivil;

    //super construtor 
    public PessoaFisica(String nome, String endereco) {
        super(nome, endereco);
    }

    public PessoaFisica() {
    }

    //gets e sets
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    //toString:
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PessoaFisica [cpf=");
        builder.append(cpf);
        builder.append(", estado civil=");
        builder.append(estadoCivil);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }
}
