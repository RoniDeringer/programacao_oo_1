package atividade_3_repeticao;

import java.util.Scanner;

/*
1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor
seja inválido e continue pedindo até que o usuário informe um valor válido.

 */
public class ex01_boolean {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean condicao;

        do {
            System.out.println("Informe um número entre 0 a 10");
            double num = s.nextDouble();

            if (num >= 0 && num <= 10) {
                condicao = false;
                System.out.println("Ok");
            } else {
                condicao = true;       //vai receber verdadeiro enquanto informar numero errado
                System.out.println("Valor inválido, informe outro valor");
            }

        }while (condicao == true);  //enquanto condicao receber verdadeiro vai executar

       
    
    }
}
