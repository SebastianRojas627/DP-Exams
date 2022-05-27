package examen1.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class NonTerminalExpression extends Abstact {

    private List<Abstact> grammar = new ArrayList<>();
    private Context context;

    public NonTerminalExpression(String msgToInterpreter) {
        context = new Context(msgToInterpreter.replace(" ", ""));
        for (String charOriginal : msgToInterpreter.split(" ")) {
            switch (charOriginal) {
                case "+":
                    grammar.add(new Suma(charOriginal.length()));
                    break;
                case "*":
                    grammar.add(new Muktiplicacion(charOriginal.length()));
                    break;
                default:
                    grammar.add(new Numero(charOriginal.length()));
                    break;
            }
        }
    }

    public int evaluateMsg() {

        for (Abstact expression : grammar) {
            expression.interpreter(context);
        }

        return context.output;
    }


    @Override
    public void interpreter(Context context) {

    }
}
