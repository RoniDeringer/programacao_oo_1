package atividade_3_repeticao;

import java.util.Scanner;

/*
31. Faça um programa que leia dez conjuntos de dois valores, o primeiro representando o
número do aluno e o segundo representando a sua altura em centímetros. Encontre o aluno
mais alto e o mais baixo. Mostre o número do aluno mais alto e o número do aluno mais
baixo, junto com suas alturas.

 */
public class ex31 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double altura = 0;
        double alturaMaior = Integer.MIN_VALUE;
        double alturaMenor = Integer.MAX_VALUE;
        double somaAlt = 0;

        int cod = 0;
        int codAltMaior = 0;
        int codAltMenor = 0;

        int cont = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Codigo:");
            cod = s.nextInt();

                System.out.println("Altura:");
                altura = s.nextDouble();
           

             
                if (altura > alturaMaior) {
                    alturaMaior = altura;
                    codAltMaior = cod;

                }
                if (altura < alturaMenor) { 
                    alturaMenor = altura;
                    codAltMenor = cod;
                }

                
                somaAlt += altura;
                cont++;
            
            System.out.println("");
                    
        }

        System.out.println("-------- ALTURA --------");
        System.out.println("Código da MAIOR altura: " + codAltMaior);
        System.out.println("Comprimento da MAIOR altura: " + alturaMaior);
        System.out.println(".");
        System.out.println("Código da MENOR altura: " + codAltMenor);
        System.out.println("Comprimento da MENOR altura: " + alturaMenor);

    }
}
