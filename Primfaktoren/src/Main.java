public class Main {
    public static void main(String[] args) {
        int n = 1259812;
        int t = 2;

        while(n>1){
            if (n%t==0){
                n = n/t;
                System.out.println(t);
            }
            else{
                t++;
            }
        }
    }
}