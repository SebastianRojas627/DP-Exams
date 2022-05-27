package examen1.ejercicio3;

public class Microondas implements IArtefacto{

    public int precio;

    public Microondas(int precio) {
        this.precio = precio;
    }

    @Override
    public void showInfo() {
            System.out.println("\n MICROONDAS");
        System.out.println("Precio: " + precio + "bs");
    }
}
