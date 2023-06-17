import java.util.Scanner;

public class Celcius_Fahrenhiet {
    static float c2f(float c){
        return c*9/5+32;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the temperature in Celcius : ");
        float c= sc.nextFloat();
        System.out.format("%.1f degree Celcius = %.1f Fahrenheit",c,c2f(c));
    }
}
