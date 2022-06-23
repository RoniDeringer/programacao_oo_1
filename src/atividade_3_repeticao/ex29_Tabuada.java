package atividade_3_repeticao;

import java.util.Scanner;

/*
29. Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será
digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1 e terminar em
10, o valor inicial e final devem ser informados também pelo usuário, conforme exemplo
abaixo:
• Montar a tabuada de: 5
Começar por: 4
Terminar em: 7
Vou montar a tabuada de 5 começando em 4 e terminando em 7:
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35

Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.

//fazer a diferença entre os 2 valores pra fazer o i

 */
public class ex29_Tabuada {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char condicaoComeco = 0;
        int diferenca = 0;

        System.out.println("Montar a tabuada de: ");
        int valor = s.nextInt();
        int comec = 0;
        int term = 0;

        do {
            System.out.println("Começar por: ");
            comec = s.nextInt();  
            System.out.println("Terminar em: ");
            term = s.nextInt();     

            if (term > comec) {
                condicaoComeco = 'n';

            } else {         //o usuario informou o valor term menor e vai informar dnv
                condicaoComeco = 's';
                System.out.println("Valor Inválido, informe novamente!");
            }

        } while (condicaoComeco == 's');

             
        
        for (int i = comec; i <= term; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }

    }
}
