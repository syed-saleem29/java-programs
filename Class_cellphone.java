
class cell_phone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void Vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Friend...");
    }

}
public class Class_cellphone {
    public static void main(String[] args) {
        cell_phone asus =new cell_phone();
        asus.ring();
        asus.Vibrate();
        asus.callFriend();

    }
}
