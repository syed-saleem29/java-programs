import java.util.Scanner;
public class methods {
//    static int add(int a , int b){

    int add(int a , int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Give two numbers to add:");
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b =sc.nextInt();
        methods ob=new methods();

//        System.out.println("Sum is "+add(a,b));
        System.out.println("Sum is "+ob.add(a,b));

    }
}
