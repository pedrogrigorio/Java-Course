package src;

public class Main {
    public static void main(String[] args) throws Exception {
        
        ContaPoupanca contaPoupanca = new ContaPoupanca(50);
        ContaCorrente contaCorrente = new ContaCorrente();

        contaPoupanca.view();
        contaCorrente.view();
    }
}
