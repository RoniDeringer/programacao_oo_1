package atividade_8_herancaSIMPLES;

public class ContaSimples extends Conta {

    //atributos
    private double saldopoupanca;

    //super construtor
    public ContaSimples(String banco,
            int agencia, int numeroconta,
            double saldo) {

        super(banco, agencia, numeroconta,
                saldo);
    }
    public ContaSimples() {
    }
    
    
    //gets e sets

    public double getSaldopoupanca() {
        return saldopoupanca;
    }

    public void setSaldopoupanca(double saldopoupanca) {
        this.saldopoupanca = saldopoupanca;
    }

    //meotos: #############
    public boolean depositoPoupanca(double valor) {
        if (valor > 0) {
            setSaldopoupanca(getSaldopoupanca() + valor);
            return true;
        }
        return false;
    }

    public boolean saquePoupanca(double valor) {
        if (valor <= getSaldopoupanca() && valor > 0) {
            setSaldopoupanca(getSaldopoupanca() - valor);
            return true;
        }
        return false;
    }

    // Esse método não está no Diagrama de Classe, só coloquei como exemplo
    public double total() {
        return getSaldo() + getSaldopoupanca();
    }

    //to string
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ContaSimples [saldopoupanca=");
        builder.append(saldopoupanca);
        builder.append(", total()=");
        builder.append(total());
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

}
