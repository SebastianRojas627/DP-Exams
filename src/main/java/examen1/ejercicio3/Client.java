package examen1.ejercicio3;

public class Client {

    public static void main(String[] args) {
        IArtefacto a1 = Factory.make("television");
        IArtefacto a2 = Factory.make("radio");
        IArtefacto a3 = Factory.make("batidora");
        IArtefacto a4 = Factory.make("refrigerador");
        IArtefacto a5 = Factory.make("microhoondas");

        a1.showInfo();
        a2.showInfo();
        a3.showInfo();
        a4.showInfo();
        a5.showInfo();
    }
}
