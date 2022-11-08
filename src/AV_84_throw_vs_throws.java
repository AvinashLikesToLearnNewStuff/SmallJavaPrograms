

class NegativeRadiusException extends Exception{
    public String toString(){
        return  "radius cannot be -ve";
    }
    public String getMessage(){
        return "radius cannot be -ve";
    }
}


public class AV_84_throw_vs_throws{
    public static double area(int r) throws NegativeRadiusException{ // we warn the user that this exception is thrown
        if (r<0){
        throw new NegativeRadiusException();//we throw a negative radius exception
        }
        double result = Math.PI *r * r;
        return  result;
    }
    public static int divide(int a, int b)throws ArithmeticException{  // made by firion
        int result = a/b;
        return result;
        }

    public static void main(String[] args) {
    //used by leon
        try{
    int c = divide(6,0);
        System.out.println(c);
    }catch (Exception e){
            System.out.println("Exception found");

        }
//        double ar = area(5);
    }
}
