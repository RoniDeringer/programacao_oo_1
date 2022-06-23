package atividade_2;

/*
18.Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se
os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo
é: equilátero, isósceles ou escaleno.
Dicas:
Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o
terceiro;
Triângulo Equilátero: três lados iguais;
Triângulo Isósceles: quaisquer dois lados iguais;
Triângulo Escaleno: três lados diferentes
 */
import java.util.Scanner;

public class ex18_triangulo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o lado A do triangulo");
        int a = s.nextInt();
        System.out.println("Informe o lado B do triangulo");
        int b = s.nextInt();
        System.out.println("Informe o lado C do triangulo");
        int c = s.nextInt();

       
        if ((a + b) > c) {  //condição pra ver se é triangulo

            if ((a == b) && (a == c) && (b == c)) {
                System.out.println("Equilatero: Todos lados iguais");
            } else if ((a == b) || (b == c) || (a == c)) {
                System.out.println("Isósceles: quaisquer dois lados iguais");
            } else {
                System.out.println("Escaleno: três lados diferentes");
            }

        } else {
            System.out.println("NAO É UM TRIANGULO");
        }
    }
}
