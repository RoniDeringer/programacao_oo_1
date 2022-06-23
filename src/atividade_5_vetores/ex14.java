package atividade_5_vetores;
import java.util.Scanner;
/*
. Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de
20 elementos, cujos valores deverão ser compostos pelos elementos intercalados dos dois
outros vetores. 
*/

public class ex14{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int vetor1[] = {1,1,1,1,1,1,1,1,1,1};
        int vetor2[] = {2,2,2,2,2,2,2,2,2,2};
        int vetor3[] = new int[20];
        
        int x = 0;   //x vai pegar as posições pares = (0,2,4,6...)
        
        for (int i = 0; i < 10; i++) {  
            vetor3[x] = vetor1[i];
            x+=2;
            
        }
        
        int y = 1;  // y vai pegar as posições impares = (1,3,5,7,9...)
        
        for (int i = 0; i < 10; i++) {
        vetor3[y] = vetor2[i];
        y+=2;
        }
        for (int i = 0; i < vetor3.length; i++) {
            System.out.println(vetor3[i]);
            
        }
       
    }    
}
