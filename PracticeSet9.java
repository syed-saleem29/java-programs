class cylinder{
    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    private int radius;
    private int height;
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double SurfaceArea(){
        return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
    }
    public double Volume(){
        return 3.141*radius*radius*height;
    }
}
class rectangle{
    private int length;
    private int breadth;
    public rectangle() {
        this.length = 4;
        this.breadth = 5;
    }
    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
class sphere{
    private int radius;

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double SurfaceArea(){
        return 4*Math.PI*radius*radius;
    }
    public double Volume(){
        return 1.333*Math.PI*radius*radius*radius;
    }
}

public class PracticeSet9 {
    public static void main(String[] args) {
        /*
        // problem 1
        cylinder mycylinder =new cylinder();
        mycylinder.setHeight(12);

        int h=mycylinder.getHeight();
        System.out.println(h);
        mycylinder.setRadius(9);
        System.out.println(mycylinder.getRadius());
        //problem 2
        System.out.println(mycylinder.SurfaceArea());
        System.out.println(mycylinder.Volume());

        // problem 3
        cylinder c=new cylinder(9,12);
        //problem 4
        rectangle rc=new rectangle(3,4);
        System.out.println(rc.getLength());
        System.out.println(rc.getBreadth());
        */

        //problem 5
        sphere s=new sphere();
        s.setRadius(5);
        System.out.println(s.getRadius());



    }

}
