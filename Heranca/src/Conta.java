package src;

public class Conta {

    private Integer valor;
    protected int total = 100;

    public Conta(){
        this.valor = 0;
    }
    public Conta(Integer valor){
        this.valor = valor;
    }

    public void view(){
        System.out.println(valor);
    }

    public void saldo(){
        System.out.println(this.total);
    }
}
