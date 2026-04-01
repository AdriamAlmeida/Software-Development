public class Time2 {

    private int hora; // 0 - 23
    private int minuto; // 0 - 59
    private int segundo; // 0 - 59

    // Construtor padrão (sem argumentos)
    public Time2() {
        this(0, 0, 0);
    }

    // Construtor com um argumento (hora)
    public Time2(int h) {
        this(h, 0, 0);
    }

    // Construtor com dois argumentos (hora e minuto)
    public Time2(int h, int m) {
        this(h, m, 0);
    }

    // Construtor com três argumentos
    public Time2(int h, int m, int s){
        setTime(h, m, s);
    }

    // Construtor de cópia
    public Time2(Time2 time){
        this(time.getHora(), time.getMinuto(), time.getSegundo());
    }

    public int getHora() { return hora; }
    public int getMinuto() { return minuto; }
    public int getSegundo() { return segundo; }

    public void setTime(int h, int m, int s) {
        hora = ((h >= 0 && h < 24) ? h : 0);
        minuto = ((m >= 0 && m < 60) ? m : 0);
        segundo = ((s >= 0 && s < 60) ? s : 0);
    }
    
    public String toUniversaString() {
        return String.format("%d:%02d:%02d", hora, minuto, segundo);
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s", ((hora == 0 || hora == 12) ? 12 : hora % 12), minuto, segundo,
                (hora < 12 ? "AM" : "PM"));
    }
}
