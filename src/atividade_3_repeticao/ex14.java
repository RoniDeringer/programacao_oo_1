package atividade_3_repeticao;

import java.util.Scanner;

/*
14. Faça um programa que mostre os n termos da Série a seguir:
• S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. 

 */
public class ex14 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int impar = 1;
        boolean condicao;

        for (int i = 1; i < 11; i++) {

            do {
                if ((impar % 2) == 0) {
                    condicao = true;
                    impar++;        //dor de cabeça até q me toquei q tinha  qpor esse ++ aqui
                } else {
                    condicao = false;

                }
            } while (condicao == true);

            System.out.println(i + "/" + (impar));
            impar++;

        }
    }
}
