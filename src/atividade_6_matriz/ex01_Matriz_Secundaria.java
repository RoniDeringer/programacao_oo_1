package atividade_6_matriz;

import java.util.Scanner;

/*
1. Faça um programa que peça ao usuário um valor inteiro impar entre 3 e 11 (inclusive 3 e
11, valide esta entrada), após isto crie uma matriz quadrada (inteiros) do tamanho do número
informado pelo usuário. Permita que o usuário informe os valores para cada uma das
posições da matriz. 
pós isto calcula e mostre as seguintes informações sobre a matriz:
• Soma dos elementos;
• Média dos elementos (duas casas decimais);
• Maior valor;
• Menor valor;
• Contador de pares;
• Contador de ímpares;
• Soma da diagonal principal;
• Soma da diagonal secundária;
• Mostrar a Matriz (formatada);
Permitir gravar e ler estes dados de um arquivo.

 */
public class ex01_Matriz_Secundaria {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*
        atributos:
         */
        float soma = 0;
        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;
        int contPar = 0;
        int contImpar = 0;
        int somaDiPri = 0;
        int somaDiSec = 0;
        int num = 0;
        boolean condicao;

        System.out.println("num de 3 a 11");
        num = s.nextInt();
        if ((num % 2 != 0) && (num >= 3) && (num <= 11)) {
            condicao = true;

        } else {
            condicao = false;
        }

        int matriz[][] = new int[num][num];  //matriz

        while (condicao == true) {  //laço se numero de 3 a 11 for true
          condicao = false;
            for (int i = 0; i < matriz.length; i++) {
                System.out.println("proxima linha:");
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.println("valor:");
                    matriz[i][j] = s.nextInt();

                    soma += matriz[i][j];

                    if (maiorValor < matriz[i][j]) {
                        maiorValor = matriz[i][j];  //maior valor
                        System.out.println("------------3123sdnaudnsaudasdasd");

                    } else if (menorValor > matriz[i][j]) {
                        menorValor = matriz[i][j];  //menor valor 
                    }

                    if (matriz[i][j] % 2 == 0) {
                        contPar++;  //par
                    } else {
                        contImpar++;  //impar
                    }
                    if (i == j) {
                        somaDiPri += matriz[i][j];  //diagonal principal
                    }
                }
            }
        } //fim while
        
	for(int i = matriz.length - 1; i >= 0; i--) {    // soma diag. sec.
		for(int j = matriz.length - 1; j >= 0; j--) {
			if(i + j == matriz.length -	1) {
				somaDiSec += matriz[i][j];
			}
		}
	}

        System.out.println("_____SAIDA____");
        
        for (int i = 0; i < num; i++) {
            System.out.println("");
            for (int j = 0; j < num; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
        }
        
        System.out.println("");
        System.out.println("Maior Valor: "+maiorValor);
        System.out.println("Menor valor: "+menorValor);
        System.out.println("qtd pares: "+contPar);
        System.out.println("qtd impares "+contImpar);
        System.out.println("Soma diagona Pri: "+somaDiPri );
        System.out.println("Soma diagona Sec: "+somaDiSec);
        System.out.println("Media dos num: "+(soma/(num*num)));
    }

}

