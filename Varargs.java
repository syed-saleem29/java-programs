public class Varargs {

    // Normal method for adding

//    static  int sum(int a, int b){
//        return a+b;
//    }
//    static  int sum(int a, int b,int c){
//        return a+b+c;
//    }
//    static  int sum(int a, int b,int c,int d){
//        return a+b+c+d;
//    }
//    static  int sum(int a, int b,int c ,int d,int e){
//        return a+b+c+d+e;
//    }
      //Adding using Varargs
    static int sum(int  ...arr){
        int result=0;
        for (int a: arr ){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 1, 2 is "+ sum(1,2));
        System.out.println("The sum of 1, 2, 3 is "+ sum(1,2,3));
        System.out.println("The sum of 1, 2, 3, 4 is "+ sum(1,2,3,4));
        System.out.println("The sum of 1, 2, 3, 4, 5 is "+ sum(1,2,3,4,5));


    }
}
