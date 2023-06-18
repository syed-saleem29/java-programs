class Employee1 {
    int  salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
public class Class_Employee {
    public static void main(String[] args) {
        Employee1 sal=new Employee1();
        sal.setName("Leyakier");
        System.out.println(sal.getName());
        sal.salary = 99;
        System.out.println(sal.getsalary());
    }
}
