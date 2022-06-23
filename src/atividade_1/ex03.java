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
public class ex03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o primeiro numero:");
        double numero1 = s.nextDouble();
        System.out.println("Informe o segundo numero:");
        double numero2 = s.nextDouble();
        System.out.println("A soma é: "+(numero1+numero2));
    }
}
