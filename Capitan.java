package Lab4P2_DessireOchoa_22111211;

public class Capitan extends Soldados {

    private Armas lanzallamas;

    public Capitan(String nombre, int edad, int tiempoEjercito, String rango, int vida) {
        super(nombre, edad, tiempoEjercito, rango, vida);
    }

    public Capitan() {
        super();
    }

    public Armas getLanzallamas() {
        return lanzallamas;
    }

    public void setLanzallamas(Armas lanzallamas) {
        this.lanzallamas = lanzallamas;
    }

    @Override
    public String toString() {
        return  super.toString()+"Capitan{" + "lanzallamas=" + lanzallamas + '}';
    }

}
