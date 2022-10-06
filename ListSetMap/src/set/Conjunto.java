package src.set;

import java.util.*;

public class Conjunto {
    public static void main(String[] args) {

        Set<Integer> set;
        set = new HashSet<>();

        set.add(1);
        set.add(3);
        set.add(null);
        set.add(null);
        set.add(1);
        
        print(set);
    }

    private static void print(Set<Integer> item) {

        Iterator<Integer> iterator = item.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    
}
