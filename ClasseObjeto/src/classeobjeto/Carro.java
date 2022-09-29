package src.classeobjeto;

public class Carro{
    private int rodas = 4;
    private int portas = 4;

    public Carro(int rodas, int portas){
        this.rodas = rodas;
        this.portas = portas;
    }

    public Carro(int rodas){
        this.rodas = rodas;
        this.portas = 2;
    }

    public int getRodas(){
        return rodas;
    }

    public int getPortas(){
        return portas;
    }
}