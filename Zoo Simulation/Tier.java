public abstract class Tier {
    public String name;
    public double hunger;
    public double durst;
    public int groesse;
    public Tier(String name, double hunger, int groesse, double durst) {
        this.name = name;
        this.hunger = hunger;
        this.groesse = groesse;
        this.durst = hunger;
    }
    public Tier(String name, double hunger, double durst) {
        this(name, hunger, 1, durst);
    }
    public double trinken() {
        return durst*groesse ;
    }
    public double essen() {
        return hunger*groesse;
    }
    public String toString() {
        return "Trö";
    }
    public String getName() {
        return name;
    }
    
}
