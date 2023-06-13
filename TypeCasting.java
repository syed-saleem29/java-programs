public class TypeCasting {
    public static void main(String[] args){
//        for type casting
//        1.both types should be compatible
//        2.destination type should be greater than the source type
        float f=65;
//        in above line java performed automatic type conversion
        int q=(int)73.65;
//        float > int
//        automatic type promotion
        int a=257;
        byte b= (byte)a; // 257 % 256 =1
       // System.out.println(b);
        byte l=40;
        byte m=50;
        byte n=100;
        int d = (l+m)/n;  // while executing this expression byte is converted into int type
        //System.out.println(d);
        byte k=50;
        //k=k*2;  // we cant execute this command bcz as we know
                // while executing java converts expression into int
                //and int cant be stored in byte,so we need to do type cinversion

        //java runs unique code value,so we can use any language like japanese,chinese,hindi.
        System.out.println("こんにちは");

    }
}
