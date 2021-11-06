package Lab4P2_DessireOchoa_22111211;

public class Capitan extends Soldados {

    private Lanzallamas lanzallamas;

    public Capitan(String nombre, int edad, int tiempoEjercito, String rango, int vida) {
        super(nombre, edad, tiempoEjercito, rango, vida);
    }

    public Capitan() {
        super();
    }

    public Lanzallamas getLanzallamas() {
        return lanzallamas;
    }

    public void setLanzallamas(Lanzallamas lanzallamas) {
        this.lanzallamas = lanzallamas;
    }

    @Override
    public String toString() {
        return "Capitan{" + "lanzallamas=" + lanzallamas + '}';
    }
    
    @Override
    public double atacar (Soldados s){
        
        if (s instanceof Sargento){
              return (lanzallamas.getDaño() * 0.15);
        }else if (s instanceof InfanteriaPesada){
            return (lanzallamas.getDaño() * 0.2);
        }else if (s instanceof InfanteríaLigera){
            return (lanzallamas.getDaño() * 0.25);
        }else
            return lanzallamas.getDaño();
             
    }
    
}
