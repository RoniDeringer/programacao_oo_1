/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_1;
import java.util.Scanner;
/**
 *
 * @author Roni
 */
public class ex10_quadradoECubo {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 
        System.out.println("Informe um núemro inteiro");
        double int1 = s.nextDouble();
        System.out.println("Informe outro núemro inteiro");
        double int2 = s.nextDouble();
        System.out.println("Informe um núemro REAL");
        double real = s.nextDouble();

        System.out.println("a: "+( (int1*2) * (int2/2) ) );
        System.out.println("b: "+( (int1*3) + real ) );
        System.out.println("c: "+ (Math.pow(real, 3) ));

    }    
}
