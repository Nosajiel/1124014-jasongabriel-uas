package Model;
public class GObject {
    private String label;
    private double[] values;
    private double volume;
    private double tipe;
    private double tinggi;
    private double jariJari;


    public GObject(String label, double[] values, double volume, double tipe, double tinggi, double jariJari) {
        this.label = label;
        this.values = values;
        this.volume = volume;
        this.tipe = tipe;
        this.tinggi = tinggi;
        this.jariJari = jariJari;
    }
    public abstract String[][] getKeyValueDetails();

}
