package atividade_3_repeticao;
import java.util.Scanner;

/*
26. O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a
metodologia da tabelinha, que já é um sucesso na sua loja de 1,99. Você foi contratado para
desenvolver o programa que monta a tabela de preços de pães, de 1 até 50 pães, a partir do
preço do pão informado pelo usuário, conforme o exemplo abaixo:
• Preço do pão: R$ 0.18
Panificadora Pão de Ontem - Tabela de preços
1 - R$ 0.18
2 - R$ 0.36
...
50 - R$ 9.00

*/

public class ex25{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        double  valor = 0;
        
         System.out.println("QTD de itens:");
         int qtd = s.nextInt();
         
         for (int i = 0; i < qtd; i++) {
           valor+= 1.99;
             }
         System.out.println("-----");
        System.out.println("Valor final: R$"+valor);
    }    
}
