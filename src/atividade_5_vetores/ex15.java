package atividade_5_vetores;

import java.util.Scanner;

/*
15. Foram anotadas as idades e alturas de 30 alunos. Faça um Programa que determine quantos
alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos. 
 */
public class ex15 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int vetorIdade[] = {5, 10, 12, 15, 17};
        int vetorAltura[] = {190, 180, 170, 100, 110};
        int somaAltura = 0;
        int contAltura = 0;

        for (int i = 0; i < vetorIdade.length; i++) {   //saber a media
            somaAltura += vetorAltura[i];  //saida 355

            if (vetorAltura[i] < (somaAltura / 5)) {
                if (vetorIdade[i] > 13) {
                    contAltura++;

                }
            }

        }
        System.out.println("Quantidade de alunos com mais de 13 \n"
                + "e altura baixa media: " + contAltura);
        
        
        int vetorAlturaBaixa[] = new int[contAltura];

        int x = 0;

        for (int i = 0; i < 5; i++) {

            if (vetorAltura[i] < (somaAltura / 5)) {
                if (vetorIdade[i] > 13) {
                    vetorAlturaBaixa[x] = vetorAltura[i];
                    x++;
                }
            }

        }
        System.out.println("As Alturas desses alunos sao:");
        for (int i = 0; i < vetorAlturaBaixa.length; i++) {
            System.out.println(vetorAlturaBaixa[i]);
        }

    }

}
