package atividade_2;

/*
31. O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
 Até 5 Kg Acima de 5 Kg
File Duplo R$ 4,90 por Kg R$ 5,80 por Kg
Alcatra R$ 5,90 por Kg R$ 6,80 por Kg
Picanha R$ 6,90 por Kg R$ 7,80 por Kg
Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos
de carne da promoção, porém não há limites para a quantidade de carne por
cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um
desconto de 5% sobre o total a compra. Escreva um programa que peça o tipo e
a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo
as informações da compra: 
tipo 
quantidade de carne,
preço total, 
tipo de pagamento, 
valor do desconto  
valor a pagar.
 */
import java.util.Scanner;

public class ex31 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Selecione a carne:");
        System.out.println("F: Filé Duplo");
        System.out.println("A: Alcatra");
        System.out.println("P: Picanha");
        char tipo = s.next().charAt(0);
        System.out.println("Informe a QTD em KG");
        double kilo = s.nextDouble();
        System.out.println("Usará o CARTÃO TAPANACARA?");
        char cartao = s.next().charAt(0);
        System.out.println("");

        double preco = 0;

        switch (tipo) {
            case 'f':
                if (kilo > 5) {
                    preco = 5.8 * kilo;
                } else {
                    preco = 4.9 * kilo;
                }
                System.out.println("Tipo de carne: Filé Duplo");
                break;

            case 'a':
                if (kilo > 5) {
                    preco = 6.8 * kilo;
                } else {
                    preco = 5.9 * kilo;
                }
                System.out.println("Tipo de carne: Alcatra");
                break;

            case 'p':
                if (kilo > 5) {
                    preco = 7.8 * kilo;
                } else {
                    preco = 6.9 * kilo;
                }
                System.out.println("Tipo de carne: Picanha");
                
            default:
                System.out.println("Valor incorreto");
        } //fim do switch
        
        String tipoPagamento = "";
        double desconto;
        
        if (cartao=='s') {
            desconto = preco *0.05;
            tipoPagamento = "CARTÃO TAPANACARA";
        }else{
            desconto = 0;
            tipoPagamento = "Sem cartão";
        }
        
        
        
        System.out.println("Total de KG:"+kilo);
        System.out.println("Preço Total: R$"+(preco));
        System.out.println("Tipo de pagamento: "+tipoPagamento);
        System.out.println("Valor do desconto: R$"+desconto);
        System.out.println("Valor a pagar: R$"+(preco - desconto));
        

        
    }
}
