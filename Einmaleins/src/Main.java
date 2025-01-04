public class Main {
    public static void main(String[] args) {
        int p = 10;
        int q = 20;

        if (p < q) {
            int h = p;
            p = q;
            q = h;
        }

        int r;
        while (q != 0) {
            r = p % q;
            p = q;
            q = r;
        }

        System.out.println(p);
    }
}