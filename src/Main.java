public class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        Calculate calculate = new Calculate(x, y, args);
        calculate.exec();
    }
}