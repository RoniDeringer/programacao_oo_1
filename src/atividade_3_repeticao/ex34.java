package atividade_3_repeticao;

import java.util.Scanner;

/*
34. Faça um programa que leia uma quantidade indeterminada de números positivos e conte
quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada
de dados deverá terminar quando for lido um número negativo.
    

 */
public class ex34 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char condicao = 0;
        int num = 0;
        int cont25 = 0;
        int cont50 = 0;
        int cont75 = 0;
        int cont100 = 0;        
        
        do {
            do {
                System.out.println("Informe um numero");
                num = s.nextInt();
            } while (num < 0);
            if (num<=25) {
                cont25++;
            }else if (num<=50) {
                cont50++;
            }else if (num <=75) {
                cont75++;
            }else if (num<= 100) {
                cont100++;
            }
            System.out.println("Informar mais numero? 's' ou 'n' ");
            condicao  = s.next().charAt(0);
        } while (condicao=='s');

        System.out.println("[0-25]: "+cont25);
        System.out.println("[26-50]: "+cont50);
        System.out.println("[51-75]: "+cont75);
        System.out.println("[76-100]: "+cont100);
        
    }
}

