package contaBancaria;

public class ContaSimples extends ContaBancaria {

    private double saldoPoupanca;

    //metodos
    public boolean depositoPoupanca(double valor) {
        if (valor > 0) {
            this.setSaldoPoupanca(this.getSaldoPoupanca() + valor);
            System.out.println("Deposito na Poupança feito com sucesso!!!");
            System.out.print("Seu saldo Agora é de: R$");
            System.out.println(this.getSaldoPoupanca());
            return true;
        } else {
            System.out.println("Valor Inválido, ERRO");
            return false;
        }
    }

    public boolean saquePoupanca(double valor) {
        if (valor > 0) {

            if (valor <= this.getSaldoPoupanca()) {
                this.setSaldoPoupanca(this.getSaldoPoupanca()-valor);
                System.out.print("Seu saldo agora é de: R$");
                System.out.println(this.getSaldoPoupanca());
                return true;
            } else {
                System.out.println("Saldo Indisponivel");
                return false;
            }
        } else {
            System.out.println("Valores negativos são inválidos");
            return false;
        }
    }

    //toString:
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nContaSimples [saldoPoupanca=");
        builder.append(saldoPoupanca);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

}
