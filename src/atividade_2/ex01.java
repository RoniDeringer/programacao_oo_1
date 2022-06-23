package atividade_2;

import java.util.Scanner;
/*
1. Faça um Programa que peça dois números e imprima o maior deles.
*/

public class ex01{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o primeiro número");
        double num1 = s.nextDouble();
        System.out.println("Informe o  segundo número");
        double num2 = s.nextDouble();

        double maiorNum = 0;
        if(num1>num2){
            maiorNum = num1;
           System.out.println("Maior número é o "+maiorNum);
           
        } else if(num2>num1){
            maiorNum = num2;
            System.out.println("maior número é o "+maiorNum);
        }else{
           System.out.println("você informou dois números iguais");
        }
 

       
    }    
}