import java.util.Scanner;

public class Carro implements Veículos{
    private String modelo;

    // CONSTRUTORES
    public Carro(){}
    public Carro(String modelo){
        this.modelo = modelo;
    }

    // GETTERS AND SETTERS
    public String getModelo(){return modelo;}
    public void setModelo(String modelo){this.modelo = modelo;}

    @Override
    public void acelerar() {
        System.out.println("Qual a intensidade de aceleração?");
        Scanner sc = new Scanner(System.in);
        int intensidade = sc.nextInt();
        System.out.println("Acelerando carro na intesidade " + intensidade + "...");
        sc.close();
    }

    @Override
    public void frear() {
        System.out.println("Freio de carro ativado");
        
    }

    @Override
    public String obterTipo() {
        return "Carro";
    }
}
