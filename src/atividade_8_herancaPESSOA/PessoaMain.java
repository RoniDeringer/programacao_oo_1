package atividade_8_herancaPESSOA;

public class PessoaMain {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("Breno", "Rio do SUl");
        System.out.println(pf);

        System.out.println("------");

        PessoaJuridica pj = new PessoaJuridica("Debora", "Itajai");
        System.out.println(pj);

    }
}
