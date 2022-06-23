package atividade_2;

/*
24. Faça um Programa para leitura de três notas parciais de um aluno. O programa deve
calcular a média alcançada por aluno e presentar:
◦ A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva
média alcançada;
◦ A mensagem "Reprovado", se a média for menor do que 7, com a respectiva
média alcançada;
◦ A mensagem "Aprovado com Distinção", se a média for igual a 10.

 */
import java.util.Scanner;

public class ex24 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nota1, nota2, nota3, media;

        System.out.println("1a nota:");
        nota1 = s.nextInt();
        System.out.println("2a nota:");
        nota2 = s.nextInt();
        System.out.println("3a nota:");
        nota3 = s.nextInt();

        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("media: " + media);

        if (media == 10) {

            System.out.println("Aprovado com distinção");
        } else if (media >= 7) {

            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");

        }

    }
}
