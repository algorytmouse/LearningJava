public class Main {
    public static void main(String[] args) {
        int h = 8;
        char block = '*';

        for (int i = 1; i<h+1; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(block);
            }
            System.out.println();
        }
    }
}