import java.util.Scanner;

public class Pattern {
    static void pattern(int a){
        for (int i=0;i<a;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of lines: ");
        pattern(sc.nextInt());
    }
}
