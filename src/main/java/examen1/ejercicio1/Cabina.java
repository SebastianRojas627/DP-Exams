package examen1.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Cabina {

    public static final Cabina instance = new Cabina();
    private List<Vehiculo> vehiculos = new ArrayList<>();
    private int dinero = 0;

    private Cabina() {}

    public static Cabina getInstance() {
        return instance;
    }

    public void registrarAuto(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehiculo registrado correctamente");
        cobroPeaje(vehiculo);
        if(vehiculos.size() >= 6)
            showInfo();
    }

    private void cobroPeaje(Vehiculo vehiculo) {
        dinero += 100 * vehiculo.getModelo().length();
        System.out.println("Pago realizado exitosamente");
    }

    private void showInfo() {
        System.out.println("\n 6 vehiculos registrados, mostrando informacion");
        for (Vehiculo registrado : vehiculos) {
            System.out.println("\n *** VEHICULO: ***");
            System.out.println("Placa: " + registrado.getPlaca());
            System.out.println("Modelo: " + registrado.getModelo());
            System.out.println("Color: " + registrado.getColor());
        }
        System.out.println("Dinero cobrado: " + dinero);
    }

}
