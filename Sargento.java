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
    
   @Override
    public double atacar (Soldados s){
        
        if (s instanceof InfanteriaPesada){
              return (escopeta.getDaño() * 0.1);
        }else if (s instanceof InfanteríaLigera){
            return (escopeta.getDaño() * 0.15);
        }else 
             return escopeta.getDaño();

    }
}
