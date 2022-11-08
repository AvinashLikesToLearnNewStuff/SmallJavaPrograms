
class MaxMultiplyInputException extends Exception{
public String toString(){
    return " can't mulitply that high (。>︿<)_θ ";
}

}
class MaxInputException extends Exception{
    public String toString(){
        return " number too big! o((⊙﹏⊙))o. ";
    }

}
class InvalidInputException extends Exception{
    public String toString(){
        return "cannot add 8 and 9 ";
    }

}

class CannotDivideByZeroException extends Exception{
    public String toString(){
        return "cannot divide by 0 ~~>_<~~";
    }

}

class CustomCalculator {
    double add(double a, double b)throws InvalidInputException, MaxInputException{
        if ( a> 1000000 || b > 1000000){
        throw new MaxInputException();
        }
        if(a==8 || b ==9){
            throw new InvalidInputException();
        }
        return a + b;
    }
    double subtract(double a, double b)throws MaxInputException{
        return a - b;
    }
    double multiply(double a, double b)throws MaxMultiplyInputException{
        if (a > 7000 || b > 7000){
            throw new MaxMultiplyInputException();
        }
        return a * b;
    }
    double divide(double a,double b) throws CannotDivideByZeroException, MaxInputException{

        if (b==0){
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}
public class AV_87_excercise_6_in_java {

    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException , MaxInputException, MaxMultiplyInputException{

        CustomCalculator c = new CustomCalculator();
//        c.add(8,9);
//        c.divide(6,0);
//        c.add(10000000, 2);
        c.multiply(70000,70000);
    }
}
