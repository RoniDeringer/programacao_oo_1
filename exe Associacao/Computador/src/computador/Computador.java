package computador;

public class Computador extends EquipamentoEletronico {

    private String marca;
    private String modelo;
    protected Gabinete gabinete;
    protected Teclado teclado;
    protected Mouse mouse;
    protected Monitor monitor;

    //toString:
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nComputador [marca=");
        builder.append(marca);
        builder.append(", modelo=");
        builder.append(modelo);
        builder.append("");
        builder.append(gabinete);
        builder.append("");
        builder.append(teclado);
        builder.append("");
        builder.append(mouse);
        builder.append("");
        builder.append(monitor);
        builder.append(", \ntoString()=");
        builder.append(super.toString());
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

    public Gabinete getGabinete() {
        return gabinete;
    }

    public void setGabinete(Gabinete gabinete) {
        this.gabinete = gabinete;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    
    
}
