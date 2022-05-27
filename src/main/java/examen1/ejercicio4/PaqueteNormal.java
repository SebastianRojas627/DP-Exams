package examen1.ejercicio4;

public class PaqueteNormal extends ComboBuilder{

    @Override
    public void defineCombo() {
        System.out.println("\n Combo Paquete Normal");
    }

    @Override
    public void buildPipocas() {
        product.setPipocas("pipocas en envase normal");
    }

    @Override
    public void buildRefrescos() {
        product.setRefresco("1 refresco");
    }

    @Override
    public void buildChocolate() {
        product.setChocolate("no cuenta con chocolates");
    }
}
