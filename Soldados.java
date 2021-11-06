
package Lab4P2_DessireOchoa_22111211;


public class  Soldados {
    
    private String nombre;
    private int edad;
    private int tiempoEjercito;
    private String rango;
    private int vida;

    public Soldados(String nombre, int edad, int tiempoEjercito, String rango, int vida) {
        this.nombre = nombre;
        this.edad = edad;
        this.tiempoEjercito = tiempoEjercito;
        this.rango = rango;
        this.vida = vida;
    }

    public Soldados() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTiempoEjercito() {
        return tiempoEjercito;
    }

    public void setTiempoEjercito(int tiempoEjercito) {
        this.tiempoEjercito = tiempoEjercito;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) throws ExcepcionS{
        if (vida >= 100 && vida <= 400)
            this.vida = vida;
        else {
            throw new ExcepcionS ("La vida no entra en los parametros");
        }

    }

    @Override
    public String toString() {
        return "Soldados{" + "nombre=" + nombre + ", edad=" + edad + ", tiempoEjercito=" + tiempoEjercito + ", rango=" + rango + ", vida=" + vida + '}';
    }
    
    
    
}
