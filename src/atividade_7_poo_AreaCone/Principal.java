package atividade_7_poo_AreaCone;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
    Calculos c = new Calculos(10,5,1);
    //objeto instanciando recebendo altura, raio e tipoTinta
    
    
    c.dadosEntrada();
    // c.status();
    c.calculosMedidas();
    c.calculoTintas();
    c.valorFinal();
    // c.saida();
    
        System.out.println(c);
    
    //fiz separado os calculos pra ser mais organizado e melhor pra eu ir entendendo 
    
    }
}
