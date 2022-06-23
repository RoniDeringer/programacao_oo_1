package atividade_3_repeticao;

import java.util.Scanner;

/*
22. Numa eleição existem três candidatos. Faça um programa que peça o número total de
votantes. Peça para cada votante votar e ao final mostrar o número de votos de cada
candidato.


 */
public class ex22 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int votos;
        int votoA = 0;
        int votoB = 0;
        int votoC = 0;
        int nulo = 0;

        System.out.println("Número Total de votantes");
        int num = s.nextInt();

        
        for (int i = 0; i < num; i++) {
            System.out.println("eleitor numero " + (i+1) + " informe seu voto");
            System.out.println("1: André"
                    + "\n2: Breno"
                    + "\n3: Carlos ");
            votos = s.nextInt();

            switch (votos) {
                case 1:
                    votoA++;
                    break;
                case 2:
                    votoB++;
                    break;
                case 3:
                    votoC++;
                    break;
                default:
                    System.out.println("voto registrado como nulo");
                    nulo++;
            }//fim switch
            System.out.println("---------------");
        }//fim laço
        System.out.println("Votos: André: " + votoA);
        System.out.println("Votos: Breno: " + votoB);
        System.out.println("Votos: Carlos: " + votoC);
        System.out.println("Votos Nulos: "+nulo);
    }
}
