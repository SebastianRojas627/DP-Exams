package examen1.ejercicio3;

public class Television implements IArtefacto{

    public int precio;

    public Television(int precio) {
        this.precio = precio;
    }

    @Override
    public void showInfo() {
        System.out.println("\n TELEVISOR");
        System.out.println("Precio: " + precio + "bs");
    }
}
