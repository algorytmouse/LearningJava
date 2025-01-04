public class Main {
    public static void main(String[] args) {
        int x = 6;
        int y = 4;

        String ergebnis = (x%y==0) ? "teilbar":"nicht teilbar";

        System.out.println(x + " ist durch " + y + " " + ergebnis);


/*
        if (x%y == 0){
            System.out.println("X ist durch Y teilbar");
        }
        else {
            System.out.println("X ist nicht durch Y teilbar");
        }

 */
    }
}