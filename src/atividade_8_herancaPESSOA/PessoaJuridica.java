package atividade_8_herancaPESSOA;
public class PessoaJuridica extends Pessoa {

    //atributos:
    private String cnpj;
    private String tipoEmpresa;

    //super construtor:

    public PessoaJuridica(String nome, String endereco) {
        super(nome, endereco);
    }
    public PessoaJuridica() {
    }

    //gets e sets:
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }
    
    //toString
     @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PessoaJuridica [cnpj=");
        builder.append(cnpj);
        builder.append(", tipo empresa=");
        builder.append(tipoEmpresa);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }
}
