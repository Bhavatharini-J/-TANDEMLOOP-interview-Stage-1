import java.util.*;
class operation{
    int a;
    int b;
    String Operation;
    operation(int a, int b, String Operation){
        this.a=a;
        this.b=b;
        this.Operation=Operation;
    }

    void performOperation(){
        switch(Operation){
            case "add":
                System.out.println(a+b);
                break;
            case "subtract":
                System.out.println(a-b);
                break;
            case "multiply":
                System.out.println(a*b);
                break;
            case "divide":
                if(b!=0){
                    System.out.println(a/b);
                }else{
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}

class Problem1{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two integers: ");
      int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter operation (add, subtract, multiply, divide): ");  
        String Operation= sc.nextLine();
        operation op = new operation(a,b,Operation);
        op.performOperation();
    }
}