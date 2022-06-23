package pratica_bomba_combustivel;
public class MainBomba {
    public static void main(String[] args) {
        
        
        BombaDiesel bd = new BombaDiesel(10,5,"S10");
        BombaEtanol be = new BombaEtanol(20,5,"milho");
        BombaGasolina bg = new BombaGasolina(30,5,"simples");
        
        //DIESEL:
        System.out.println(bd.valorParaLitros(100)); //retorna 20 Litros
        
                
                
          
        
        
        
    }
    
}
