import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.IntStream;
public class CodeChef_5_7_23 {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        //problem 1
//        int n=sc.nextInt();
//        System.out.println(n*4);
//        int t=sc.nextInt();
        //problem 2
//        int apoint,bpoint;
//        while(t!=0)
//        {
//            int [] alice=new int[3];
//            int [] bob =new int[3];
//            for (int i=0;i<3 ;i++ )
//                alice[i]=sc.nextInt();
//
//            for (int i=0;i<3 ;i++ )
//             bob[i]=sc.nextInt();
//
//            Arrays.sort(bob);
//            Arrays.sort(alice);
//            apoint=alice[1]+alice[2];
//            bpoint=bob[1]+bob[2];
//            if(apoint>bpoint)
//                System.out.println("Alice");
//
//            else if(apoint<bpoint)
//                System.out.println("Bob");
//
//            else
//                System.out.println("Tie");
//
//            t--;
//        }
//        problem 3
      //  int n= Integer.parseInt(sc.nextLine());
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        String t=sc.nextLine();
        String u=sc.nextLine();
        int c;
        for (int i=0;i<n;i++) {
            int r = t.charAt(i) - s.charAt(i);
            if((u.charAt(i)+r)>122){

                r=(u.charAt(i)+r)-122;
                c='a'+(r-1);
                if(c<97){
                    c=97-c;
                    c='z'-(c-1);
                }
                System.out.print((char) c);
            }
            else {
                c=(u.charAt(i)+r);
                if(c<97){
                    c=97-c;
                    c='z'-(c-1);
                }
                System.out.print((char)c);}
        }






    }
}
