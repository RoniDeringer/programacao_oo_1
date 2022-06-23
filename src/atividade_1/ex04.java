/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_1;
import java.util.Scanner;
/**
 *
 * @author Roni
 */
public class ex04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe a primeira nota:");
        double nota1 = s.nextDouble();
        System.out.println("Informe a segunda nota:");
        double nota2 = s.nextDouble();
        System.out.println("Informe a terceira nota:");
        double nota3 = s.nextDouble();
        System.out.println("Informe a quarta nota:");
        double nota4 = s.nextDouble();
        System.out.println("Sua média é: "+((nota1+nota2+nota3+nota4) /4) );
    }
}
