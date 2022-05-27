package examen1.ejercicio3;

public class Batidora implements IArtefacto{

    public int precio;

    public Batidora(int precio) {
        this.precio = precio;
    }
    @Override
    public void showInfo() {
        System.out.println("\n BATIDORA");
        System.out.println("Precio: " + precio + "bs");
    }
}
