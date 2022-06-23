package atividade_5_vetores;

import java.util.Scanner;

/*
5. Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram
lidas. Imprima as consoantes. 
 */

public class ex05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char vetor[] = new char[5];
        int contCons = 0;
        int contVogal = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println((i + 1) + "ª LETRA:");
            vetor[i] = s.next().toLowerCase().charAt(0);  //toLowerCase() converte pra minusculo

            switch (vetor[i]) {  
                case 'a':
                    contVogal++;
                    break;
                case 'e':
                    contVogal++;
                    break;
                case 'i':
                    contVogal++;
                    break;
                case 'o':
                    contVogal++;
                    break;
                case 'u':
                    contVogal++;
                    break;
                default:
                    contCons++;
            } // fim SWITCH

            }//FIM FOR
        System.out.println("APRESENTAÇÃOES ------------");
        System.out.println("Total consoantes: "+contCons);
        System.out.println("TOTAL VOGAIS: "+contVogal);

        
    }
}
