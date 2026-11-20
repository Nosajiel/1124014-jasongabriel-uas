package View;
import Model.GObject;
import Model.Object2D;
import Model.Object3D;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public abstract class GObjectForm<T extends GObject> {
    private List<GObject> label, values;
    protected static final Scanner scanner = new Scanner(System.in);

    public GObjectForm() {
        this.label = new ArrayList<>();
        this.values = new ArrayList<>();
    }
}

    public abstract T showInsertForm();
    String[] fields = getFields();
        for (int i = 0; i < this.label.size(); i++) {
            GObject record = this.label.get(i);
            String[] values = this.constructModelFromValues(record.getlabel(), record.getvalues());
            System.out.println(i + ". ");
            for (int j = 0; j < fields.length; j++) {
                System.out.print(fields[j] + ": " + values[j] + " ");
            }
            System.out.println();
        }
    protected abstract String[] getFields();
    protected abstract T constructModelFromValues(String label, double[] values);
    protected abstract double[] extractValuesFromModel(T model);


public static void main(String[] args) {
    Object Objectview = new Object();
    boolean Running = true;
    
    while (Running) {
        System.out.println("/n Pilih menu");
        System.out.println("1. Tampilkan Semua");
        System.out.println("2. Tambah Persegi");
        System.out.println("3. Tambah Segi Empat");
        System.out.println("4. Tambah Lingkaran");
        System.out.println("5. Tambah Balok");
        System.out.println("6. Tambah Kubus");
        System.out.println("7. Tambah Kerucut");
        System.out.println("0. Kembali");
        int pilih = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Pilihan: ");
        
        
    }

}