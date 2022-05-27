package examen1.ejercicio6;

public class Client {

    public static void main(String[] args) {

        String msg = "2 * 3 + 5 + 5 + 5";
        NonTerminalExpression parser = new NonTerminalExpression(msg);
        System.out.println("msg interpretado: " + parser.evaluateMsg());
    }
}
