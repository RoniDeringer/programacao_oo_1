package atividade_8_herancaITEM;
public class ItemMain {
    public static void main(String[] args) {

        Livro livro1 = new Livro(1,"Livro de fadas");
        livro1.setAutor("romero brito");
        System.out.println(livro1);

        System.out.println("------");
        
        CD cd1 = new CD(2,"cd de rock");
        cd1.setGravadora("gravadora beiraRio");//classe Midia
        cd1.setDuracao(10.58f);                //classe Midia
        cd1.setFaixas(10);                     //classe CD
        cd1.setArtista("charlie brown");       //classe CD
        cd1.setAlbum("so os louvos sabem");    //classe CD
        System.out.println(cd1);

        System.out.println("------");
        
        VHS vhs1 = new VHS(3,"vhs de baleias");
        vhs1.setGravadora("warner brows");
        vhs1.setDuracao(80.2f);
        vhs1.setTitulo("Free willy");
        System.out.println(vhs1);

    }
}
