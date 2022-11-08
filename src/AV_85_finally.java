public class AV_85_finally {
    public static int greet(){

        try{
            int a = 5;
            int b =10;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("cleaning up resources....this is the end of the function ");
        }
        return 0;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        int a = 7;
        int b = 9;
        while (true){
            try {
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }finally {
                System.out.println("im finally for value of b = "+ b);
                b--;
            }
        }
    }
}
