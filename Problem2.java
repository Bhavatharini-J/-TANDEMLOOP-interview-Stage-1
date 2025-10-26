import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = n * 2;
        for (int i = 1; i <= max; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
                if (i + 2 <= max) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println(); 
    }
}
