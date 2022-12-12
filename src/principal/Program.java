
package principal;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {
            
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // union 
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);  // adiciona todos valores de A e B porém não permite duplicata
        System.out.println(c);

        // intersection 
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);  // deixa apenas os valores que são iguais no conjuto A e B sem duplicata
        System.out.println(d); 

        // difference 
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);  // Deixa apenas valore do conjunto A que não está no conjunto B
        System.out.println(e);


    }

}