public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1();
        System.out.print("Valor universal inicial de time: ");
        System.out.println(time.toUniversaString());
        System.out.print("Valor default inicial de time: ");
        System.out.println(time.toString() + "\n");

        time.setTime(13, 27, 6);
        System.out.print("Valor universal depois do setTime: ");
        System.out.println(time.toUniversaString());
        System.out.print("Valor default depois do setTime: ");
        System.out.println(time.toString() + "\n");
    }
}