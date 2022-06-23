package atividade_3_repeticao;

import java.util.Scanner;

/*
4. Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa
anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de
crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários
para que a população do país A ultrapasse ou iguale a população do país B, mantidas as
taxas de crescimento. 

Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a
operação

 */
public class ex04_taxaPopulação {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char condicaoPrincipal;
        double taxaA, taxaB, creA, creB;
        int popA, popB;
        int anos = 0;

        do {  //LAÇO PRINCIPAL SE DESEJA FAZER DE NOVO
            System.out.println("CIDADE A:");
            System.out.println("População: ");
            popA = s.nextInt();
            System.out.println("Taxa de crescimento");
            creA = s.nextDouble();
            System.out.println("------");
            System.out.println("CIDADE B");
            System.out.println("População");
            popB = s.nextInt();
            System.out.println("Taxa de crescimento");
            creB = s.nextDouble();
            System.out.println("");
            //FIM ENTRADA DE DADOS

            /*
             Vou ter que fazer 2 laços
             pq preciso saber qual cidade tem mais população
            pra igualar elas
             */
            if (popA > popB) {   //cidade A maior
                do {
                    taxaA = popA * creA;
                    taxaB = popB * creB;
                    anos++;

                } while (taxaA > taxaB);

            } //fim IF pop A maior
            else { //começo cidade B maior
                do {

                    taxaA = popA * creA;
                    taxaB = popB * creB;
                    anos++;

                } while (taxaB > taxaA);

            } //fim IF pop B maior   

            //mostrar resultados
            System.out.println("Demorou "+anos+" anos para se igualar");
            System.out.println("Cidade A tinha: "+popA);
            System.out.println("Agora tem: "+taxaA);
            System.out.println("----");
            System.out.println("Cidade B tinha: "+popB);
            System.out.println("Agora tem: "+taxaB);
           
            
            
            System.out.println("Deseja repetir a operação? 's' ou 'n' ");
            condicaoPrincipal = s.next().charAt(0);
       
        
        } while (condicaoPrincipal == 's');
        System.out.println("PROGRAMA ENCERRADO");
    }
}
