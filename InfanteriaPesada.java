
package Lab4P2_DessireOchoa_22111211;


public  class InfanteriaPesada extends Soldados{
    private Bomba bomba;

    public InfanteriaPesada() {
        super();
    }

    public InfanteriaPesada(String nombre, int edad, int tiempoEjercito, String rango, int vida) {
        super(nombre, edad, tiempoEjercito, rango, vida);
    }

    public Bomba getBomba() {
        return bomba;
    }

    public void setBomba(Bomba bomba) {
        this.bomba = bomba;
    }

    @Override
    public String toString() {
        return  super.toString()+"InfanteriaPesada{" + "bomba=" + bomba + '}';
    }
    
    @Override
    public double atacar (Soldados s){
        if (s instanceof InfanteríaLigera){
              return bomba.getDaño() * 0.1;
        }else
            return bomba.getDaño();
      
    }
    
}
