package atividade_5_vetores;
import java.util.Scanner;
/*
Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação
e os números.
*/

public class ex08{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int vetor[] = new int [5];
        int soma = 0;
        int multi = 1;
        
        for (int i = 0; i < 5; i++) {
            vetor[i] = i+1;
        soma+= vetor[i];
        }
        
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("valor: "+vetor[i]);
            multi*=vetor[i];
        }
       
        System.out.println("SOMA: "+soma);
        System.out.println("multiplicacao "+multi);
    }    
}
