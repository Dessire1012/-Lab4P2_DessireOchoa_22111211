
package Lab4P2_DessireOchoa_22111211;


public class InfanteríaLigera extends Soldados{
    
    private ArmaBlanca armablanca;

    public InfanteríaLigera() {
        super();
    }

    public InfanteríaLigera(String nombre, int edad, int tiempoEjercito, String rango, int vida) {
        super(nombre, edad, tiempoEjercito, rango, vida);
    }

    public ArmaBlanca getArmablanca() {
        return armablanca;
    }

    public void setArmablanca(ArmaBlanca armablanca) {
        this.armablanca = armablanca;
    }

    @Override
    public String toString() {
        return  super.toString()+"InfanteraLigera{" + "armablanca=" + armablanca + '}';
    }
    
    @Override
    public double atacar (Soldados s){
        return armablanca.getDaño();
    }
}
