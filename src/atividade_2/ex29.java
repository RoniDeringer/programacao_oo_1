package atividade_2;

/*
29. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Álcool:
até 20 litros, desconto de 3% por litro
acima de 20 litros, desconto de 5% por litro
Gasolina:
até 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro
Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado
da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente
sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
 */
import java.util.Scanner;

public class ex29 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o combustivel:");
        System.out.println("G = Gasolina");
        System.out.println("A = Alcool");
        char comb = s.next().charAt(0);
        System.out.println("Qtd de litros:");
        double litros = s.nextDouble();
        System.out.println("");
        
        double preco;
        
        switch(comb){
            case 'g':
                if (litros>20) {
                    preco = (2.5*0.94) *litros;  //6% o litro da gasolina
                }else{
                    preco = (2.5*0.96) *litros;  //4% o litro da gasolina
                }
            
                System.out.println("Gasolina deu: R$"+preco);
                break;
                
            case 'a':
                if (litros>20) {
                    preco = (2.5*0.95) *litros;  //6% o litro do alcool
                }else{
                    preco = (1.9*0.97) *litros;  //3% o litro do alcool
                }
            
                System.out.println("Alcool deu: R$"+preco);
                break;

            default: 
                System.out.println("Valores incorretos");
        }
        
        
    }
}
