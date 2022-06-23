package computador;
public class PlacaMae {
    
    private String marca;
    private String modelo;
    protected Processador processador;
    protected HD hd;
    protected Memoria memoria;
    
      //toString:
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nPlacaMae [marca=");
        builder.append(marca);
        builder.append(", modelo=");
        builder.append(modelo);
        builder.append("");
        builder.append(processador);
        builder.append("");
        builder.append(hd);
        builder.append("");
        builder.append(memoria);
        builder.append("]");
        return builder.toString();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public HD getHd() {
        return hd;
    }

    public void setHd(HD hd) {
        this.hd = hd;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }
    
}
