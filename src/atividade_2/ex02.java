package atividade_2;
import java.util.Scanner;
/*
    Faça um Programa que peça um valor e mostre na tela se o valor é positivo, negativo
    ou zero.
*/
public class ex02{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe um número");
        double num = s.nextDouble();
        if(num>0){
           System.out.println("número positivo");
           
        } else if(num < 0){
           System.out.println("número negativo");
        }else{
           System.out.println("número 0");
        }
 

       
    }    
}
