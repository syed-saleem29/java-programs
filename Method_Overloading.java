public class Method_Overloading {
    static void foo(){
        System.out.println("wish you luck");
    }
    static void foo(int a){
        System.out.println("wish you "+ a + " luck");
    }

    public static void main(String[] args) {
        foo();
        foo(200);
    }
}
