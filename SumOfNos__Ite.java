import java.util.Scanner;

public class SumOfNos__Ite {
    static int sum(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n value: ");
        System.out.println("The sum of n numbers is : "+sum(sc.nextInt()));

    }
}
