package atividade_3_repeticao;
import java.util.Scanner;

/*
24. Faça um programa que calcule o valor total investido por um colecionador em sua
coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a
quantidade de CDs e o valor para em cada um.


*/

public class ex24{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double valor = 0;
        double soma  = 0;
        
        System.out.println("QTD CD's");
        int total = s.nextInt();
         
        for (int i = 0; i < total; i++) {
            System.out.println("Informe o valor do "+(i+1)+"º cd");
            valor =s.nextDouble();
            soma+=valor;
        }
        System.out.println("------");
        System.out.println("Valor médio de cada CD: R$"+(soma/total));
        System.out.println("Valor total da coleção: R$"+soma);
    }    
}
