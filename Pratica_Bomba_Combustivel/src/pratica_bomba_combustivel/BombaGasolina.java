package pratica_bomba_combustivel;
public class BombaGasolina extends Bomba {
    
    //atributos
    private String tipo;
    
    //construtor

    public BombaGasolina(double quantidade, double preco, String tipo) {
        super(quantidade, preco);
    }

    public BombaGasolina(String tipo) {
        this.tipo = tipo;
    }
  

    //gets e sets]
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if ((tipo == "aditivada") 
            || (tipo== "normal"))
        this.tipo = tipo;
    }
    
    //toString:
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("BombaGasolina [tipo=");
        builder.append(tipo);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }
    
}
