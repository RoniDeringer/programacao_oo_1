package Carro_Motor_Pessoa;
public class Main {
    public static void main(String[] args) {    
               
        Pessoa p = new Pessoa();
        p.setNome("Ronaldo");
        p.setEndereco("Avenida Almeida");
        
        Motor m = new Motor();
        m.setMarca("Toyota");
        m.setCilindros(220);
        m.setCombustivel("Gasolina");
        m.setPotencia(450);
        
        Carro c = new Carro();
        c.setAno(2011);
        c.setCor("Azul");
        c.setFabricante("Alemanha");
        c.setModelo("Cabine Dupla");
        c.dono =p;
        c.motor=m;
        
        System.out.println(c);
    }
    
}
