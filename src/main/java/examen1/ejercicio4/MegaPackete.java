package examen1.ejercicio4;

public class MegaPackete extends ComboBuilder{

    @Override
    public void buildPipocas() {
        product.setPipocas("pipocas extragrandes");
    }

    @Override
    public void buildRefrescos() {
        product.setRefresco("3 vasos de gaseosas extragrandes con recarga ilimitada");
    }

    @Override
    public void buildChocolate() {
        product.setPipocas("2 chocolates grandes");
    }
}
