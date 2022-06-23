package atividade_3_repeticao;

import java.util.Scanner;

/*
13. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120


 */
public class ex13_Fatorial {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("numero");
        int num = s.nextInt();
        
        int fat = 1;
        for (int i = 2; i <= num; i++) {
            fat *= i;
        }
        System.out.println(fat);

    }
}
