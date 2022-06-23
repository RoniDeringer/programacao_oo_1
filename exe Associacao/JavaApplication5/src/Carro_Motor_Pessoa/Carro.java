package Carro_Motor_Pessoa;

public class Carro {

    private String fabricante;
    private String modelo;
    private String cor;
    private int ano;
    protected Pessoa dono;
    protected Motor motor;

    //GETS E SETS:
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Carro [fabricante=");
        builder.append(fabricante);
        builder.append(", modelo=");
        builder.append(modelo);
        builder.append(", cor=");
        builder.append(cor);
        builder.append(", ano=");
        builder.append(ano);
        builder.append("");  //pessoa
        builder.append(dono);
        builder.append("");  //motor
        builder.append(motor);
        builder.append("]");
        return builder.toString();
    }
}
