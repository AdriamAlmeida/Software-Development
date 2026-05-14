public class Bicicleta implements Veículos{
    private String estrada;

    // CONSTRUTORES 
    public Bicicleta(){}
    public Bicicleta(String estrada) {
        this.estrada = estrada;
    }

    // GETTERS AND SETTERS
    public String getEstrada(){return estrada;}
    public void setEstrada(String estrada){this.estrada = estrada;}

    @Override
    public void acelerar() {
        System.out.println("Pedalando mais rápido!"); 
    }

    @Override
    public void frear() {
        System.out.println("Acionando o freio traseiro.");
    }

    @Override
    public String obterTipo() {
        return "Bicicleta";
    }

}
