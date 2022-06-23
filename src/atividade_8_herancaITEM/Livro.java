package atividade_8_herancaITEM;

public class Livro extends Item {  //subclasse de Item
    
    //atributos:
    private String autor;

    //super construtor:
    public Livro(int codigo, String descricao) {
        super(codigo, descricao);
    }
    public Livro() {
    }

    //gets e sets:
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        if (autor.length()>0) 
        this.autor = autor;
    }
    
     //to string
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Livro [Autor=");
        builder.append(autor);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }




}
