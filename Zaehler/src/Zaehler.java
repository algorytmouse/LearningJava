public class Zaehler {
    private int wert;

    public int getWert(){
        return this.wert;
    }

    public void hochzaehlen(){
        this.wert +=1;
    }

    public void zuruecksetzen(){
        this.wert = 0;
    }

    public static void main(String[] args) {
        Zaehler z = new Zaehler();
        System.out.println(z.getWert());
        z.hochzaehlen();
        z.hochzaehlen();
        System.out.println(z.getWert());
        z.zuruecksetzen();
        System.out.println(z.getWert());
    }
}
