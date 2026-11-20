package View;
import Model.GObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public abstract class GObjectForm<T extends GObject> {
    private List<T> records;
    protected static final Scanner scanner = new Scanner(System.in);

    public GObjectForm() {
        this.records = new ArrayList<>();
    }
}

    public abstract T showInsertForm();
    String[] fields = getFields();
        for (int i = 0; i < this.records.size(); i++) {
            T record = this.records.get(i);
            String[] values = this.convertModelFrom Values(record);
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
    GObjectForm<GObject> form = new GObjectForm<>();


}