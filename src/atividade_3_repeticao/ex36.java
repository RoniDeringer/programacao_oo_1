package atividade_3_repeticao;

import java.util.Scanner;

/*
36. Em uma eleição presidencial existem quatro candidatos. Os votos são informados por
meio de código. Os códigos utilizados são:
• 1 , 2, 3, 4 - Votos para os respectivos candidatos
(você deve montar a tabela ex: 1  Jose/ 2- João/etc)
5  Voto Nulo
6  Voto em Branco

Faça um programa que calcule e mostre:
• O total de votos para cada candidato;
• O total de votos nulos;
• O total de votos em branco;
• A percentagem de votos nulos sobre o total de votos;
• A percentagem de votos em branco sobre o total de votos. 
Para finalizar o conjunto de votos tem-se o valor zero.

 */
public class ex36 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int voto = 0;
        int soma1 = 0;
        int soma2 = 0;
        int soma3 = 0;
        int soma4 = 0;
        int soma5 = 0;
        int soma6 = 0;
        int soma7 = 0;
        int cont=0;
        
        do {
            System.out.println("1: André\n"
                    + "2: Breno\n"
                    + "3: Carlos\n"
                    + "4: Debora\n"
                    + "5: NULO\n"
                    + "6: BRANCO \n");
            voto = s.nextInt();
            cont++;

            switch (voto) {
                case 1:
                    soma1++;
                    break;

                case 2:
                    soma2++;
                    break;
                    
                case 3:
                    soma3++;
                    break;
                    
                case 4:
                    soma4++;
                    break;
                    
                case 5:
                    soma5++;
                    break;
                    
                case 6:
                    soma6++;
                    break;
                    
                case 7:
                    soma7++;
                    break;
                    

            }
        }while (voto != 0);
        System.out.println("--------------");
        System.out.println("Total de votos 1 André: "+soma1);
        System.out.println("Total de votos 2 Breno: "+soma2);
        System.out.println("Total de votos 3 Carlos: "+soma3);
        System.out.println("Total de votos 4 Debora: "+soma4);
        System.out.println("Total de votos nulos: "+soma5);
        System.out.println("Total de votos em branco: "+soma6);
        System.out.println("Total de votos 1 André: "+soma1);
        System.out.println("Porcentagem de votos nulos: "+(cont/soma5)+"%");
        System.out.println("Porcentagem de votos em branco: "+(cont/soma6)+"%");
    
    }
        

    
    
    }
