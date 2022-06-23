package contaBancaria;

public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setNome("Ronaldo");
        p1.setEndereco("Avenida Guimares");
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Vitoria");
        p2.setEndereco("Rua Teodoro");
        
        Banco b1 = new Banco();
        b1.setCodigo(11);
        b1.setNome("Bradesco");
        b1.setNumeroAgencias(190);
        
        Banco b2 = new Banco();
        b2.setCodigo(23);
        b2.setNome("Banco do Brasil");
        b2.setNumeroAgencias(210);
       
        CartaoDeCredito cdc1 = new CartaoDeCredito();
        cdc1.setNumero(89);
        cdc1.setOperadora("MasterCard");
        cdc1.setLimite(1250.90);
        cdc1.setTipoDeCartao("Black");
        
        ContaSimples cs = new ContaSimples();
        cs.setSaldoPoupanca(2500);   //ContaSimples ++
        cs.setAgencia(23);           //ContaBancaria
        cs.setNumeroDaConta(1290);   //ContaBancaria
        cs.setSaldo(750);            //ContaBancaria
        cs.banco=b2;
        cs.correntista=p2;

        ContaEspecial ce = new ContaEspecial();
        ce.setDiasSemJuros(10);      //ContaEspecial++
        ce.setLimite(1500);          //ContaEspecial++
        ce.setAgencia(35);           //ContaBancaria
        ce.setNumeroDaConta(1176);   //ContaBancaria
        ce.setSaldo(3500);           //ContaBancaria
        ce.banco=b1;             //Banco1 
        ce.correntista=p1;       //Pessoa1
        ce.cartao=cdc1;          //CartaoDeCredito1
       
        System.out.println("TO STRING ContaEspecial");
        System.out.println(ce);
        System.out.println("\n\n");
        System.out.println("TO STRING ContaSimples");
        System.out.println(cs);
        
        //testes:
        
        System.out.println("\n\n----TESTES NOS METODOS---- \n");
        // TESTANDO OS METODOS DE ContaBancaria
            //ContaEspecial:
            System.out.println("--Conta Especial: metodos ContaBancaria:");
            ce.deposito(500);  //saida 4000
            ce.saque(3000);   //saida 1000
            System.out.println("\n--\n");
            //ContaSimples
            System.out.println("--Conta Simples: metodos ContaBancaria:");
            cs.deposito(250); //saida 1000    
            cs.saque(1100);  //saida saldo insuficiente
            cs.saque(-500);  //saida valor negativo nao pode
            System.out.println("\n--\n");
        //TESTANDO METODOS DE POUPANCA
        System.out.println("--Conta Simples: metodos ContaSimples");
            cs.depositoPoupanca(500);//saida 3000
            cs.saquePoupanca(3000);   //saida 0
            
    }
}
