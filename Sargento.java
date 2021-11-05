package Lab4P2_DessireOchoa_22111211;

public class Sargento extends Soldados {

    private Armas escopeta = new Armas();

    public Sargento() {
    }

    public Sargento(String nombre, int edad, int tiempoEjercito, String rango, int vida) {
        super(nombre, edad, tiempoEjercito, rango, vida);
    }

    public Armas getEscopeta() {
        return escopeta;
    }

    public void setEscopeta(Armas escopeta) {
        this.escopeta = escopeta;
    }

    public int getPtsArma() {
        return escopeta.getDaño();
    }

    public void setPtsArma() {
       escopeta.setDaño(140);
    }
    

}
