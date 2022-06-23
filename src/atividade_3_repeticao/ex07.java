package atividade_3_repeticao;

import java.util.Scanner;

/*
7. Faça um programa que receba dois números inteiros e gere os 
números inteiros que estão no intervalo compreendido por eles.


 */
public class ex07 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int variavel = 0;

        System.out.println("numero1");
        int num1 = s.nextInt();
        System.out.println("numero2");
        int num2 = s.nextInt();
        System.out.println("----");
        
        
        if (num1 > num2) {
            variavel = num2;
            
            while (num1 > (variavel+1)) {  //pra nao mostrar o ultimo numero 
                variavel++;
                System.out.println(variavel);
            }
           
            
            
        } else {
            variavel = num1;
           
            while (num2 > (variavel+1)) {//pra nao mostrar o ultimo numero 
                variavel++;
                System.out.println(variavel);
            }

        }

    }
}
