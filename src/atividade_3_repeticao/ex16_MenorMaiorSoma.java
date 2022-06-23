package atividade_3_repeticao;
import java.util.Scanner;

/*
16. Faça um programa que, dado um conjunto de N números, determine o menor valor, o
maior valor e a soma dos valores

*/

public class ex16_MenorMaiorSoma{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       
        int soma  = 0;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        char condicao;
         do {
             
             System.out.println("numero");
             int num = s.nextInt();
             if (num>maior) {
                 maior=num;        
             }
             
             if (num<menor) {
                 menor = num;   
             }
             
             soma+= num;
             
             System.out.println("deseja informar mais numeros?");
             condicao = s.next().charAt(0);
             
             
        } while (condicao=='s');
        
         System.out.println("---");
         System.out.println("Soma: "+soma);
         System.out.println("menor: "+menor);
         System.out.println("Maior "+maior);

       
    }    
}
