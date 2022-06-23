package pratica_bomba_combustivel;

public class BombaEtanol extends Bomba {

    //atributos
    private String fonte;

    //construtor:
    public BombaEtanol(double quantidade, double preco, String fonte) {
        super(quantidade, preco);
    }

    public BombaEtanol(String fonte) {  //nao sei ao certo
        this.fonte = fonte;
    }

    //gets e sets
    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        if ((fonte == "cana-de-açucar")
                || (fonte == "milho")) {
            this.fonte = fonte;
        }

    }

//toString:
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("BombaEtanol [fonte=");
        builder.append(fonte);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }
}
