package Lab4P2_DessireOchoa_22111211;

public class SuperSoldado extends Soldados {

    private Armas armaBlanca;
    private Armas bomba;
    private Armas escopeta;
    private Armas lanzallamas;

    public SuperSoldado(String nombre, int edad, int tiempoEjercito, String rango, int vida) {
        super(nombre, edad, tiempoEjercito, rango, vida);
    }

    public SuperSoldado() {
        super();
    }

    public Armas getArmaBlanca() {
        return armaBlanca;
    }

    public void setArmaBlanca(Armas armaBlanca) {
        this.armaBlanca = armaBlanca;
    }

    public Armas getBomba() {
        return bomba;
    }

    public void setBomba(Armas bomba) {
        this.bomba = bomba;
    }

    public Armas getEscopeta() {
        return escopeta;
    }

    public void setEscopeta(Armas escopeta) {
        this.escopeta = escopeta;
    }

    public Armas getLanzallamas() {
        return lanzallamas;
    }

    public void setLanzallamas(Armas lanzallamas) {
        this.lanzallamas = lanzallamas;
    }

    @Override
    public String toString() {
        return  super.toString()+"SuperSoldado{" + "armaBlanca=" + armaBlanca + ", bomba=" + bomba + ", escopeta=" + escopeta + ", lanzallamas=" + lanzallamas + '}';
    }

    private int atacar (Soldados soldado){
        return 0;
    }
    
   
}
