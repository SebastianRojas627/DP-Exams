package examen1.ejercicio6;

public class Numero extends Abstact {

    public Numero(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        context.output = context.output + (Integer.parseInt(context.input.substring(0, this.digit)));
        context.input = context.input.substring(this.digit);
    }
}
