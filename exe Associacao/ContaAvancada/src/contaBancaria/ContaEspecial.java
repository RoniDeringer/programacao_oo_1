package contaBancaria;

public class ContaEspecial extends ContaBancaria {

    //atributos
    private int diasSemJuros;
    private double limite;
    protected CartaoDeCredito cartao;


    //toString de Conta Especial
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nContaEspecial [diasSemJuros=");
        builder.append(diasSemJuros);
        builder.append(", limite=");
        builder.append(limite);
        builder.append("");
        builder.append(cartao);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

    //gets e sets:

    public int getDiasSemJuros() {
        return diasSemJuros;
    }

    public void setDiasSemJuros(int diasSemJuros) {
        this.diasSemJuros = diasSemJuros;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public CartaoDeCredito getCartao() {
        return cartao;
    }

    public void setCartao(CartaoDeCredito cartao) {
        this.cartao = cartao;
    }



    
    
    
}
