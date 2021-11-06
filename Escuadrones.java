
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
    
    public void addZonaConquistada(String nombre, int tamaño, int coordenadaX, int coordenadaY){
        ZonasConquistadas.add(new Zonas(nombre,tamaño,coordenadaX,coordenadaY));
    }

    public ArrayList<Soldados> getListaSoldados() {
        return listaSoldados;
    }

    public void setListaSoldados(ArrayList<Soldados> listaSoldados) {
        this.listaSoldados = listaSoldados;
    }
  
   
   public void addInfanteríaLigera(String nombre, int edad, int tiempoEjercito, String rango, int vida) {
        listaSoldados.add(new InfanteríaLigera(nombre, edad, tiempoEjercito, rango, vida));
    }
   
    public void addInfanteriaPesada(String nombre, int edad, int tiempoEjercito, String rango, int vida) {
        listaSoldados.add(new InfanteriaPesada(nombre, edad, tiempoEjercito, rango, vida));
    }
    
    public void addSargento(String nombre, int edad, int tiempoEjercito, String rango, int vida) {
        listaSoldados.add(new Sargento(nombre, edad, tiempoEjercito, rango, vida));
    }
    
    public void addCapitan(String nombre, int edad, int tiempoEjercito, String rango, int vida) {
        listaSoldados.add(new Capitan(nombre, edad, tiempoEjercito, rango, vida));
    }
    
    public void addSuperSoldado(String nombre, int edad, int tiempoEjercito, String rango, int vida) {
        listaSoldados.add(new SuperSoldado(nombre, edad, tiempoEjercito, rango, vida));
    }

    @Override
    public String toString() {
        return "Escuadrones{" + "nombre=" + nombre + ", ZonasConquistadas=" + ZonasConquistadas + ", listaSoldados=" + listaSoldados + '}';
    }

    
}
