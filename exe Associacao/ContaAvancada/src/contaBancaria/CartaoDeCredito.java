package contaBancaria;
public class CartaoDeCredito {
 
    private int numero;
    private String operadora;
    private double limite;
    private String tipoDeCartao;

    
     //toString de Conta Especial
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nCartaoDeCredito [numero=");
        builder.append(numero);
        builder.append(", operadora=");
        builder.append(operadora);
        builder.append(", limite=");
        builder.append(limite);
        builder.append(", tipoDeCartao=");
        builder.append(tipoDeCartao);
        builder.append("]");
        return builder.toString();
    }
    
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getTipoDeCartao() {
        return tipoDeCartao;
    }

    public void setTipoDeCartao(String tipoDeCartao) {
        this.tipoDeCartao = tipoDeCartao;
    }
    
    
    
    
    
}
