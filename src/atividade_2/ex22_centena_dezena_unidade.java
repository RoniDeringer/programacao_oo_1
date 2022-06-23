package atividade_2;

/*
22. Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade
de centenas, dezenas e unidades do mesmo.
Exemplo:
326 = 3 centenas, 2 dezenas e 6 unidades
12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25,
20, 10, 21, 11, 1, 7 e 16
 */
import java.util.Scanner;

public class ex22_centena_dezena_unidade {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      
        int num, 
            unid,
            deze,
            cent;
        
        System.out.println("Informe um número até 999");
        num = s.nextInt();
       
        
        unid = num % 10;    //se fosse 321 retornaria 1 pq= 321/10= 32,'1' ou seja o resto é 1
        num/= 10;           //antes num era 321 agora é 32 = ou seja os números a frente da virgula
        
        deze = num % 10;    //se fosse 321 retornaria 2
        num /= 10;          //antes num era 321 agora é 3
        
        cent = num % 10;    
        
        System.out.println("Centena: "+cent);
        System.out.println("Dezena:  "+deze);
        System.out.println("Unidade: "+unid);
}}// me inspirei https://www.guj.com.br/t/separando-os-digito-em-um-inteiro/71738/6
