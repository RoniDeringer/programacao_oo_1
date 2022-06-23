package atividade_2;

/*
20. Faça um Programa que peça um número correspondente a um determinado ano e em
seguida informe se este ano é ou não bissexto.

 */
import java.time.Year;
import java.util.Scanner;

public class ex20 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe o ano");
        int ano = s.nextInt();
        System.out.println(Year.isLeap(ano));
        
        //igual a 04?
    }
}
