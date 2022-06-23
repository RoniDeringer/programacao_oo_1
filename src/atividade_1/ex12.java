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
public class ex12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 
        System.out.println("Informe sua altura");
        double altura = s.nextDouble();
        System.out.println("seu peso ideal se for HOMEM é: "+( (72.7*altura)-58) );
        System.out.println("seu peso ideal se for MULHER é: "+( (62.1*altura)-44.7) ); 
    }   
}
