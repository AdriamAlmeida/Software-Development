import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----- AULA 20/05/2026 ----- \n    --- Collections ---");
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Mariana");
        nomes.add("André");
        nomes.add("Paulo");
        nomes.add("Carla");
        nomes.add("Matheus");
        
        System.out.println("Nomes antes de ordenar: " + nomes);
        Collections.sort(nomes);
        System.out.println("Nomes depois de ordenar: " + nomes);
        System.out.println("Collections.binarySearch() Adriam: " + Collections.binarySearch(nomes, "Adriam")); // Números negativos significam erro.
        System.out.println("Collections.binarySearch() Carla: " + Collections.binarySearch(nomes, "Carla") + "\n"); // Resultados igual ou maior que zero é porque achou.

        ArrayList<String> nomes2 = new ArrayList<>();
        nomes2.add("Mariana");
        nomes2.add("Andrea");
        nomes2.add("Carlos");
        nomes2.add("Miguel");
        nomes2.add("Paulo");
        // String n = "José";
        // n.toUpperCase(); // Transformas todas as letras em maiúsculas

        System.out.println("Nomes2 antes de ordenar: " + nomes2);
        Collections.sort(nomes2);
        System.out.println("Nomes2 depois de ordenar: " + nomes2);
        System.out.println("Os conjuntos de nomes não possuem valores em comum? " + Collections.disjoint(nomes, nomes2));
        nomes2.add("Mariana");
        System.out.println("Exibindo a frequência do valor 'Mariana': " + Collections.frequency(nomes2,"Mariana"));
        System.out.println("O maior valor encontrado em nomes2 é: " + Collections.max(nomes2));
        System.out.println("O menor valor encontrado em nomes é: " + Collections.min(nomes));
        // Inverter o AraryList
        Collections.reverse(nomes2);
        System.out.println("ArrayList nomes2 invertido: " + nomes2);
    }
}
