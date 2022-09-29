package src;

public class ContaCorrente extends Conta {
    public ContaCorrente(){
        super();
    }

    @Override
    public void saldo(){
        System.out.println("Conta Corrente: " + (this.total + 100));
    }
}
