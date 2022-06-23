package atividade_3_repeticao;
import java.util.Scanner;

/*
6. Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.


*/

public class ex06{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

         for (int i = 0; i < 50; i++) {
             if ((i%2) !=0) {
                 System.out.println(i);
             }
             
             
        }

       
    }    
}
