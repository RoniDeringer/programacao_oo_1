package atividade_5_vetores;
import java.util.Scanner;
/*
3. Faça um Programa que leia um vetor de N (constante) números inteiros e apresente as
seguiintes informações, soma, média, maior, menor, pares, ímpares, números acima da
média e números abaixo da média.
*/

public class ex03_maior_par_media_deNvalores{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int soma = 0;
        int media = 0;
        int maior = Integer.MIN_VALUE; 
        int menor = Integer.MAX_VALUE;
        int pares = 0;
        int impares = 0;
        int numAcimaMedia = 0;
        int numAbaixoMedia = 0;
        
        
        System.out.println("Informe a qtd de números q deseja informar:");
        int x = s.nextInt();
        
        int vetor[] = new int[x];
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println((i+1)+"º valor:");
            vetor[i]=s.nextInt();
            
            soma += vetor[i];       //somador de numeros
            
            if (vetor[i] > maior) {   //maior nota é maior q variavel maior?
                maior = vetor[i];
            }
            if (vetor[i] < menor) {   //menor nota é menor q variavel menor?
                menor = vetor[i];
            }
            
            if (vetor[i]%2 ==0) {  //verif. par
                pares++; 
            }else{               //else impar
                impares++;
            }
            
            if (vetor[i] >= 7) {
                numAcimaMedia++;  // cont de num acima 7
                
            }else{
                numAbaixoMedia++;   //cont de num abaixo  7
            }
            
        }

        System.out.println("Soma: "+soma);
        System.out.println("Media: "+(soma/x));
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
        System.out.println("Pares: "+pares);
        System.out.println("Impares "+impares);
        System.out.println("numeros acima da media: "+numAcimaMedia);
        System.out.println("Numeros abaixo da media "+numAbaixoMedia);
    }    
}
