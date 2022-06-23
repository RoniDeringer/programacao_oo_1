package atividade_5_vetores;

import java.util.Scanner;

/*
7. Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a
média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0. 
 */

public class ex07_erro {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       int vetorSoma[] = new int [3];  //5 alunos
       int nota = 0;
       int contMaior=0;
       
        for (int i = 0; i < 3; i++) {   //3 alunos
            System.out.println("ALUNO 1: ");
            nota = 0;
            for (int j = 0; j < 4; j++) {  //4 notas 
                System.out.print("Nota: "+(j+1)+": ");
                nota = s.nextInt();
                vetorSoma[i] += nota;
                
            }//fim for notas
            
            if ((vetorSoma[i]/4) > 7) {
                contMaior++;
            }
        }//fim for alunos
       
       
       
       int vetorMediaAlta[] = new int[contMaior];
       int x= 0;
       
        for (int i = 0; i < vetorSoma.length; i++) {
            if ((vetorSoma[i]/4) > 7) {
                vetorMediaAlta[x] = vetorSoma[i]/4;
                x++;
            }
        }//fim for
       
        System.out.println("____SAIDA_____");
        System.out.println("Medias Altas:");
        for (int i = 0; i < contMaior; i++) {
            System.out.print(vetorMediaAlta[i]+" - ");
        }
    }}
