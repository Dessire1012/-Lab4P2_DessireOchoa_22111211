
package Lab4P2_DessireOchoa_22111211;


public class Zonas {
    
    private String nombre;
    private int tamaño;
    private int coordenadaX;
    private int coordenadaY;

    public Zonas(String nombre, int tamaño, int coordenadaX, int coordenadaY) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
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

    public void setTamaño(int tamaño) throws ExcepcionS {
        if(tamaño >= 100 && tamaño <= 400){
           this.tamaño = tamaño; 
        }else {
            throw new ExcepcionS ("El tamaño no entra en los parametros");
        }
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) throws ExcepcionS{
        if (coordenadaX <= 100){
              this.coordenadaX = coordenadaX;
        }else {
            throw new ExcepcionS ("La coordenada no entra en los parametros");
        }
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY)throws ExcepcionS{
        if (coordenadaY <= 100){
            this.coordenadaY = coordenadaY;
        } else {
            throw new ExcepcionS ("La coordenada no entra en los parametros");
        }
    }

    @Override
    public String toString() {
        return "Zonas{" + "nombre=" + nombre + ", tama\u00f1o=" + tamaño + ", coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + '}';
    }

    
    
}
