package examen1.ejercicio3;

public class Refrigerador implements IArtefacto{

    public int precio;

    public Refrigerador(int precio) {
        this.precio = precio;
    }

    @Override
    public void showInfo() {
        System.out.println("\n REFRIGERADOR");
        System.out.println("Precio: " + precio + "bs");
    }
}
