package pratica_bomba_combustivel;

public class Bomba {

    //atributos
    private double quantidade;
    private double preco;
    private double litrosVendidos;

    // construtor
    public Bomba(double quantidade, double preco) {
        setQuantidade(quantidade);
        setPreco(preco);
    }

    public Bomba() {
    }

    //metodos
    private double valorParaLitros(double valor) {
        //valor qtd de dinheiro do cliente
        // return qtd de litros que vai ser abastecido
        //quer abastecer 100 reais
        //preco  da gasolina = 5,00
        //100/5 ou valor/preco
        //return 20Litros
        return valor / preco;
    }

    public boolean abastecerPorLitro(double litros) {
        if (litros < quantidade) {
            this.setQuantidade(this.getQuantidade() - litros);
            return true; 
            //retorna se tem litros no posto
            //se for vdd, ja desconta aut.
        } else {
            return false;

        }
    }

    public boolean abastecerPorValor(double valor) {
      this.valorParaLitros(valor);
      this.abastecerPorLitro(valor);
      return true;
            
        }
        this.valorParaLitros(valor)
        this.abastecerPorLitro(valor);
        if ((this.abastecerPorLitro(valor) == true) &&
            (this.valorParaLitros(valor) >0)) {
                return true;
            }else{
                return false;
            
        } // esse metodo ve se tem gasolina 
            //e se ele informou mais que 0 litros
    }

    public double faturamento() {        
        
        if (this.abastecerPorLitro(preco) ==true
                && this.abastecerPorValor(preco)==true){
            return preco * this.valorParaLitros(preco);
        }else{
            return 0;
        }
        
    }

    //gets e sets
    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public double getLitrosVendidos() {
        return litrosVendidos;
    }

    public void setLitrosVendidos(double litrosVendidos) {
        if (this.abastecerPorLitro(preco)==true) {
            this.litrosVendidos = litrosVendidos+this.valorParaLitros(preco);
            //ele vai ver se tem a gasolina no reservatorio
            //se tiver ele soma a quantidade de litros q o usuario quer
        }
    }

// toString  VERIFICAR SETS
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Bomba [quantidade=");
        builder.append(quantidade);
        builder.append(", preco=");
        builder.append(preco);
        builder.append(", litrosVendidos=");
        builder.append(litrosVendidos);
        builder.append("]");
        return builder.toString();
    }

}
