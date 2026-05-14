import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----- CLASSES E MÉTODOS ABSTRATOS -----");
        ArrayList<Formas2D> formasList = new ArrayList<>();
        MenuFormas menuFormas = new MenuFormas();
        int option = 0;

        do {
            option = menuFormas.exibirMenu();
            switch (option) {
                case 1: // Cadastrar forma
                    formasList.add(menuFormas.cadaFormas2d());
                    break;

                case 2: // Listar forma
                    for (Formas2D formas2d : formasList)
                        System.out.println(formas2d.toString());
                    break;

                case 3: // Calcular área
                    for (Formas2D formas2d : formasList)
                        System.out.println("Área da forma: " + formas2d.getNome() + 
                                           ": " + formas2d.area());
                    break;
            
                default:
                    break;
            }
        } while (option !=0);
        menuFormas.encerraSistema(); // encerra o scanner
    }
}