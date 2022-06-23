package atividade_8_herancaITEM;
public class  Midia extends Item{  //subclasse de Item  
    
    //atributos:
    private String gravadora;
    private float duracao;

    //super construtor:

    public Midia(int codigo, String descricao) {
        super(codigo, descricao);
    }
    public Midia() {
    }

    //gets e sets:
    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        if (gravadora.length() > 0) 
        this.gravadora = gravadora;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        if (duracao > 0) 
        this.duracao = duracao;
    }
  //to string
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Midia [gravadora=");
        builder.append(gravadora);
        builder.append(", duracao=");
        builder.append(duracao);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }
    
    
    
}
