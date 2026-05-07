
class Conta {

    int numero = 0;
    String titular = "";
    double saldo = 0.0;

    public void depositar(double valor) {

        saldo += valor;

        System.out.println("Depósito Concluído!!");
    }

    public void sacar(double valor) {

        if (valor <= this.saldo) {

            this.saldo -= valor;

            System.out.println("Saque com Sucesso!!");

        } else {

            System.out.println("Saque não Efetuado!!");

        }
    }
}

   
