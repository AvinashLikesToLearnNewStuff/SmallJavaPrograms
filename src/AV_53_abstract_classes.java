abstract class parent2 {
    public parent2(){
        System.out.println("i am a constructor of base 2");
    }
    public void sayHello(){
        System.out.println("print hello ");
    }
    abstract public void greet();// i made a greet method but everyone can implement it in different ways, so i will say
    //that whoever wants and however they want it, they can implement this method by making an abstract class
}
class child2 extends parent2{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
}
abstract class child3 extends parent2{
    abstract public void th();
}

public class AV_53_abstract_classes {
    public static void main(String[] args) {
        child2 c = new child2();//we can make an object of child class which is concrete
//        parent2 p = new parent2() ; //we cannot make an object of an abstract class
        };
    }
