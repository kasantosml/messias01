public class ProgramaPessoa {

    public static void main(String[] args) {

        // Pessoa Física
        PessoaFisica pf = new PessoaFisica();

        pf.setNome("Beatriz");
        pf.setDataNasc("17/09/2008");
        pf.setCpf("123.456.789-00");
        pf.setSexo('F');

        System.out.println(" Pessoa Física ");
        System.out.println("Nome: " + pf.getNome());
        System.out.println("Data Nasc: " + pf.getDataNasc());
        System.out.println("CPF: " + pf.getCpf());
        System.out.println("Sexo: " + pf.getSexo());

        // Pessoa Jurídica
        PessoaJuridica pj = new PessoaJuridica();

        pj.setNome("Funerária Santa Luzia sua morte nossa alegria");
        pj.setDataNasc("01/12/2023");
        pj.setCnpj("12.345.678/0001-99");

        System.out.println("\n Pessoa Jurídica");
        System.out.println("Nome: " + pj.getNome());
        System.out.println("Data Fundação: " + pj.getDataNasc());
        System.out.println("CNPJ: " + pj.getCnpj());
    }
}