package atividade_3_repeticao;
import java.util.Scanner;

/*
11. Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de
números pares e a quantidade de números impares.

*/

public class ex11{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int contPar = 0;
        int contImpar = 0;
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println((i+1)+"º número");
            int num = s.nextInt();
            if ((num%2) ==0) {
                contPar++;
            }else{
                contImpar++;
            }            
        }
        System.out.println("qtd impar: "+contImpar);
            System.out.println("qtd par "+contPar);
       
    }    
}
