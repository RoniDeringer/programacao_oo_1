package atividade_5_vetores;

import java.util.Arrays;
import java.util.Scanner;

/*
13. Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no
seu respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida. Mostrar
também idade e altura do mais velho, mais novo, mais baixo e mais alto. Mostrar idade e
altura de quem está abaixo e acima da média de idade e altura;
 */
public class ex13_ {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*
        variaveis
         */
        int vetorIdade[] = new int[5];
        int vetorAltura[] = new int[5];
        int menorAltura = Integer.MAX_VALUE;
        int maiorAltura = Integer.MIN_VALUE;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int somaAltura = 0;
        int somaIdade = 0;
        int mediaAltura = 0;
        int mediaIdade = 0;
        int contAlturaMedia = 0;
        int contIdadeMedia = 0;

        /*
        entrada de dados
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("IDADE DA PESSOA: " + (i + 1));
            vetorIdade[i] = s.nextInt();
            System.out.println("ALTURA DA PESSOA: " + (i + 1));
            vetorAltura[i] = s.nextInt();

            /*
            verificação maior e menor = altura e idade
             */
            if (vetorAltura[i] > maiorAltura) {
                maiorAltura = vetorAltura[i];

            } else if (vetorAltura[i] < menorAltura) {
                menorAltura = vetorAltura[i];
            }
            if (vetorIdade[i] > maiorIdade) {
                maiorIdade = vetorIdade[i];

            } else if (vetorIdade[i] < menorIdade) {
                menorIdade = vetorIdade[i];
            }

            /*
            somadores
             */
            somaIdade += vetorIdade[i];
            somaAltura += vetorAltura[i];

        } //fim laco de recebe dados

        /*
        calculo de medias
         */
        mediaIdade = somaIdade / 5;
        mediaAltura = somaAltura / 5;

        /*
        for pra calcular quem esta abaixo de media de idade e altura
         */
 /*
        pra isso preciso fazer um cont pra ver quantos estao abaixo da media
        pra dai fazer um vetor com a quantidade de pessoas exatas abaixo da media 
        pra cada entrada (altura e idade)
         */
        for (int i = 0; i < 5; i++) {

            if (vetorAltura[i] < mediaAltura) {
                contAlturaMedia++;
            }
            if (vetorIdade[i] < mediaIdade) {
                contIdadeMedia++;
            }
        } //fim for

        /*
        criar vetor com a qtd de $altura e $idade abaixo da media
         */
        int vetorIdadeMedia[] = new int[contIdadeMedia];
        int vetorAlturaMedia[] = new int[contAlturaMedia];

        /*
        agora vou percorer os vetores principais e receber os dados 
        dos vetores $vetorAltura e $vetorIdade 
        nos vetores novos de baixo da media
         */
        int x = 0;
        for (int i = 0; i < 5; i++) {
            if (vetorIdade[i] < mediaIdade) {

                vetorIdadeMedia[x] = vetorIdade[i];
                x++;
            }
        }//fim for

        int y = 0;  //

        for (int i = 0; i < 5; i++) {
            if (vetorAltura[i] < mediaAltura) {
                vetorAlturaMedia[y] = vetorAltura[i];
                y++;
            }
        }
        System.out.println("------");
        for (int i = 4; i >= 0; i--) {
            System.out.println("DADOS DA FORMA INVERSA: Pessoa " + (1 + i));
            System.out.println("altura: " + vetorAltura[i]);
            System.out.println("Idade: " + vetorIdade[i]);

        }
        System.out.println("------");
        for (int i = 0; i < vetorIdadeMedia.length; i++) {
            System.out.println("Idades abaixo da media: "+vetorIdadeMedia[i]);
        }
        System.out.println("---------");
        for (int i = 0; i < vetorAlturaMedia.length; i++) {
            System.out.println("Alturas abaixo da media: "+vetorAlturaMedia[i]);
        }

    }
}
