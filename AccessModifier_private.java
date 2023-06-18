class Employee0{
    private int id;
    private String name;
    public void setId(int n){
        id=n;
    }
    public void setName(String s){
        name=s;
    }
    public int getId(){
        return  id;
    }
    public String getName(){
        return name;
    }
}
public class AccessModifier_private {
    public static void main(String[] args) {
        Employee0 e =new Employee0();
        e.setId(69);
        e.setName("Leyakier");
        System.out.println(e.getId());
        System.out.println(e.getName());

    }
}
