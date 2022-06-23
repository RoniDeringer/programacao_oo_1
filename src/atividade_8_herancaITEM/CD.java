package atividade_8_herancaITEM;
public class CD extends Midia{  //subClasse de Midia 
    
    //atributos:
    private int faixas;
    private String artista;
    private String album;

    //super construtor:

    public CD(int codigo, String descricao) {
        super(codigo, descricao);
    }
    public CD() {
    }
    
    //gets e sets:
    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        if (faixas > 0 ) 
        this.faixas = faixas;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        if (artista.length() > 0) 
        this.artista = artista;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        if (album.length() > 0) 
        this.album = album;
    }
      //to string
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CD [faixas=");
        builder.append(faixas);
        builder.append(", artista=");
        builder.append(artista);
         builder.append(", album=");
        builder.append(album);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

    
    
    
}
