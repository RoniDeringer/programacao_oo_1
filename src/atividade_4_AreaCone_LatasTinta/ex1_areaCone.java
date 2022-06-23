package atividade_4_AreaCone_LatasTinta;

import java.util.Scanner;

/*
Área Total do Cone (lateral e fundo) = πr(r + g)
Área do Circulo (fundo do cone) = π r2
Área Lateral do Cone (Sem o fundo) = π.r.g

 */
public class ex1_areaCone {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*
        declaração variaveis
         */
        double qtdTinta;
        double qtdLatasDecimal;
        double qtdLatasInt;
        double precoFinal = 0;

        /*
        dados de entrada
         */
        System.out.println("Informe o tipo de lata de tinta:");
        System.out.println("o:\n"
                + "Tipo 1 – R$ 238,90\n"
                + "Tipo 2 – R$ 467,98\n"
                + "Tipo 3 – R$ 758,34");
        int tipoTinta = s.nextInt();

        System.out.println("Informe o valor Z (altura)");
        double valorZ = s.nextDouble();
        System.out.println("Informe o valor R (raio)");
        double valorR = s.nextDouble();

        /*
        CALCULOS DE ÁREA
        Área Total do Cone (lateral e fundo)  = πr(r + g)
        Área do Circulo (fundo do cone)       = π r2
        Área Lateral do Cone (Sem o fundo)    = π.r.g
        
        GERATRIZ = valor de g (latarel do cone)
        GERATRIZ = r² + z²
         */
        double geratrizVariavel = (Math.pow(valorZ, 2)) + (Math.pow(valorR, 2));  //geratriz dentro da raiz

        double valorG = Math.sqrt(geratrizVariavel);                    //geratriz tirei da raiz

        double lateralCone = 3.14 * valorR * valorG;                   //lateral cone

        double fundoCone = 3.14 * (Math.pow(valorR, 2));                //fundo do cone

        double areaCone = 3.14 * valorR * (valorR + valorG);            //area total

        /*  
        CALCULO E VERIFICAÇÃO DO TIPO DE TINTA
        
        Tipo 1 – R$ 238,90
        Tipo 2 – R$ 467,98
        Tipo 3 – R$ 758,34

        1M  = 3,45L
        18L = 1 lata(valor depende do tipoTinta) 
        
         */
        qtdTinta = areaCone * 3.45;                          //qtd de LITROS de tinta
        qtdLatasDecimal = qtdTinta / 18;                     //qtd de LATAS decimal
        qtdLatasInt = (int) Math.round(qtdLatasDecimal);   //qtd de LATAS em inteiro

        switch (tipoTinta) {

            case 1:
                precoFinal = qtdLatasInt * 238.90;       //valor final R$238.90
                break;

            case 2:
                precoFinal = qtdLatasInt * 467.98;      //valor final R$467.98
                break;

            case 3:
                precoFinal = qtdLatasInt * 758.34;     //valor final R$ 758,34"
                break;

            default:
                System.out.println("Tipo de tinta Inválido");

        }  //fim do switch

        /*
        APRESENTAÇÃO FINAL
         */
        System.out.println("--> CONE");
        System.out.println("Raio:   " + valorR);
        System.out.println("Altura: " + valorZ);
        System.out.println("Nível:  " + tipoTinta);  //?????

        System.out.println("----------");

        System.out.println("Geratriz: " + valorG);

        System.out.println("----------");

        System.out.println("Área do fundo: " + fundoCone);
        System.out.println("Área lateral cone: " + lateralCone);  //errado
        System.out.println("Área total: " + areaCone);

        System.out.println("----------");

        System.out.println("Litros: " + qtdTinta);
        System.out.println("Latas: " + qtdLatasInt);

        System.out.println("----------");

        System.out.println("Preço total: R$ " + precoFinal);

    }
}
