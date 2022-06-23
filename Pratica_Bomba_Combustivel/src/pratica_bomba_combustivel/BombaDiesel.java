package pratica_bomba_combustivel;

public class BombaDiesel extends Bomba {

    //atributos
    private String tipo;

    //construtor
    public BombaDiesel(double quantidade, double preco, String tipo) {
        super(quantidade, preco);
    }

   public BombaDiesel(String tipo) {
        this.tipo = tipo;
    }

    //gets e sets]
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if ((tipo == "S10")
                || (tipo == "S500")
                || (tipo == "S50")
                || (tipo == "S1800")) {
            this.tipo = tipo;
        }
    }

//toString:
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("BombaDiesel [tipo=");
        builder.append(tipo);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

}
