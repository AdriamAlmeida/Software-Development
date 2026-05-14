public class Triangulo extends Formas2D {
    private String style;

    // CONSTRUTORES
    Triangulo() { // Construtor padrão
        super();
        style = "nada";
    }
    Triangulo(String s, double w, double h) { // Construtor para Triangulo.
        super(w, h, "triangulo");
        style = s;
    }
    public Triangulo(double x, String nome, String style) { // Construtor para lados iguais
        super(x, nome);
        this.style = style;
    }

    // GETTERS AND SETTERS
    public String getStyle() {return style;}
    public void setStyle(String style) {this.style = style;}

    // Implementar métodos abstratos
    public double area() {
        return getAltura() * getLargura() / 2;
    }

    @Override
    public String toString() {
        return "- Triangulo [Style: " + style + ", altura: " + getAltura() + "cm, largura: " + getLargura() + "cm, nome: " + getNome() + "]";
    }
}
