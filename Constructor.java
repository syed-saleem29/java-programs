class Employe0{
    private int id;
    private String name;
    private int salary;
    public Employe0(){id=45;name="Leyakier";salary=15000;}
    public Employe0(int a,String s){id=a;name=s;}
    public Employe0(int a,String s,int sal){id=a;name=s;salary=sal;}
    public void setId(int n){ id=n;}
    public int getId(){return  id;}
    public void setName(String s){name=s;}
    public String getName(){return name;}
    public void setSalary(int n){ salary=n;}
    public int getSalary(){return  salary;}

}
public class Constructor {
    public static void main(String[] args) {
        //Default Constructor
        System.out.println("Default Constructor");
        Employe0 ob=new Employe0();
        System.out.println("Id: "+ob.getId());
        System.out.println("Name: "+ob.getName());
        System.out.println("Salary: "+ob.getSalary()+"\n");

        //Parameterized Constructor
        System.out.println("Parameterized Constructor");
        Employe0 obj=new Employe0(96,"Jonny",35000);
        System.out.println("Id: "+obj.getId());
        System.out.println("Name: "+obj.getName());
        System.out.println("Salary: "+obj.getSalary());

    }
}
