package Lab4P2_DessireOchoa_22111211;

public class SuperSoldado extends Soldados {

    private Armas armaBlanca = new Armas();
    private Armas bomba = new Armas();
    private Armas escopeta = new Armas();
    private Armas lanzallamas = new Armas();

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

    public int getPtsArmaBlanca() {
        return armaBlanca.getDaño();
    }

    public void setPtsArmaBlanca() {
        armaBlanca.setDaño(50);
    }

    public int getPtsBomba() {
        return bomba.getDaño();
    }

    public void setPtsBomba() {
        bomba.setDaño(150);
    }

    public int getPtsEscopeta() {
        return bomba.getDaño();
    }

    public void setPtsEscopeta() {
        bomba.setDaño(140);
    }

    public int getPtsLanzallamas() {
        return lanzallamas.getDaño();
    }

    public void setPtsLanzallamas() {
        lanzallamas.setDaño(110);
    }

}
