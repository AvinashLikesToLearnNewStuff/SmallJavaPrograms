class myMainEmployee{
    private int id;
    private String name;

    private int salary;

    public myMainEmployee(String myName){
        id = 45;
        name = myName;
        salary = 100000000;
    }
    public String getName() {return name;}
    public void setName(String n){ this.name =n; }
    public void setId(int i){ this.id = i; }

    public int getSalary() {
        return salary;
    }

    public int getId(){ return id; }
}

public class AV_42_constructors {
    public static void main(String[] args) {
        myMainEmployee Prantik = new myMainEmployee("Prantik from Bhilai");
//        Prantik.setName("Working at Amazon");
//        Prantik.getName();
        System.out.println(Prantik.getId());
        System.out.println(Prantik.getName());
        System.out.println(Prantik.getSalary());

    }


}
