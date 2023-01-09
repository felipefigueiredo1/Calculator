public class Calculator {
    public int x;
    public int y;

    public String[] args;

    public Calculator(int x, int y, String[] args) {
       this.x = x;
       this.y = y;
       this.args = args;
    }

    public Number exec() {
        try {
            if(args[0].equals("sum")) {
                return sum(x, y);
            }

            if(args[0].equals("subtract")) {
                return subtract(x, y);
            }

            if(args[0].equals("divide")) {
                return divide(x, y);
            }

            if(args[0].equals("multiply")) {
                return multiply(x, y);
            }

            throw new Exception("Argumento de operação inválido");
        } catch(Exception e) {
            System.out.println(e);
            return 0;
        }

    }

    Number sum(int x, int y) {
        return x + y;
    }

    Number subtract(int x, int y) {
        return x - y;
    }

    Number multiply(int x, int y) {
        return x * y;
    }

    Number divide(float x, float y) {
        return x / y;
    }
}
