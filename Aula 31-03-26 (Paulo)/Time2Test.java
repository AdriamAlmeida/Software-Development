public class Time2Test {

    public static void main(String[] args) {
        Time2 t1 = new Time2();

        Time2 t2 = new Time2(20);

        Time2 t3 = new Time2(20, 45);

        Time2 t4 = new Time2(t3);

        System.out.print("Valor universal inicial do t1: ");
        System.out.println(t1.toUniversaString());
        System.out.print("Valor default inicial do t1: ");
        System.out.println(t1.toString() + "\n");

        System.out.print("Valor universal inicial do t2: ");
        System.out.println(t2.toUniversaString());
        System.out.print("Valor default inicial do t2: ");
        System.out.println(t2.toString() + "\n");

        System.out.print("Valor universal inicial do t4(t3): ");
        System.out.println(t4.toUniversaString());
        System.out.print("Valor default inicial do t4(t3): ");
        System.out.println(t4.toString() + "\n");

    }
}
