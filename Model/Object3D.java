package Model;

public class Object3D extends GObject {
    protected String label;

    public double hitungLuasPermukaan() {
        return 0;
    }
    public double hitungVolume() {
        return 0;
    }

    public String getlabel() {
        return label;
    }
    
}

class Balok extends Object3D {
    public Balok(String label) {
        super.label = label;
    }
    private final double panjang = 10;
    private final double lebar = 5;
    private final double tinggi = 10;
    
    @Override
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}
class Kubus extends Object3D {
    public Kubus(String label) {
        super.label = label;
    }
    private final double sisi = 10;
    @Override
    public double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }
    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }
}

class Kerucut extends Object3D {
    public Kerucut(String label) {
        super.label = label;
    }
    private final double jari = 5;
    private final double tinggi = 10;
    @Override
    public double hitungLuasPermukaan() {
        return Math.PI * jari * jari + Math.PI * jari * tinggi;
    }
    @Override
    public double hitungVolume() {
        return 1.333 * Math.PI * jari * jari * tinggi;
    }
}


