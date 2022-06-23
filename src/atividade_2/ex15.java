package atividade_2;

/*
15. Faça um Programa que tendo como dados de entrada o preço de custo de um produto e
um código de origem, emita o preço junto de sua procedência. Caso o código não seja
nenhum dos especificados, o produto deve ser classificado como importado. Código de
origem: 1 - Sul, 2 - Norte 3 - Leste, 4 - Oeste, 5 ou 6 - nordeste 7 ou 8 Centro-oeste.

 */
import java.util.Scanner;

public class ex15 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o valor do produto");
        double valor = s.nextDouble();
        System.out.println("Informe o codigo");
        int cod = s.nextInt();

        switch (cod) {

            case 1:
                System.out.println("Valor: R$" + valor);
                System.out.println("Código Sul");
                break;

            case 2:
                System.out.println("Valor: R$" + valor);
                System.out.println("Código Norte");
                break;
            case 3:
                System.out.println("Valor: R$" + valor);
                System.out.println("Código Leste");
                break;
                
            case 4:
                System.out.println("Valor: R$" + valor);
                System.out.println("Código Oeste");
                break;

            case 5:
                System.out.println("Valor: R$" + valor);
                System.out.println("Código nordeste");
                break;

            case 6:
                System.out.println("Valor: R$" + valor);
                System.out.println("Código Nordeste");
                break;

            case 7:
                System.out.println("Valor: R$" + valor);
                System.out.println("Código Centro-Oeste");
                break;

            case 8:
                System.out.println("Valor: R$" + valor);
                System.out.println("Código Centro-Oeste");
                break;
                
            default:
                System.out.println("Valor: R$" + valor);
                System.out.println("Produto importado");

        }

    }
}
