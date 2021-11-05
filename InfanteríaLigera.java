
package Lab4P2_DessireOchoa_22111211;


public class InfanteríaLigera extends Soldados{
    
    private Armas armaBlanca = new Armas();

    public InfanteríaLigera() {
        super();
    }

    public InfanteríaLigera(String nombre, int edad, int tiempoEjercito, String rango, int vida) {
        super(nombre, edad, tiempoEjercito, rango, vida);
    }


    public Armas getArmaBlanca() {
        return armaBlanca;
    }

    public void setArmaBlanca(Armas armaBlanca) {
        this.armaBlanca = armaBlanca;
    }

    @Override
    public String toString() {
        return "InfanteriaPesada{" + "armaBlanca=" + armaBlanca + '}';
    }
    
    public int getPtsArma (){
        return armaBlanca.getDaño();
    }
    
    public void setPtsArma (){
        armaBlanca.setDaño(50);
    }
    
}
