package atividade_3_repeticao;
import java.util.Scanner;

/*
5. Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois
modifique o programa para que ele mostre os números um ao lado do outro.

*/

public class ex05{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            
            
        }
        System.out.println("");
         for (int i = 0; i < 20; i++) {
             System.out.print(" "+i);
            
        }

       
    }    
}
