public class Array {
    public static void main(String[] args) {
//        method 1 for creating array
        int [] marks;
        marks =new int [5];
//        method 2 for creating array
        int [] marks2 = new int [10];
//        method 3 for creating array
        int []  marks3 ={1,2,3,4,5};
//        Displaying the Array
        for (int i=0;i<marks3.length;i++){
            System.out.print(marks3[i]);
        }
        System.out.println(" ");
//        enhanced method for displaying Array
        for (int j : marks3) {
            System.out.print(j);
        }



    }
}
