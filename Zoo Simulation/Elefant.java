public class Elefant extends Tier {
    public Elefant(String name, double hunger, int groesse, double durst) {
        super(name, hunger, groesse, durst);
    }
    public Elefant(String name, double hunger, double durst) {
        super(name, hunger, durst);
    }
    public String toString() {
        if(groesse >= 2) {
            return "Trö Töröö";
        }
        else {
            return "Trö";
        }
    }
    
}
