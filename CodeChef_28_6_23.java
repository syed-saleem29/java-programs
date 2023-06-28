import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.IntStream;

public class CodeChef_28_6_23 {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
         /*problem 1
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(Math.abs((a*b)-(a+b)));

        // problem 2
        int t=sc.nextInt();
        while(t!=0){

            int n=sc.nextInt();
            int x=sc.nextInt();
            int k=sc.nextInt();
            int p=sc.nextInt();
            if(n==k){
                p=p+(x*10)+((k-x)*5)+20;
                System.out.println(p);
            }
            else if(k<=x){
                p=p+(k*10);
                System.out.println(p);
            }
            else{
                p=p+(x*10)+((k-x)*5);
                System.out.println(p);
            }

            t--;
        }


        problem 3
        int t = sc.nextInt();
        while (t != 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            boolean flag=false;
            int[] a=new int[n];
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for (int i=0;i<n;i++){
                if ((a[i]+(k-1))<=m)
                    flag=true;
                else {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("Yes");
            else System.out.println("No");

            t--;
        }

          */
//        int t=sc.nextInt();
//        while(t!=0){
//            int n=sc.nextInt();
//            int m =sc.nextInt();
//            int [] s = IntStream.range(1, n+1).toArray();
//            int [] q=new int[m];
//            for(int i=0;i<m;i++){
//                q[i]=sc.nextInt();
//            }
//            for (int arr:s) {
//                for (int i=0) {
//                    if (arr==)
//                }
//            }
//            t--;
//        }


                int t = sc.nextInt();
                while(t-- > 0) {
                    int n = sc.nextInt();
                    int m = sc.nextInt();
                    long[] q = new long[m];
                    long cost1 = 0;
                    for(int i=0;i<m;i++) {
                        q[i] = sc.nextInt();
                        cost1 += q[i];
                    }
                    long cost2 = (n * ( n+1l )) / 2l;
                    System.out.println(cost2-cost1);
                }
            }
        }



