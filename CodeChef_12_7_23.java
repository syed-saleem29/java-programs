import java.util.*;
import java.lang.*;
import java.io.*;
public class CodeChef_12_7_23 {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        /* Problem 1
        int a=sc.nextInt();
		int b=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();


		int messi=(a*2)+b;
		int ronaldo=(x*2)+y;
		if(messi>ronaldo)
		System.out.println("Messi");
		else if(messi==ronaldo)
		System.out.println("Equal");
		else
		System.out.println("Ronaldo");

        //problem 2
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();

        if(((y*z)%x)==0)
            System.out.println(y*z+" "+x);
        else if(((x*z)%y)==0)
            System.out.println(x*z +" "+ y);
        else if(((x*y)%z)==0)
            System.out.println(x*y+" "+z);
        else
            System.out.println(-1);
        */
        // problem 3
        int n=sc.nextInt();
        int [] arr=new int[n];
        int [] dep=new int[n];
        int high=0,test,j,i,score=0;
        for (i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for (i=0;i<n;i++)
            dep[i]=sc.nextInt();

        for (i=0;i<n;i++){
            test =dep[i];
            for (j=i;j<n;j++){
                if (test==dep[j]){
                   score++;
                }
            }
            for (j=0;j<n;j++){
                if (test==arr[j]){
                    score++;
                }
            }
            if (score>high) {
                high = score;
            }
            score = 0;
        }
        System.out.println(high);
    }
}
