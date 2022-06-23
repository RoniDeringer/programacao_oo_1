package atividade_2;

/*
12.As Organizações Tabajara resolveram dar um aumento de salário aos seus
colaboradores e lhe contrataram para desenvolver o programa que calculará os
reajustes.
o Faça um programa que recebe o salário de um colaborador e calcule o reajuste
segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser
realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento. 
 */
import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe seu salário");
        double sal = s.nextDouble();

        double reajuste = 0;
        String percAumento = "";
        double aumento = 0;

        if (sal <= 280) {
            percAumento = "20%";     //porcentagem aumento
            reajuste = sal *1.2;     //novo sal
            aumento = reajuste - sal;//valor do aumento
        }
        else if (sal <= 700) {
            percAumento = "15%";     //porcentagem aumento
            reajuste = sal *1.15;    //novo sal
            aumento = reajuste - sal;//valor do aumento
        }
        else if (sal <= 1500) {
            percAumento = "10%";     //porcentagem aumento
            reajuste = sal *1.1;     //novo sal
            aumento = reajuste - sal;//valor do aumento
            
        } else {
            percAumento = "5%";       //porcentagem aumento
            reajuste = sal *1.05;    //novo sal
            aumento = reajuste - sal;//valor do aumento 
        }
        System.out.println("");
        System.out.println("Salário antes: R$"+sal);
        System.out.println("NOVO SALÁRIO: R$"+reajuste);
        System.out.println("Taxa de aumento: "+percAumento);
        System.out.println("Total de aumento: R$"+aumento);
        
    }
}
