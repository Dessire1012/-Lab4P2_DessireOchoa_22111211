package Lab4P2_DessireOchoa_22111211;

public class Sargento extends Soldados {

    private Escopeta escopeta ;

    public Sargento() {
    }

    public Sargento(String nombre, int edad, int tiempoEjercito, String rango, int vida) {
        super(nombre, edad, tiempoEjercito, rango, vida);
    }

    public Escopeta getEscopeta() {
        return escopeta;
    }

    public void setEscopeta(Escopeta escopeta) {
        this.escopeta = escopeta;
    }

    @Override
    public String toString() {
        return  super.toString()+"Sargento{" + "escopeta=" + escopeta + '}';
    }
    
   
}
