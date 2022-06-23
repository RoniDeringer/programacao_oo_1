package atividade_5_vetores;
import java.util.Scanner;
/*
10. Faça um programa que peça um texto e coloque-o em um vetor onde cada carácter ocupará
uma posição do vetor
*/

public class ex10_ContarLetrasString_VetorRecebeString{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String texto = "RONI DERINGER";
        int qtdLetras = texto.length();   //verifica quantas letras tem com espaço = 9
        System.out.println("Total de letras com espaço: "+qtdLetras);
        
        int qtdCharSemEspaco = texto.replace(" ", "").length();  //quantas letras tem sem espaço = 7
        System.out.println("total de letras sem espaço: "+qtdCharSemEspaco);
        
        System.out.println("------");
        
        char vetor[] = new char[qtdLetras];
        
        for (int i = 0; i < qtdLetras; i++) {  //vai percorer 9x 
            vetor[i] = texto.charAt(i);
            System.out.println(vetor[i]);
            System.out.println("");
        }

            
            
        
    

       
    }    
}
