import java.util.Scanner;

public class fobonacci_series {
    static int fibonacci(int n){
        // for Series
//        if(n==1)
//            System.out.println(0);
//        else if (n==2)
//            System.out.println(1);
//        else {
//            System.out.print(0+","+1);
//            int sum,a=0,b=1;
//            for (int i=0;i<n-2;i++){
//                sum=a+b;
//                System.out.print(","+sum);
//                a=b;
//                b=sum;
//            }
//        }
        // For nth term
        if (n==1 || n==2)
            return n-1;
        else{
            return fibonacci(n-1 )+fibonacci( n-2);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int sum=fibonacci(sc.nextInt());
        System.out.println(sum);

    }
}
