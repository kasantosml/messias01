class ProgramaConta {
    public static void main(String[]args) {

        Conta c1 = new Conta();

        c1.numero = 123;
        c1.titular = "Kawan";
        c1.saldo = 1000;

        c1.depositar (500);
        c1.sacar (300);

        System.out.println(c1.titular);
        System.out.println(c1.numero);
        System.out.println(c1.saldo);
}
}

