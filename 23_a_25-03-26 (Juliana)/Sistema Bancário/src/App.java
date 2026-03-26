import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Funcionario func = new Funcionario();
        
        
            System.out.println("Digite seu nome: ");
            func.nome = leitor.nextLine();
            System.out.println("Informe seu departamento: ");
            func.departamento = leitor.nextLine();
            System.out.println("Informe o Salário do usuário: ");
            func.salario = leitor.nextDouble();
            System.out.println("Quando o usuário ingressou na empresa?: ");
            func.dataEntrada = leitor.nextLine();
            System.out.println("Quando o usuário ingressou na empresa?: ");
            func.RG = leitor.nextLine();
            System.out.println("Quando o usuário ingressou na empresa?: ");
            func.estaNaEmpresa = leitor.nextBoolean();

        leitor.close();
    }
}
