import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Conta conta1 = new Conta();
        System.out.println("Digite o nome: ");
        String n = sc.nextLine(); // lendo do teclado
        conta1.setNome(n); // usando set
        // conta1.getSaldo(1000); // Saldo só pode ser editado com saque ou depósito
        conta1.setNumero(2); // atributo privado só pode ser acessado via método
        System.out.println("O nome digitado é: " + conta1.getNome());

        // VISUALIZA CONTAS
        // Conta 2
        Conta conta2 = new Conta();
        conta2.setNumero(5);

        System.out.println(conta1.toString());
        System.out.println(conta2.toString());

        Conta conta3 = new Conta();
        System.out.println(conta3.toString());


        sc.close(); // fecha o Scanner
    }
}