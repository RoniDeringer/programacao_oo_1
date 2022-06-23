package atividade_3_repeticao;
import java.util.Scanner;

/*
10. Faça um programa que peça dois números, base e expoente, 
calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem.


*/

public class ex10{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("base");
        double base = s.nextDouble();
        System.out.println("expoente");
        double exp = s.nextDouble();
        double resultado = base;
        
        for (int i = 1; i < exp; i++) {
            resultado = resultado*base;
        }
            System.out.println(resultado);       
    }    
}
