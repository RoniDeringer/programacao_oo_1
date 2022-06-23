package atividade_5_vetores;

import java.util.Arrays;
import java.util.Scanner;

/*
12. Faça um programa que tenha como entrada várias palavras separadas por ;
(rodrigo;curvello;antonio;....) separe as palavras e coloque cada uma em uma posição do
vetor
 */
public class ex12_VetorSeparaStringPorPontoVirgula{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 

        String texto = "rodrigo;curvello;antonio;";  //se trocar aqui, lembrar de mudar as linhas 21-23

        String[] textoSeparado = texto.split(";");  //textoSeparado recebe as palavras separadas pelo ;

        //e transforma isso em posições como é possivel a baixo
        System.out.println("palavra no split 0: " + textoSeparado[0]);  //saida rodrigo
        System.out.println("palavra no split 1: " + textoSeparado[1]);  //saida curvello
        System.out.println("palavra no split 2: " + textoSeparado[2]);  //saida antonio

        /*
        CONTAR QUANTOS PONTO E VIRGULAS TEM
         */
        String pontoVirgula = ";";
        int contPV = 0;
        for (int i = 0; i < texto.length(); i++) { //vai percorer o tamanho do texto
            if (texto.substring(i).startsWith(pontoVirgula)) {  //sla
                contPV++;  //conta quantos ponto e virgula tem
            }
        }
        System.out.println("");
        System.out.println("Total de ponto e virgula " + contPV);  //saida: 3
        System.out.println("");

        /*
        FAZER O VETOR RECEBER OS NOMES
         */
        String vetor[] = new String[contPV];  //vetor com posições da qtd de ';'

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = textoSeparado[i];  //vetor recebe as palavras separadas pelo ';'
            System.out.println((i + 1) + "ª Palavra: no vetor " + vetor[i]);
        }

        
        /*
        PROGRAMA DA ERRO SE A STRING NAO ACABAR COM ';'
        
        */
    }
}