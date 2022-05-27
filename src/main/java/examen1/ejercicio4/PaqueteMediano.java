package examen1.ejercicio4;

public class PaqueteMediano extends ComboBuilder{

    @Override
    public void defineCombo() {
        System.out.println("\n Combo Paquete Mediano");
    }

    @Override
    public void buildPipocas() {
        product.setPipocas("pipocas grandes");
    }

    @Override
    public void buildRefrescos() {
        product.setRefresco("2 vasos de refrescos");
    }

    @Override
    public void buildChocolate() {
        product.setChocolate("1 chocolate");
    }
}

