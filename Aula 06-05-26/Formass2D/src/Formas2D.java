public abstract class Formas2D {
    private double altura;
    private double largura;
    private String nome;

    // CONSTRUTORES
    public Formas2D() {
        this.altura = this.largura = 0.0;
        this.nome = "nada";
    }
    public Formas2D(double w, double h, String n) {
        this.altura = h;
        this.largura = w;
        this.nome = n;
    }
    public Formas2D(double x, String nome){ // Construtor para lados iguais
        this.altura = this.largura = x;
        this.nome = nome;
    }

    // GETTERS AND SETTES
    public double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura = altura;}

    public double getLargura() {return largura;}
    public void setLargura(double largura) {this.largura = largura;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    // MÉTODOS ABSTRATOS
    public abstract double area();

    @Override
    public String toString() {
        return "Formas2D [Altura:" + altura + ", largura:" + largura + ", nome:" + nome + "]";
    }
}