package atividade_8_herancaITEM;
public class VHS extends Midia{  //subClasse de Midia 
    
    
    //atributos:
    private String titulo;

    //super construtor:

    public VHS(int codigo, String descricao) {
        super(codigo, descricao);
    }
    public VHS() {
    }

    //gets e sets:

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.length()>0) 
        this.titulo = titulo;
    }
      //to string
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("VHS [Titulo=");
        builder.append(titulo);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

    
    
    
}
