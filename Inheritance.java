class Base{
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("i am setting x now");
        this.x = x;
    }
}
class Derived extends Base{
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
       //using base class
        Base b=new Base();
        b.setX(4);
        System.out.println(b.getX());
        // using derived class
        Derived d=new Derived();
        d.setX(5);
        System.out.println(d.getX());
        d.setY(69);
        System.out.println(d.getY());
    }
}
