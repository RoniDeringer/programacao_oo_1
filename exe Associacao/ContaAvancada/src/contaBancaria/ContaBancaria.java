package contaBancaria;

public class ContaBancaria {

    protected Banco banco;
    private int agencia;
    private int numeroDaConta;
    private double saldo;
    protected Pessoa correntista;

//metodos normais:
    public boolean deposito(double valor) {
        if (valor > 0) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito feito com sucesso");
            System.out.print("Seu saldo agora é de: R$");
            System.out.println(this.getSaldo());
            return true;
        } else {
            System.out.println("Saldo Insuficiente");
            return false;
        }
    }

    public boolean saque(double valor) {
        if (valor > 0) {
            if (valor <= this.getSaldo()) {
                this.setSaldo(this.getSaldo() - valor);  //atualiza o valor do conta
                System.out.println("saque com sucesso");
                System.out.print("Seu saldo agora é de: R$");
                System.out.println(this.getSaldo());
                return true;

            } else {
                System.out.println("Saldo Insuficiente");
                return false;

            }
        } else {
            System.out.println("Valor Negativo é Inválido");
            return false;
        }
    }

//toString:
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nContaBancaria [");
        builder.append(banco);
        builder.append(", agencia=");
        builder.append(agencia);
        builder.append(", numeroDaConta=");
        builder.append(numeroDaConta);
        builder.append(", saldo=");
        builder.append(saldo);
        builder.append(", \ncorrentista=");
        builder.append(correntista);
        builder.append("]");
        return builder.toString();
    }
    //gets e sets

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Pessoa getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Pessoa correntista) {
        this.correntista = correntista;
    }

}
