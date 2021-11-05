
package Lab4P2_DessireOchoa_22111211;


public class Zonas {
    
    private String nombre;
    private int tamaño;
    private int coodernadaX;
    private int coodernadaY;

    public Zonas(String nombre, int tamaño, int coodernadaX, int coodernadaY) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.coodernadaX = coodernadaX;
        this.coodernadaY = coodernadaY;
    }

    public Zonas() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getCoodernadaX() {
        return coodernadaX;
    }

    public void setCoodernadaX(int coodernadaX) {
        this.coodernadaX = coodernadaX;
    }

    public int getCoodernadaY() {
        return coodernadaY;
    }

    public void setCoodernadaY(int coodernadaY) {
        this.coodernadaY = coodernadaY;
    }

    @Override
    public String toString() {
        return "Zonas{" + "nombre=" + nombre + ", tama\u00f1o=" + tamaño + ", coodernadaX=" + coodernadaX + ", coodernadaY=" + coodernadaY + '}';
    }

    
}
