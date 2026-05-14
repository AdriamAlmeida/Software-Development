
public class Retangulo extends Formas2D {

    // CONSTRUTORES
    Retangulo() { // Construtor padrão
        super();
    }
    Retangulo(double w, double h, String n) { // Construtor para Retangulo
        super(w, h, n);
    }
    public Retangulo(double x, String nome) { // Construtor para lados iguais
        super(x, nome);
    }

    // Implementar métodos abstratos
    public double area() {
        return getAltura() * getLargura();
    }

    @Override
    public String toString() {
        return "- Retangulo [Altura: " + getAltura() + "cm, largura: " + getLargura() + "cm, nome: " + getNome() + "]";
    }
}