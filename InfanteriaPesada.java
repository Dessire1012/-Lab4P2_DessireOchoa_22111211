
package Lab4P2_DessireOchoa_22111211;


public class InfanteriaPesada extends Soldados{
    private Armas bomba = new Armas();

    public InfanteriaPesada() {
        super();
    }

    public InfanteriaPesada(String nombre, int edad, int tiempoEjercito, String rango, int vida) {
        super(nombre, edad, tiempoEjercito, rango, vida);
    }


    public Armas getBomba() {
        return bomba;
    }

    public void setBomba(Armas bomba) {
        this.bomba = bomba;
    }
    
    public int getPtsArma (){
        return bomba.getDaño();
    }
    
    public void setPtsArma (){
        bomba.setDaño(150);
    }

    @Override
    public String toString() {
        return "InfanteriaPesada{" + "bomba=" + bomba + '}';
    }


}
