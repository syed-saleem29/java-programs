public class Avgofsetofnums {
    static void avg(int ...arr){
        float sum=0;
        for (int a: arr) {
             sum+=a;
        }
        sum=sum/arr.length;
        System.out.println(sum);
    }
    public static void main(String[] args) {
     avg(100,99,98,97,96,95,95);
    }
}
