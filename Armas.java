
package Lab4P2_DessireOchoa_22111211;

public class Armas {
    private String nombre;
    private int daño;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "Armas{" + "nombre=" + nombre + ", da\u00f1o=" + daño + '}';
    }
    
    
}
