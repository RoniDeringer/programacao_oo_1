package atividade_2;

/*
9. Tendo como dado de entrada a altura, peso e sexo, construa um algoritmo que calcule
o peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7
(h = altura)
Ao final o algoritmo deve mostrar:
- Altura, peso e sexo;
- Peso Ideal;
- Mensagem se está acima, abaixo ou no peso ideal;

 */
import java.util.Scanner;

public class ex09 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe sua altura em metros");
        double altura = s.nextDouble();
        System.out.println("Informe seu sexo 'feminino' ou 'masculino'");
        char sexo = s.next().charAt(0);
        System.out.println("Informe seu peso");
        double peso = s.nextDouble();
        
        double pesoIdeal= 0;
        
        if (sexo =='m') {
            pesoIdeal = (72.7*altura)-58;
            System.out.println("Seu sexo é Masculino");
            System.out.println("Seu peso ideal é: "+pesoIdeal);
            System.out.println("Sua altura é: "+altura);
            System.out.println("");
            
        }else if (sexo =='f') {
            pesoIdeal = (62.1*altura)-44.7;
            System.out.println("Seu sexo é Feminino");
            System.out.println("Seu peso ideal é: "+pesoIdeal);
            System.out.println("Sua altura é: "+altura);
        }else{
            System.out.println("ERRO ao informar sexo");
        }
        
        
    }
}
