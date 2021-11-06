package Lab4P2_DessireOchoa_22111211;

public class SuperSoldado extends Soldados {

    private ArmaBlanca armaBlanca;
    private Bomba bomba;
    private Escopeta escopeta;
    private Lanzallamas lanzallamas;

    public SuperSoldado(String nombre, int edad, int tiempoEjercito, String rango, int vida) {
        super(nombre, edad, tiempoEjercito, rango, vida);
    }

    public SuperSoldado() {
        super();
    }

    public ArmaBlanca getArmaBlanca() {
        return armaBlanca;
    }

    public void setArmaBlanca(ArmaBlanca armaBlanca) {
        this.armaBlanca = armaBlanca;
    }

    public Bomba getBomba() {
        return bomba;
    }

    public void setBomba(Bomba bomba) {
        this.bomba = bomba;
    }

    public Escopeta getEscopeta() {
        return escopeta;
    }

    public void setEscopeta(Escopeta escopeta) {
        this.escopeta = escopeta;
    }

    public Lanzallamas getLanzallamas() {
        return lanzallamas;
    }

    public void setLanzallamas(Lanzallamas lanzallamas) {
        this.lanzallamas = lanzallamas;
    }

    @Override
    public String toString() {
        return "SuperSoldado{" + "armaBlanca=" + armaBlanca + ", bomba=" + bomba + ", escopeta=" + escopeta + ", lanzallamas=" + lanzallamas + '}';
    }

    @Override
    public double atacar(Soldados s) {

        if (s instanceof Capitan) {
            return lanzallamas.getDaño() * 0.3;

        } else if (s instanceof Sargento) {
            return escopeta.getDaño() * 0.35;

        } else if (s instanceof InfanteriaPesada) {
            return bomba.getDaño() * 0.4;

        } else 
            return armaBlanca.getDaño() * 0.5;
    }

}
