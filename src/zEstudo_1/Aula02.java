
package zEstudo_1;

public class Aula02 {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();  //objeto = c1  1a instancia
        c1.cor = "Azul";
        c1.ponta = 0.5f;

        c1.destampar();   //chama o metodo e tampa a caneta

        c1.rabiscar();  //ele verifica se ta rabiscando, obs: só pode rabiscar se a caneta estiver destampada

        c1.status();  //chamei o metodo

        /*
        ATÉ AQUI OK
        FIZ UMA CANETA COM ALGUMAS CONFIGURAÇÕES
        OU SEJA
        UMA CLASSE PODE TER VARIOS OBJETOS
        UMA CANETA PODE TER VARIOS atributos, metodos e estado
        
        agr vou criar um novo objeto
        uma segunda caneta, que possui objeto diferente
         */
        System.out.println(" caneta 2: -----");
        Caneta c2 = new Caneta();  //objeto = c2  2a instancia

        c2.modelo = "Faber castel"; //atributo
        c2.cor = "Preto";  //atributo 
        c2.destampar();  //metodo  ESSE METODO NAO TRAS NADA DE RETORNO SÓ FUNÇÃO
        c2.rabiscar();  //ESSE METODO TEM SOUT E POR ISSO TRAS UMA RESPOSTA
        c2.status();  //esse metodo ele apresenta todos os atributos

    }
}

