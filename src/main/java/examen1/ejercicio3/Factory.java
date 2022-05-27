package examen1.ejercicio3;

public class Factory {

    public static IArtefacto make(String typeProduct) {
        IArtefacto product;

        switch (typeProduct.toLowerCase()) {
            case "television":
                product = new Television(800);
                break;
            case "radio":
                product = new Radio(250);
                break;
            case "batidora":
                product = new Batidora(300);
                break;
            case "refrigerador":
                product = new Refrigerador(1500);
                break;
            default:
                product = new Microondas(850);
                break;
        }

        return product;
    }
}
