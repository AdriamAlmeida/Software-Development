import java.util.ArrayList;
import java.util.Collections;

public class ArrayInteiros {
    public static void main(String[] args) throws Exception {
        System.out.println("----- AULA 20/05/2026 ----- \n    --- Collections ---");
        ArrayList<Integer> inteiros = new ArrayList<>();
        inteiros.add(10);
        inteiros.add(50);
        inteiros.add(41);
        inteiros.add(0);
        inteiros.add(-1);

        System.out.println("Inteiros antes de ordenar: " + inteiros);
        Collections.sort(inteiros);
        System.out.println("inteiros depois de ordenar: " + inteiros);
        System.out.println("Collections.binarySearch() 10: " + Collections.binarySearch(inteiros, 10)); // Resultados igual ou maior que zero é porque achou.
        System.out.println("Collections.binarySearch() 20: " + Collections.binarySearch(inteiros, 20) + "\n"); // Números negativos significam erro.
        
        ArrayList<Integer> inteiros2 = new ArrayList<>();
        inteiros2.add(30);
        inteiros2.add(52);
        inteiros2.add(20);
        inteiros2.add(-10);
        inteiros2.add(100);
        
        System.out.println("Os conjuntos não possuem valores em comum? " + Collections.disjoint(inteiros, inteiros2));
        inteiros2.add(100);
        System.out.println("Exibindo a frequência de valores: " + Collections.frequency(inteiros2,100));
        System.out.println("O maior valor encontrado em inteiros2 é: " + Collections.max(inteiros2));
        System.out.println("O menor valor encontrado em inteiros é: " + Collections.min(inteiros));
        // Inverter o AraryList
        Collections.reverse(inteiros2);
        System.out.println("ArrayList inteiros2 invertido: " + inteiros2);
    }
}
