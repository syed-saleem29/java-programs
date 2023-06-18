 class Employee{
  int id;
  int salary;
  String name;
  public int getsalary(){
      return salary;
  }
  public void display(){
      System.out.println("My Id is = "+id);
      System.out.println("My name is = "+name);
  }
}
public class Custom_Class{
    public static void main(String[] args) {
        Employee sal=new Employee();
        Employee leyak=new Employee();
        sal.id=119;
        sal.name="saleem";
        sal.salary=35;

        leyak.id=873;
        leyak.name="Genshin Impact";
        leyak.salary=25;

        System.out.println("Id:"+sal.id);
        System.out.println("Name:"+sal.name);

        sal.display();
        leyak.display();
        int salary=leyak.getsalary();
        System.out.println(salary);
    }
}
