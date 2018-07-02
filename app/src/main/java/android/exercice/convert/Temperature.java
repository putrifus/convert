package android.exercice.convert;

public class Temperature {
    private double cel, far;

    public Temperature(double d, String str) {
        if (str.equals("f")) {
            this.far = d;
            this.cel = (d - 32) / 1.8;
        } else {
            this.cel = d;
            this.far = d * 1.8 + 32;
        }
    }

    public double getCel() {
        return cel;
    }

    public double getFar() {
        return far;
    }
}
