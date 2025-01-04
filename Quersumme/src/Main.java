public class Main {
    public static void main(String[] args) {
        int n = 547;
        int sum = 0;

        //System.out.println(n/10); -> integer always rounds down to next ganze Zahl

        while (n>0){
            sum += n%10;
            n = (n-n%10)/10;
        }
        System.out.println(sum);
    }
}