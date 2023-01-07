import java.lang.Math; 

public class Loewe extends Tier {

    public Loewe(String name, double hunger, int groesse, double durst) {
        super(name, hunger, groesse, durst);
    }
    public Loewe(String name, double hunger, double durst) {
        super(name, hunger, durst);
    }
    private String berechneRuf () {
        double random = Math.random();
        if(random > 0.5) {
            return "Groooooooaaaaaaar";
        }
        else {
            return "...";
        }
    }
    public String toString() {
        return berechneRuf();
    }
}
