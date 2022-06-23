package atividade_2;

/*
17. Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao
longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela
abaixo:
 Média de Aproveitamento Conceito
 Entre 9.0 e 10.0 A
 Entre 7.5 e 9.0 B
 Entre 6.0 e 7.5 C
 Entre 4.0 e 6.0 D
 Entre 4.0 e zero E

O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e
a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o
conceito for D ou E.


 */
import java.util.Scanner;

public class ex17 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a 1a nota");
        double nota1 = s.nextDouble();
        System.out.println("Informe a 2a nota");
        double nota2 = s.nextDouble();
        double media = (nota1 + nota2) / 2;

        String conceito = "";

        if (media >= 9) {
            conceito = "A";
        } else if (media >= 7.5) {
            conceito = "B";

        } else if (media >= 6) {
            conceito = "C";

        } else if (media >= 4) {
            conceito = "D";

        } else {
            conceito = "E";
        }
        if ((conceito=="A") && (conceito=="B") && (conceito=="C") ) {
            System.out.println("APROVADO com conceito: "+conceito);
            
        }else{
            System.out.println("REPROVADO com conceito: "+conceito);
        }

    }
}
