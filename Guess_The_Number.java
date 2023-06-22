import java.util.Scanner;
import java.util.Random;
class game{
    private int r,tguesses=0;
    int user;
    game(){
        Random rand =new Random();
        r = rand.nextInt(100);
        System.out.println(r);
    }
    int getrandom(){
       return r;
    }
    void setTguesses(){
        tguesses++;
    }
    int getTguesses(){
        return tguesses;
    }
    void takeuserinput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Guess the number:");
        user=sc.nextInt();
    }
}
public class Guess_The_Number{
    public static void main(String[] args) {
        game g =new game();
        while(true){
            g.takeuserinput();
            if (g.getrandom()==g.user) {
                System.out.println("You Guessed The Number " + g.getrandom());
                g.setTguesses();
                System.out.println("No of Total Guesses =" + g.getTguesses());
                break;
            }
            else if (g.getrandom()>g.user) {
                System.out.println("Give Greater input ");
                g.setTguesses();
            }
            else {
                System.out.println("Enter Lesser input ");
                g.setTguesses();
        }

        }
    }
}
