package atividade_2;

/*
21. Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma
é uma data válida.
 */
import java.util.Scanner;


public class ex21_data_valida {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //DECLARAÇÃO DE VARIÁVEIS
        byte dia;
        byte mes;
        int ano;
        String data;

        //ENTRADA DE DADOS
        System.out.println("Informe os valores no formato: (dd/mm/aaaa)");
        System.out.print(
                "Digite o dia: ");
        dia = s.nextByte();

        System.out.print(
                "Digite o mês: ");
        mes = s.nextByte();

        System.out.print(
                "Digite o ano: ");
        ano = s.nextInt();

        //PROCESSAMENTO
        if (dia
                > 0 && dia
                < 32 && mes
                > 0 && mes
                < 13 && ano
                > 0 && 
                
                ((mes
                == 1 || mes
                == 3 || mes
                == 5 || mes
                == 7 || mes
                == 8 || mes
                == 10 || mes  //meses com 31 dias
                == 12) || 
                
                ((mes
                == 4 || mes
                == 6 || mes   //meses com 30 dias
                == 9 || mes
                == 11) 
                
                 
                && dia
                <= 30) 
                
                || (mes
                == 2 && 
                (dia          //ano bissexto mes de fevereiro
                <= 29 && ano
                % 4 == 0 &&
                (ano
                % 100 != 0 || ano
                % 400 == 0))
                || dia
                <= 28))) {
            
            
            data = "DATA VÁLIDA";
        } else {
            data = "DATA INVÁLIDA";
        }

        //SAÍDA DE DADOS
        System.out.println(
                +dia + "/" + mes + "/" + ano + " " + data);

    }  //adaptei o código desse site: https://www.guj.com.br/t/resolvido-validacao-de-data/339866/8
       // esse código tem alguns erros, mas nao sei mexer com as bibliotecas do java
}
