package atividade_3_repeticao;

import java.util.Scanner;

/*
30. Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o
mais baixo, a mais gordo e o mais magro, para isto você deve fazer um programa que
pergunte a cada um dos clientes da academia seu código, sua altura e seu peso. O final da
digitação de dados deve ser dada quando o usuário digitar 0 (zero) no campo código. Ao
encerrar o programa também deve ser informados os códigos e valores do clente mais alto,
do mais baixo, do mais gordo e do mais magro, além da média das alturas e dos pesos dos
clientes

 */
public class ex30 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double altura = 0;
        double alturaMaior = Integer.MIN_VALUE;
        double alturaMenor = Integer.MAX_VALUE;
        double somaAlt = 0;

        double peso = 0;
        double pesoMaior = Integer.MIN_VALUE;
        double pesoMenor = Integer.MAX_VALUE;
        double somaPeso = 0;

        int cod = 0;
        int codAltMaior = 0;
        int codAltMenor = 0;
        int codPesoMaior = 0;
        int codPesoMenor = 0;

        int cont = 0;

        do {
            System.out.println("Codigo:");
            cod = s.nextInt();
            if (cod != 0) {  //se informar diferente de zero ele pede as outras info

                System.out.println("Altura:");
                altura = s.nextDouble();
                System.out.println("Peso:");
                peso = s.nextDouble();

                if (peso > pesoMaior) {
                    pesoMaior = peso;
                    codPesoMaior = cod;

                }
                if (peso < pesoMenor) {
                    pesoMenor = peso;
                    codPesoMenor = cod;
                }
                if (altura > alturaMaior) {
                    alturaMaior = altura;
                    codAltMaior = cod;

                } 
                if (altura < alturaMenor) {  //nao botei else, pq se só tiver 1 aluno vai ser o mais pesado e o mais leve
                    alturaMenor = altura;
                    codAltMenor = cod;
                }

                somaPeso += peso;
                somaAlt += altura;
                cont++;
            } //fim do if, 
            System.out.println("");
        } while (cod != 0);
 
        System.out.println("-------- ALTURA --------");
        System.out.println("Código da MAIOR altura: " + codAltMaior);
        System.out.println("Comprimento da MAIOR altura: " + alturaMaior);
        System.out.println(".");
        System.out.println("Código da MENOR altura: " + codAltMenor);
        System.out.println("Comprimento da MENOR altura: " + alturaMenor);
        System.out.println("-------- PESO --------");
        System.out.println("Código do MAIOR peso: " + codPesoMaior);
        System.out.println("Kilos do MAIS pesado: " + pesoMaior);
        System.out.println(".");
        System.out.println("Código do MENOR peso: " + codPesoMenor);
        System.out.println("Kilos do MENOS pesado: " + pesoMenor);
        System.out.println("");
        System.out.println("Média da altura: " + somaAlt / cont);
        System.out.println("Média do peso " + somaPeso / cont);
    }
}
