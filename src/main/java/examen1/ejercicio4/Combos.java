package examen1.ejercicio4;

public class Combos {

    public String pipocas;
    public String refresco;
    public String chocolate;

    public Combos() {}

    public String getPipocas() {
        return pipocas;
    }

    public void setPipocas(String pipocas) {
        this.pipocas = pipocas;
    }

    public String getRefresco() {
        return refresco;
    }

    public void setRefresco(String refresco) {
        this.refresco = refresco;
    }

    public String getChocolate() {
        return chocolate;
    }

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }

    public void showInfo() {
        System.out.println("Pipocas: " + this.pipocas);
        System.out.println("Refrescos: " + this.refresco);
        System.out.println("Chocolates: " + this.chocolate);
    }
}
