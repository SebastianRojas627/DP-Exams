package examen1.ejercicio4;

import builder.structure.Product;

public class Client {

    public static void main(String[] args) {

        EmpleadoBara director = new EmpleadoBara();

        MegaPackete c1 = new MegaPackete();
        PaqueteMediano c2 = new PaqueteMediano();
        PaqueteNormal c3 = new PaqueteNormal();

        director.setBuilder(c1);
        director.buildProduct();
        Combos combo1 = director.getCombo();
        combo1.showInfo();

        director.setBuilder(c2);
        director.buildProduct();
        Combos combo2 = director.getCombo();
        combo2.showInfo();

        director.setBuilder(c3);
        director.buildProduct();
        Combos combo3 = director.getCombo();
        combo3.showInfo();

    }
}
