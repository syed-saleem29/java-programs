import  java.util.Scanner;
public class Input_Scanner {
    public static void main(String[] args) {
//        s in Scaner is capital
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your Rollno:");
        String s = sc.nextLine();
        System.out.println("Your Roll no is: "+s);
    }
}
