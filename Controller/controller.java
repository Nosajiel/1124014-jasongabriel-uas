package Controller;

import Model.GObject;
import View.GObjectForm;
import Model.Object2D;
import Model.Object3D;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class controller {
    private List<Object2D> GObjectList2D = new ArrayList<>();
    private List<Object3D> GObjectList3D = new ArrayList<>();

    public void add2D(SegiEmpat segEmpat) {
        GObjectList2D.add(segEmpat);
    }
    public void add2D(Persegi persegi) {
        GObjectList2D.add(persegi);
    }
    public void add2D(Lingkaran lingkaran) {
        GObjectList2D.add(lingkaran);
    }
    public void add3D(Balok balok) {
        GObjectList3D.add(balok);
    }
    public void add3D(Kubus kubus) {
        GObjectList3D.add(kubus);
    }
    public void add3D(Kerucut kerucut) {
        GObjectList3D.add(kerucut);
    }
    
}
