public class Calculate {
    public int x;
    public int y;

    public String[] args;

    public Calculate(int x, int y, String[] args) {
       this.x = x;
       this.y = y;
       this.args = args;
    }

    public void exec() {
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

    void sum(int x, int y) {
        System.out.println(x + y);
    }

    void subtraction(int x, int y) {
        System.out.println(x - y);
    }

    void multiplication(int x, int y) {
        System.out.println(x * y);
    }

    void division(int x, int y) {
        System.out.println(x / y);
    }
}
