class sqr{
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4* side;
    }

}
public class Class_Square {
    public static void main(String[] args) {


        sqr s = new sqr();
        s.side=3;
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}