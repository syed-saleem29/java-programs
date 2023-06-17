import java.util.Scanner;

public class Pattern_Rev_Recursion {
    static void pattern_rev_Rec(int n){
        if(n==0)
            return;
        for (int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
        pattern_rev_Rec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
        pattern_rev_Rec(sc.nextInt());
    }
}
