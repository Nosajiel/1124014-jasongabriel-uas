package Model;

public class Object2D extends GObject {
    protected String label;

    public double hitungLuas() {
        return 0;
    }
    public double hitungKeliling() {
        return 0;
    }

    public String getlabel() {
        return label;
    }
}

class SegiEmpat extends Object2D {
    public SegiEmpat(String label) {
        super.label = label;
    }
    private final double panjang = 10;
    private final double lebar = 5;

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

class Persegi extends Object2D {
    public Persegi(String label) {
        super.label = label;
    }
    private final double sisi = 10;
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}

class Lingkaran extends Object2D {
    public Lingkaran(String label) {
        super.label = label;
    }
    private final double jari = 5;
    @Override
    public double hitungLuas() {
        return Math.PI * jari * jari;
    }
    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jari;
    }
}
