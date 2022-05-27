package examen1.ejercicio3;

public class Radio implements IArtefacto{

    public int precio;

    public Radio(int precio) {
        this.precio = precio;
    }

    @Override
    public void showInfo() {
        System.out.println("\n RADIO");
        System.out.println("Precio: " + precio + "bs");
    }
}
