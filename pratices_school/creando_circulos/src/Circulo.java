import java.lang.Math;

public class Circulo {
    private double radio;

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double r) {
        this.radio = r;
    }

    public double getPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

}
