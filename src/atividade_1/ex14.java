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
public class ex14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o total de horas trabalhadas");
        double horas = s.nextDouble();
        System.out.println("Informe o valor da hora");
        double valor = s.nextDouble();
        double bruto = horas*valor;

        double inss        =    bruto * 0.08;
        double ir          =    bruto * 0.11;
        double sindicato   =    bruto * 0.05;
        double liquido     =    bruto - (inss+ir+sindicato) ;

        System.out.println("Salário bruto: R$"      +bruto);
        System.out.println("valor INSS: R$"         +inss);
        System.out.println("valor IR: R$"           +ir);
        System.out.println("valor sindicato: R$"    +sindicato);
        System.out.println("Salário LIQUIDO: R$"    + liquido);



    }   
}
