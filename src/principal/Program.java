
package principal;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {
            
        Set<String> set = new LinkedHashSet<>();   // HashSet não garante ordem das inserções === o TreeSet ordena os dados de acordo com o tipo === o LinkedHashSet mantem a ordem de inserção //

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }
        System.out.println("======================");

        set.remove("Tablet");

        for (String p : set) {
            System.out.println(p);
        }
        System.out.println("======================");


        set.removeIf(x -> x.charAt(0) == 'T');  // remova X talque x tenha o valor na primeira posição igual a T

        for (String p : set) {
            System.out.println(p);
        }

    }

}