public class Main {
    public static void main(String[] args) {
        System.out.println(fakultaet(4));

    }

    public static int fakultaet (int n){
        if (n==1){
            return 1;
        }
        if (n==0){
            return 0;
        }

        return n*fakultaet(n-1);
    }
}