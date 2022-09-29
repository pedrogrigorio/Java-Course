package src;

public class Conta {

    private Integer valor;

    public Conta(){
        this.valor = 0;
    }
    public Conta(Integer valor){
        this.valor = valor;
    }

    public void view(){
        System.out.println(valor);
    }


}
