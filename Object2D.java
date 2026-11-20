abstract class Object2D {
    protected String label;

    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    public String getlabel() {
        return label;
    }
}

class SegiEmpat extends Object2D {
    public SegiEmpat(String label) {
        super.label = label;
    }
}

class Persegi extends Object2D {
    public Persegi(String label) {
        super.label = label;
    }
}

class Lingkaran extends Object2D {
    public Lingkaran(String label) {
        super.label = label;
    }
}
