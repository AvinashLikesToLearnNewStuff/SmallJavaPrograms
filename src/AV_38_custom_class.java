

class Employee{
    int id;
    String name ;
    int salary;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }

    public int getSalary(){
        return salary;
    }
}

public class AV_38_custom_class{
    public static void main(String[] args){
        Employee prachi = new Employee(); // instatiating a new employee object
        Employee neerja = new Employee(); // instantiating a new employee object
        //setting properties/attributes
        prachi.id = 12;
        prachi.name = "Prachi chandrakar";
        prachi.salary = 32;
        neerja.id = 13;
        neerja.name = "Neerja Tiwari";
        neerja.salary = 49;

        //Printing the attributes
        prachi.printDetails();

        neerja.printDetails();
        //System.out.println(harrry.id);
        //prachi.name = "prachi chandrakar";    }
        int salary = prachi.getSalary();
        System.out.println("salary of prachi " + salary);
    }

}

