import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Arthur Aloise");

        Conta corrente = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente1);

        corrente.depositar(100d);
        corrente.transferir(100d, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();




    }
}
