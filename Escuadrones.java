
package Lab4P2_DessireOchoa_22111211;

import java.util.ArrayList;


public class Escuadrones {
    private String nombre;
    private ArrayList <Zonas> ZonasConquistadas = new ArrayList();
    private ArrayList <Soldados> listaSoldados = new ArrayList ();

    public Escuadrones(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Zonas> getZonasConquistadas() {
        return ZonasConquistadas;
    }

    public void setZonasConquistadas(ArrayList<Zonas> ZonasConquistadas) {
        this.ZonasConquistadas = ZonasConquistadas;
    }

    public ArrayList<Soldados> getListaSoldados() {
        return listaSoldados;
    }

    public void setListaSoldados(ArrayList<Soldados> listaSoldados) {
        this.listaSoldados = listaSoldados;
    }

    @Override
    public String toString() {
        return "Escuadrones{" + "nombre=" + nombre + ", ZonasConquistadas=" + ZonasConquistadas + ", listaSoldados=" + listaSoldados + '}';
    }
    
    
}
