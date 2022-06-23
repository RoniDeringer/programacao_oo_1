package atividade_5_vetores;
import java.util.Scanner;
/*
2. Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa a
ordem lida.
*/

public class ex02{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int vetor10[] = new int [10];
        
        for (int i = 0; i < vetor10.length; i++) {
            System.out.println(i+"º numero recebe: "+i);
            vetor10[i] = i;   
        }
        
        System.out.println("---------------");
        
        
        for (int i = 9; i >= 0; i--) {  //apresenta de tras pra frente
      
            System.out.println(i+"º numero: "+vetor10[i]);
        }
       
    }    
}
