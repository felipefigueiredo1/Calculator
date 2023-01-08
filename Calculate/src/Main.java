public class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if(args[0].equals("sum")) {
            sum(x, y);
        }

        if(args[0].equals("subtraction")) {
            subtraction(x, y);
        }

        if(args[0].equals("division")) {
            division(x, y);
        }

        if(args[0].equals("multiplication")) {
            multiplication(x, y);
        }
    }

    static void sum(int x, int y) {
        System.out.println(x + y);
    }

    static void subtraction(int x, int y) {
        System.out.println(x - y);
    }

    static void multiplication(int x, int y) {
        System.out.println(x * y);
    }

    static void division(int x, int y) {
        System.out.println(x / y);
    }

}