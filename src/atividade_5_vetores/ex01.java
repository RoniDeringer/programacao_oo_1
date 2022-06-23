package atividade_5_vetores;
import java.util.Scanner;
/*
1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os. 
*/

public class ex01{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int num[]=new int[5];
        
        for (int i = 0; i < num.length; i++) {
            
        System.out.println("Informe o "+(i+1)+"º número: ");
        num[i] = s.nextInt();       
    }    
        for (int i = 0; i < num.length; i++) {
            System.out.println((i+1)+"º número: "+num[i]);
            
        }
}}
