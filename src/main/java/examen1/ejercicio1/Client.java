package examen1.ejercicio1;

public class Client {

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("65DF67", "Nisan", "blanco");
        Vehiculo v2 = new Vehiculo("39FU51", "Audi", "rojo");
        Vehiculo v3 = new Vehiculo("90WR24", "Toyota", "azul");
        Vehiculo v4 = new Vehiculo("97TY56", "Mitshubisi", "negro");
        Vehiculo v5 = new Vehiculo("81NG45", "Ford", "verde");
        Vehiculo v6 = new Vehiculo("PLR581", "BMW", "blanco");

        Cabina.getInstance().registrarAuto(v1);
        Cabina.getInstance().registrarAuto(v2);
        Cabina.getInstance().registrarAuto(v3);
        Cabina.getInstance().registrarAuto(v4);
        Cabina.getInstance().registrarAuto(v5);
        Cabina.getInstance().registrarAuto(v6);
    }
}
