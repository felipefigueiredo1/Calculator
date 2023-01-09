public class Calculate {
    static Calculator calculator;
    public static void main(String[] args) {
        try {
            if(args[0].equals("help")) {
                help();
            } else {
                int x = Integer.parseInt(args[1]);
                int y = Integer.parseInt(args[2]);
                calculator = new Calculator(x, y, args);
                if(calculator.exec().equals(0)) {
                    return;
                } else {
                    System.out.println(calculator.exec());
                }
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: empty required arguments");
        }
    }

    public static void help() {
        System.out.println("------Possible arguments------");
        System.out.println("sum      x y");
        System.out.println("subtract x y");
        System.out.println("multiply x y");
        System.out.println("divide   x y");
    }
}