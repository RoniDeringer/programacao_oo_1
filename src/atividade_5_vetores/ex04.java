package atividade_5_vetores;
import java.util.Scanner;
/*
4. Faça um Programa que leia 4 notas, mostre as notas e a média na tela. 
*/

public class ex04{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
    int vetor4[] = new int [4];
    int soma = 0;
    
        for (int i = 0; i < vetor4.length; i++) {
            System.out.println((i+1)+"º nota:");
            vetor4[i] = s.nextInt();
            
            soma+= vetor4[i];
        }
        System.out.println("APRESENTAÇÃO ----------- "); 
       
        for (int i = 0; i < vetor4.length; i++) {
            System.out.println((i+1)+"º valor: "+vetor4[i] );
        }
        System.out.println("MEDIA: "+(soma/4));
       
    }    
}
