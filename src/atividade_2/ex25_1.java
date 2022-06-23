package atividade_2;

/*
25. Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica:
utilize o operador módulo (resto da divisão).
 */
import java.util.Scanner;

public class ex25_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Valor:");
        int valor = s.nextInt();
        
        int condicao = valor%2;
        if (condicao ==0) {
            System.out.println(valor+" é par");
            
        }else{
            System.out.println(valor+" é impar");
        }

    }
}
