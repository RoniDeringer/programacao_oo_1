package atividade_2;

/*
13.Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela
abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas
não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao
Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua
hora e a quantidade de horas trabalhadas no mês.
Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas
conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
 Salário Bruto: (5 * 220) : R$ 1100,00
 (-) IR (5%) : R$ 55,00
 (-) INSS ( 10%) : R$ 110,00
 FGTS (11%) : R$ 121,00
 Total de descontos : R$ 165,00
 Salário Liquido : R$ 935,00


IR TABELA 
SINDICADO 3% 
FGTS 11% *EMPRESA*
 */
import java.util.Scanner;

public class ex13 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe as horas trabalhadas");
        double horas = s.nextDouble();
        System.out.println("Valor das horas");
        double valor = s.nextDouble();
        double bruto = horas * valor;

        double ir = 0;
        double sindicato = 0;
        double fgts = 0;

        if (bruto <= 900) {
            ir = 0;

        } else if (bruto <= 1500) {
            ir = 0.05;
            
        } else if (bruto <= 2500) {
            ir = 0.1 ;  
            
        } else {
            ir = 0.2;
        }
        fgts = bruto * 0.11;
        sindicato = bruto * 0.03;
        
        double salLiquido = bruto - (fgts + ir);
                
        System.out.println("");
        System.out.println("Salário Bruto: R$"+bruto);
        System.out.println("(-) IR: R$"+ir);
         System.out.println("(-)Sindicato: R$"+sindicato);
        System.out.println(" FGTS: R$"+fgts); 
        System.out.println("Total de descontos: R$"+(ir+sindicato));
        System.out.println("Salário Liquido: R$" + salLiquido);


    }
}
