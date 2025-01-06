public class Sparbuch {
    private final long kontonnummer;
    private double kapital;
    private final double zinssatz;

    public Sparbuch(long kontonnummer, double kapital, double zinssatz){
        this.kontonnummer = kontonnummer;
        this.kapital = kapital;
        this.zinssatz = zinssatz;
    }

    public void zahleEin(double betrag){
        this.kapital += betrag;
    }

    public void hebeAb(double betrag){
        this.kapital -= betrag;
    }

    public double getErtrag(int laufzeit){
        double p = (1+this.zinssatz);
        double q = 1;

        for (int i = 0; i < laufzeit; i++) {
            q *= p;
        }

        return this.kapital * q;
    }

    public void verzinse(){
        this.kapital += this.kapital * this.zinssatz;
    }

    public long getKontonnummer(){
        return this.kontonnummer;
    }

    public double getKapital(){
        return this.kapital;
    }

    public double getZinssatz(){
        return this.zinssatz;
    }

    public static void main(String[] args){
        Sparbuch s = new Sparbuch(237567120,100,0.07);
        s.hebeAb(5);
        s.zahleEin(1500);
        System.out.println(s.getKapital());
    }

}
