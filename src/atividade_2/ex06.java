package atividade_2;

/*
6. Faça um Programa que peça um número inteiro e se este número for par, 
transforme-o em impar e vice-versa.
 */
import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe um número");
        double num = s.nextDouble();

        System.out.println("");
        System.out.println("o número: " + num);

        if (num % 2 == 0) {     //condição PAR
            num++;
            System.out.println("Agora é ÍMPAR " + num);

        } else {                //condição IMPAR
            num++;
            System.out.println("Agora é PAR" + num);
        }

    }
}

