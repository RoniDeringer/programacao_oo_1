package atividade_2;

/*
19. Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2
+ bx + c. O programa deverá pe seguintes situações:
Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o
programa não deve fazer pedir os demais valores, sendo encerrado;
Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e
encerre o programa;
Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao
usuário;
Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;

 */
import java.util.Scanner;

public class ex19_Bhaskara {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double delta = 0;
        double x1 = 0;
        double x2 = 0;

        System.out.println("Ax² + Bx + C");
        System.out.println("Informe A");
        double a = s.nextDouble();
        
        if (a != 0) {
            System.out.println("informe B");
            double b = s.nextDouble();
            System.out.println("Informe C");
            double c = s.nextDouble();

            delta = (b * b) + (-4 * (a * c));
            if (delta < 0) {
                System.out.println("Delta negativo");
            }
            
            else if (delta == 0) {
                System.out.println("Delta = 0");
                System.out.println("Valor de delta: "+delta);
                System.out.println("");
                x1 = (((-b) + (Math.sqrt(delta))) / (2 * a));
                System.out.println("Valor de x: " + x1);
                
            } else {
                System.out.println("Delta maior que 0");
                System.out.println("Valor de delta: "+delta);
                System.out.println("");
                x1 = (((-b) + (Math.sqrt(delta))) / (2 * a));
                x2 = (((-b) - (Math.sqrt(delta))) / (2 * a));
                System.out.println("Valor de x1: " + x1);
                System.out.println("Valor de x2: " + x2);
            }
        }

    }
}
