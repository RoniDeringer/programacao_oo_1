package computador;
public class Gabinete {
    
    private String modelo;
    private String tipo;
    private int baias;
    protected PlacaMae placamae;
    
     //toString:
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nGabinete [modelo=");
        builder.append(modelo);
        builder.append(", tipo=");
        builder.append(tipo);
        builder.append(", baias=");
        builder.append(baias);
        builder.append("");
        builder.append(placamae);
        builder.append("]");
        return builder.toString();
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getBaias() {
        return baias;
    }

    public void setBaias(int baias) {
        this.baias = baias;
    }

    public PlacaMae getPlacamae() {
        return placamae;
    }

    public void setPlacamae(PlacaMae placamae) {
        this.placamae = placamae;
    }
}
