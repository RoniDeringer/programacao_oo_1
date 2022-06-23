package computador;

public class Main {

    public static void main(String[] args) {

        HD hd1 = new HD();
        hd1.setMarca("Toshiba");
        hd1.setModelo("Seagate");
        hd1.setCapacidade(1);
        hd1.setRpm(7200);

        Memoria mem1 = new Memoria();
        mem1.setMarca("HiperX");
        mem1.setModelo("DDR2");
        mem1.setCapacidade(2);
        mem1.setVelocidade(1200);

        Processador pro1 = new Processador();
        pro1.setMarca("Intel");
        pro1.setModelo("LGA 775");
        pro1.setClock(2.5f);
        pro1.setCache(2);

        PlacaMae mb1 = new PlacaMae();
        mb1.setMarca("Asus");
        mb1.setModelo("H61-M");
        mb1.processador=pro1;
        mb1.hd=hd1;
        mb1.memoria=mem1;

        Gabinete gab1 = new Gabinete();
        gab1.setModelo("RGB");
        gab1.setTipo("ATX");
        gab1.setBaias(2);
        gab1.placamae= mb1;

        Monitor mon1 = new Monitor();
        mon1.setMarca("Rog");
        mon1.setTipo("Ultra-Wide");
        mon1.setResolucao("21:9");

        Teclado tec1 = new Teclado();
        tec1.setMarca("Redragon");
        tec1.setTipo("Mecanico");

        Mouse mou1 = new Mouse();
        mou1.setMarca("Logitech");
        mou1.setTipo("Palm");

        Computador pc1 = new Computador();
        pc1.setMarca("Pauta");
        pc1.setModelo("Home-Office");
        pc1.gabinete=gab1;
        pc1.teclado=tec1;
        pc1.mouse=mou1;   
        pc1.monitor = mon1;
        pc1.setTensao(220);  //equipamento eletronico
        pc1.setConsumo(130);  //equipamento eletronico
        

        System.out.println(pc1);

    }
}
