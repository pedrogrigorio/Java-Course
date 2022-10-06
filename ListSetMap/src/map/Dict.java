package src.map;

import java.util.HashMap;
import java.util.Map;

public class Dict {
    
    public static void main(String[] args) {

        Map<String, Integer> map;
        map = new HashMap<>();

        map.put("João", 20);
        map.put(null, 40);
        map.put(null, 50);
        map.put("Carlos", null);
        map.put("Pedro", 55);
        
        if(!map.containsKey("João")){
            map.put("João", null);
        }

        print(map);
    }

    private static void print(Map<String, Integer> item) {

        item.forEach((chave, valor) -> {
            System.out.println("chave: " + chave + ", valor: " + valor);
        });
    }
}
