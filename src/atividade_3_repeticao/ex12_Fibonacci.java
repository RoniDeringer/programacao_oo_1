package atividade_3_repeticao;

import java.util.Scanner;

/*
12. A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um
programa capaz de gerar a série até o n−ésimo termo.

! soma dos dois números anteriores 

 */
public class ex12_Fibonacci {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int ant = 0;
        int atual = 1;
        int ant2 = 0;
        System.out.println(ant);
        System.out.println(atual);

        for (int i = 0; i < 90; i++) {

            System.out.println(ant + atual);

            ant2 = ant;
            ant = atual;
            atual = atual + ant2;

        }
    }
}
