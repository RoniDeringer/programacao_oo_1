package atividade_3_repeticao;

import java.util.Scanner;

/*
35. O cardápio de uma lanchonete é o seguinte:
• Especificação Código Preço
Cachorro Quente 100 R$ 1,20
Bauru Simples   101 R$ 1,30
Bauru com ovo   102 R$ 1,50
Hambúrguer      103 R$ 1,20
Cheeseburguer   104 R$ 1,30
Refrigerante    105 R$ 1,00

Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. 
Calcule e
mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido. Considere
que o cliente deve informar quando o pedido deve ser encerrado.


 */
public class ex35 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char condicao = 0;
        int prod = 0;
        double valor = 0;
        double somaProd = 0;
        int qtd = 0;
        
        
        
        do {
            System.out.println("Escolha um produto pelo código:\n"
                    + "Cachorro Quente 100 R$ 1,20\n"
                    + "Bauru Simples   101 R$ 1,30\n"
                    + "Bauru com ovo   102 R$ 1,50\n"
                    + "Hambúrguer      103 R$ 1,20\n"
                    + "Cheeseburguer   104 R$ 1,30\n"
                    + "Refrigerante    105 R$ 1,00 \n"
                    + "------------------------------");
            prod = s.nextInt();
            System.out.println("Informe a quantidade desse produto:");
            qtd = s.nextInt();
            
            switch (prod) {
                case 100:
                    valor = 1.2*qtd;
                    break;
                case 101:
                    valor = 1.3*qtd;
                    break;
                case 102:
                    valor = 1.5*qtd;
                    break;
                case 103:
                    valor = 1.2*qtd;
                    break;
                case 104:
                    valor = 1.3*qtd;
                    break;
                case 105:
                    valor = 1.0*qtd;
                    break;
            }

            System.out.println("Valor de "+qtd+" do "+prod+" : R$ "+valor);
            somaProd += valor;

            System.out.println("----------------------");
            System.out.println("Deseja escolher mais produto? 's' ou 'n'");
            condicao = s.next().charAt(0);
        } while (condicao == 's');

        
        System.out.println("Valor total do pedido: R$"+somaProd);
    }
}
