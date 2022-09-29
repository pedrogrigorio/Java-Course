package src;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Integer valor){
        super(valor);
    }

    @Override
    public void saldo(){
        System.out.println("Conta Poupança: " + (this.total + 13713));
    }
}
