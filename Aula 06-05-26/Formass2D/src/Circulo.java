public class Circulo extends Formas2D { // Necessário implementar área

    public Circulo(){}
    public Circulo (double altura, String nome){
        super(altura, nome);
    }

    public double area(){
        double pi = 3.14;
        double raio = getAltura() / 2;
        return (raio*raio)*pi;
    }

    @Override
    public String toString(){
        return "- Círculo: [Raio: " + (getAltura()/2) + "cm, diametro: " + getAltura() + "cm]";
    }
}