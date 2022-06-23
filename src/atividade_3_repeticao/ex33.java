package atividade_3_repeticao;
import java.util.Scanner;

/*
33. Faça um programa que receba o valor de uma dívida e mostre uma tabela com os seguintes
dados: valor da dívida, valor dos juros, quantidade de parcelas e valor da parcela.
• Os juros e a quantidade de parcelas seguem a tabela abaixo:
Quantidade de Parcelas % de Juros sobre o valor inicial da dívida
1 0
3 10
6 15
9 20
12 25

Exemplo de saída do programa:
Valor da Dívida Valor dos Juros Quantidade de Parcelas Valor da Parcela
R$ 1.000,00     0       1   R$ 1.000,00
R$ 1.100,00     100     3   R$ 366,00
R$ 1.150,00     150     6   R$ 191,67
                
*/

public class ex33{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

         System.out.println("Valor da divida:");
         double divida = s.nextDouble();
         
         
         System.out.println("VALOR | JUROS | PARCELAS | VALOR PARCELA");
         System.out.println(divida+"|   0   |     1    |"+(divida*1.0));
         System.out.println((divida*1.1)+"|   10  |     3    |"+((divida*1.10)/3));
         System.out.println((divida*1.15)+"|   15  |     6    |"+((divida*1.15)/6));
         System.out.println((divida*1.20)+"|   20  |     9    |"+((divida*1.20)/9));
         System.out.println((divida*1.25)+"|   25  |     12   |"+((divida*1.25)/12));
         
    }    
}
