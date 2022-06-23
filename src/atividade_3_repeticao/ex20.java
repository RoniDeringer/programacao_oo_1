package atividade_3_repeticao;
import java.util.Scanner;

/*
20. Faça um programa que calcule e mostre a média aritmética de N notas.


*/

public class ex20{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int i =0;
        double nota =0;
        double soma = 0;
        char condicao =0;
        do {
            i++;
            System.out.println("Informe a "+i+"ª nota");
            nota = s.nextDouble();
            soma +=nota;
            
            System.out.println("Deseja informa mais notas? 's' ou 'n' ");
            condicao = s.next().charAt(0);           
        } while (condicao =='s');
        System.out.println("total de notas: "+i);
        System.out.println("Média: "+(soma/i));       
    }    
}
