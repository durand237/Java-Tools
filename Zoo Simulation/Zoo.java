public class Zoo {
    private double essen;
    private double wasser;
    private final int gehegeAnzahl;
    private Tier[] casten;
    public Zoo(int essen, int wasser, int gehegeAnzahl) {
        this.essen = essen;
        this.wasser = wasser;
        this.gehegeAnzahl = gehegeAnzahl;
        casten = new Tier[this.gehegeAnzahl];
    }

    public int getgehegeAnzahl() {
        return gehegeAnzahl;
    }

    public void setessen(double newessen) {
        essen = newessen;
    }

    public double getessen() {
        return essen;
    }
    public void setwasser(double newwasser) {
        wasser = newwasser;
    }
    public double getwasser() {
        return wasser;
    }

    public void neuesTier(Tier tier) {
        for(int i = 0; i < casten.length; i++) {
            if(casten[i] == null) {
                casten[i] = tier;
                return ;
            }
        }
        System.out.println("there is no free place for this animal");
        return ;
    }
    public boolean fuettern(Tier tier) {
        if(tier.essen() < essen ) {
            essen -= tier.essen();
            return true;
        }
        else {
            return false;
        }
    }
    public boolean traenken(Tier tier) {
        if(tier.trinken() < wasser) {
            wasser -= tier.trinken();
            return true;
        }
        else {
            return false;
        }
    }
}
