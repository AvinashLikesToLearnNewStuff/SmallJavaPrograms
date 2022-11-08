
public class AV_80_try_catch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try {
            int c = a / b;
        }
        catch (Exception e){
            System.out.println("we faild to run the code because ");
            System.out.println(e);
        }
        System.out.println("end of the program");
    }
}
