package examen1.ejercicio6;

public class Suma extends Abstact {

    public Suma(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        if(context.input.startsWith("+")) {
            context.input = context.input.substring(this.digit);
        }
    }
}
