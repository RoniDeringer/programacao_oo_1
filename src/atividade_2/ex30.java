package atividade_2;

/*
30. Uma fruteira está vendendo frutas com a seguinte tabela de preços:
 Até 5 Kg Acima de 5 Kg
Morango R$ 2,50 por Kg R$ 2,20 por Kg
Maçã R$ 1,80 por Kg R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra
ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.
Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a
quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo
cliente.
 */
import java.util.Scanner;

public class ex30 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Double maca, morango, precoMorango, precoMaca, somaPreco, somaKilo;

        System.out.println("Valor em KG de maçãs");
        maca = s.nextDouble();
        System.out.println("Valor em KG de Morangos");
        morango = s.nextDouble();
        System.out.println("");

        /*
            morango 5kg
         */
        if (morango > 5) {
            precoMorango = morango * 2.20;
        } else {
            precoMorango = morango * 2.50;
        }

        /*
            maca 5k
         */
        if (maca > 5) {
            precoMaca = maca * 1.50;
        } else {
            precoMaca = maca * 1.80;
        }
        
        somaPreco = precoMaca + precoMorango;
        somaKilo = morango + maca; 
        
        System.out.println("Preço Morango: R$"+precoMorango);
        System.out.println("Preço Morango: R$"+precoMaca);
        System.out.println("Preço total: R$"+somaPreco);
        
        if (somaPreco >=25 || somaKilo >=8) {
            somaPreco = somaPreco * 0.9;
            System.out.println("Com desconto de 10%: R$"+somaPreco);
        }
    }
}
