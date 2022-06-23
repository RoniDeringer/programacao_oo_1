package computador;
public class Monitor {
   
    private String marca;
    private String tipo;
    private String resolucao;
    
    //toString:
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nMonitor [marca=");
        builder.append(marca);
        builder.append(", tipo=");
        builder.append(tipo);
        builder.append(", resolucao=");
        builder.append(resolucao);
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

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

}
