import java.util.Scanner;
public class SumOfN_Recursion {
    static int sumofn(int n){
        if (n==0)
            return 0;
        else if (n==1) {
            return 1;
        } else
            return n+sumofn(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        System.out.format("Sum of First %d Natural Numbers is : %d",n,sumofn(n));
    }
}
