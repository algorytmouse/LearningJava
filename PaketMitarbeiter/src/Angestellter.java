public class Angestellter extends Mitarbeiter{
    private static final int MAX_STUFE = 5;
    private int stufe;

    public Angestellter(String nachname, String vorname, Double gehalt){
        super(nachname,vorname,gehalt);
    }

    public void befoerdere(){
        stufe += 1;
    }

    public void zeigeDaten(){
        System.out.println("Mitarbeiter");
        super.zeigeDaten();
        System.out.println("Stufe: " + stufe + "\n");
    }

    @Override
    public void addZulage(double betrag){
        if (stufe>1){
            gehalt += betrag;
        }
    }
}
