import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.util.stream.IntStream;
public class CodeChef_19_7_23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
     /*  // problem 1
        int n=sc.nextInt();
        if(n>=6&&n<=8){
            System.out.println("Yes");
        }
        else
            System.out.println("no");
        // problem 2
        int x=sc.nextInt(),y= sc.nextInt(),r= sc.nextInt();
        int nos=x+(r/30);
        if(nos%y>0){
            System.out.println((nos/y)+1);
        }
        else System.out.println(nos/y);

      */
        // problem 3
        int n= sc.nextInt();
        int [] swipe=new int[n];
        int [] no=new int[n];
        int count=0;

        int found=0,l=0;
        for (int i=0;i<n;i++){
            swipe[i]= sc.nextInt();
            no[i]=0;
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(swipe[i]==no[j]){
                    found=0;
                    no[j]=0;
                    break;
                }
                else found=1;
            }
            if (found==1){
                no[l]=swipe[i];
                l++;
            }
        }
        for (int i=0;i<n;i++){
            if (no[i]!=0){
                count++;
            }
        }
        System.out.println(count);
    }

}
