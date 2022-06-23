package atividade_3_repeticao;

import java.util.Scanner;

/*
17. Faça um programa que peça um número inteiro e determine se ele é ou não um número
primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1

 */
public class ex17_verificacaoPrimos {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("numero");
        int num = s.nextInt();

        int verificacao = 0;

        for (int i = 1; i <= num; i++) {

            if ((num % i) == 0) {
                verificacao++;   //só pode ter 2, o 1 e ele mesmo se for mais q 2 nao é primo
                
                System.out.println("esse número é divisivel por: "+i);
            }

        }
        System.out.println("-----");
        if (verificacao > 2) {
            System.out.println("nao é primo");

        } else {
            System.out.println("é primo");

        }
    }
}