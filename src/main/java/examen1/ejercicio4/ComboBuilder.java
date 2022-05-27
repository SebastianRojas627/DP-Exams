package examen1.ejercicio4;

public abstract class ComboBuilder {

    protected Combos product;

    public Combos getProduct() {
        return product;
    }

    public void createProduct() {
        this.product = new Combos();
    }

    public abstract void buildPipocas();

    public abstract void buildRefrescos();

    public abstract void buildChocolate();

}
