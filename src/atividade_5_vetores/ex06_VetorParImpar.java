package atividade_5_vetores;

import java.util.Scanner;

/*
6. Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os
números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três
vetores.
 */
public class ex06_VetorParImpar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*
        atributos
         */
        int vetorTotal[] = new int[10];
        int contPar = 0;
        int contImpar = 0;
        // int contDePar = 0;
        //  int contDeImpar = 0;

        /*
        FOR pra receber os valores: 1,2,3,..10
         */
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "º valor: ");
            vetorTotal[i] = (i+1);  //entrada (1,2,3..10)
            System.out.println(vetorTotal[i]);

            if (vetorTotal[i] % 2 == 0) {  //condicao par
                contPar++;

            } else {                   //else impar
                contImpar++;
            }
        } //fim for
        int vetorPar[] = new int[contPar];
        int x = 0;
        int vetorImpar[] = new int[contImpar];
        int y = 0;

        for (int i = 0; i < 10; i++) {

            if (vetorTotal[i] % 2 == 0) {
                vetorPar[x] = vetorTotal[i];
                x++;
                
            }else{
                vetorImpar[y] = vetorTotal[i];
                y++;
            }

            
        }
        
        
        
        System.out.println("____SAIDA_____");
        System.out.println("qtd de pares: "+contPar);
        System.out.println("qtd impar "+contImpar);
        System.out.println("--");
        System.out.println("vetor Total:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorTotal[i]+" - ");
        }
        System.out.println("");
        System.out.println("Vetor PAR:");
        for (int i = 0; i < vetorPar.length; i++) {
            System.out.print(vetorPar[i]+" - ");
        }
        System.out.println("");
            System.out.println("VETOR IMPAR:");
         for (int i = 0; i < vetorImpar.length; i++) {
             System.out.print(vetorImpar[i]+" - ");
        }
   
        
    }
}
