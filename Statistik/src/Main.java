public class Main {
    public static void main(String[] args) {
        int[] x = new int[] {7,3,4,6};
        int min = x[0];
        int max = x[0];
        int sum = x[0];

        for (int i = 1; i<x.length; i++){
            if (x[i]<min){
                min = x[i];
            }
            if (x[i]>max){
                max = x[i];
            }
            sum += x[i];
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Mittelwert: " + (double) sum/x.length);
    }
}