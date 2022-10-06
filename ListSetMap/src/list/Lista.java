package src.list;

import java.util.*;

public class Lista {
    public static void main(String[] args) {
        
        List<Integer> lista;
        
        lista = new ArrayList<>();
        
        lista.add(1);
        lista.add(3);
        lista.add(null);
        lista.add(null);
        lista.add(1);

        print(lista);
    }

    private static void print(List<Integer> lista) {
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
