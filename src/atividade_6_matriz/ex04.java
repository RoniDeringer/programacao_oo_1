package atividade_6_matriz;

import java.util.Scanner;

/*
4. Nas Olimpíadas do IFC estão ocorrendo várias competições, entre elas salto em
distância, nesta competição cada atleta tem direito a cinco saltos, para valorizar o atleta
mais constante é feita a média dos saltos, desprezando o pior salto. Você foi contratado para
implementar um sistema que fará o controle desta competição, utilizando o recurso de Matriz,
resolva os itens abaixo:
• Solicitar os cinco saltos de cada atleta;
• Após o atleta saltar mostrar a média;
• Permitir a utilização do sistema por N atletas (informado no inicio da aplicação);
• Ao final, ou seja, após os N atletas digitarem os saltos o programa deve mostrar:
• Saltos de cada atleta, seguidos de sua média;
• A média dos saltos do campeão e do último lugar;
 */
public class ex04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("qtd atletas");
        System.out.println("vai ser 3");
        int atletas = 3;

        /*
        atributos:
         */
        float matriz[][] = new float[atletas][5];
        float piorSalto[] = new float[atletas];
        float vetorMedia[] = new float[atletas];

        for (int i = 0; i < atletas; i++) {  //i vai de 0 a 2
            System.out.println("");
            System.out.println((i + 1) + "º atleta");
            for (int j = 0; j < 5; j++) { //j vai de 0 a 4

                //dado entrada:
                System.out.println("salto " + (j + 1) + ": ");
                matriz[i][j] = s.nextFloat();

                vetorMedia[i] += matriz[i][j];  //soma todos os saltos do atleta

                //primeiro salto:
                if (j == 0) {  // pior salto vai receber o valor do 1o salto
                    piorSalto[i] = matriz[i][j];
                } else {

                    //resto dos saltos:
                    if (matriz[i][j] < piorSalto[i]) {  // aqui eu comparo qual o pior salto
                        piorSalto[i] = matriz[i][j];
                    }
                    /*
                calculo abaixo faz a soma dos saltos
                descontando o pior salto 
                     */

                    if (j == 4) {
                        System.out.println("pior salto desse atleta foi: " + piorSalto[i]);
                        vetorMedia[i] = (vetorMedia[i] - piorSalto[i]) / 4;
                        System.out.println("Media dos 4 melhores saltos foi: " + vetorMedia[i]);
                    }//fim if do ultimo salto
                } //fim if da j==0

            }//fim for coluna

        } //fim for linha
        for (int i = 0; i < atletas; i++) {

            System.out.println("Media dos saltos: " + vetorMedia[i] / 4);
        }
    }
}
