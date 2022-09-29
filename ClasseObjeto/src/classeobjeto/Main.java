package src.classeobjeto;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Carro carro = new Carro(4,3);
        System.out.println(carro.getRodas());
        System.out.println(carro.getPortas());

        Carro carro2 = new Carro(4);
        System.out.println(carro2.getRodas());
        System.out.println(carro2.getPortas());

        System.out.println(Calculo.soma(5,4));
    }
}
