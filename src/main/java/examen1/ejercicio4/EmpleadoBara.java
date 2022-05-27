package examen1.ejercicio4;

import builder.structure.Builder;

public class EmpleadoBara {

    private ComboBuilder builder;

    public Combos getCombo() {
        return builder.getProduct();
    }

    public void setBuilder(ComboBuilder builder) {
        this.builder = builder;
    }

    public void buildProduct() {
        this.builder.createProduct();
        this.builder.defineCombo();
        this.builder.buildPipocas();
        this.builder.buildRefrescos();
        this.builder.buildChocolate();
    }
}
