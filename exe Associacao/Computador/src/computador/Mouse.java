package computador;
public class Mouse {

    private String marca;
    private String tipo;
    
     //toString:
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nMouse [marca=");
        builder.append(marca);
        builder.append(", tipo=");
        builder.append(tipo);
        builder.append("]");
        return builder.toString();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
