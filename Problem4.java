import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the length of an array: ");
       int n = sc.nextInt();
       int [] arr = new int[n];
       int count=0;
         for(int i=0; i<n; i++){
              arr[i]= sc.nextInt();
         }
         System.out.print("{");
            for (int i=1;i<=9; i++){
                for(int j=0; j<n; j++){
                     if(arr[j]%i==0){
                         count++;
                    }
                    }
                    System.out.print(i+":"+count+", ");
                    count=0;
                }
                System.out.print("}");
                
            }


    }
