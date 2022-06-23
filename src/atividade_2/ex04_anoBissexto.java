package atividade_2;
/*
 Faça um Programa que peça para entrar com um ano com 4 dígitos e determine se o
mesmo é ou não bissexto.
 */
import java.time.Year;
import java.util.Scanner;

public class ex04_anoBissexto {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o ano");
        int ano = s.nextInt();
        System.out.println(Year.isLeap(ano));

    }
}
