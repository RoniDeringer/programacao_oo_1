package atividade_5_vetores;

import java.util.Scanner;

/*
Dado um vetor contendo todas as letras do nosso alfabeto (minúsculas) gere uma senha para
o usuário. Para isto o usuário deve informar o tamanho da senha que deseja, este tamanho
deve ser menor que a quantidade de letras no vetor. A senha gerada deve seguir o padrão
consoante+vogal para tamanhos pares e consoante+vogal e terminada em consoante para
tamanhos ímpares.

ex: senha com 12 letras : b a c e d i f o g u h a
                          C V C V C V C V C V C V  
C= consoanete
V= vogal

 */

public class ex09_GerarSenhaVogalCons {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

         char vetorCons[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 
            'k', 'l', 'm', 'n', 'o', 'p', 'q'}; //14
         
         int c=0;
         
         
        char vetorVog[] = {'a', 'e', 'i', 'o', 'u', 'a', 'e', 'i', 
            'o', 'u', 'a', 'e', 'i', 'o', 'u'};  //15
        
        int v = 0;
        
        
        System.out.println("tamanho da senha: ");
        int tam = s.nextInt();

        char vetor[] = new char[tam]; //vetor principal
        
        //termina cons impar
        
        
        for (int i = 0; i < vetor.length; i++) {
            
            if (i%2==0) {
                vetor[i] = vetorVog[v]; 
                v++;
            }else{
                vetor[i] = vetorCons[c];
                c++;
            }
        }//fim for
       
        
        System.out.println("_____SAIDA_____");
        System.out.println("");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");
            
            
        }
  
      

    }
}
