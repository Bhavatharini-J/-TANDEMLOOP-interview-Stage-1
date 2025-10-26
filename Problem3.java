import java.util.*;
public class Problem3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int even=0;
        if(n%2==0){
            even= n-1;
        }else{
            even=n;
        }

        int m=even*2;
       
        for(int i=1; i<=m-1; i++){
            if(i%2!=0){
                System.out.print(i + ", ");
            }
        }
    }
}