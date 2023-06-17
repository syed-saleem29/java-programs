import java.util.Scanner;

public class Pattern_Recursion {
    static void pattern_Rec(int n){
        if(n>0) {
            pattern_Rec(n - 1);
            for (int k = 0; k < n; k++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of lines: ");
        pattern_Rec(sc.nextInt());
    }
}
