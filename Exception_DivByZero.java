package exception_divbyzero;
class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String message){
        super(message);
    }

}
public class Exception_DivByZero {
    public static void main(String[] args) {
        int numerator=10;
        int denominator=0;
        try {
            if(denominator==0){
                throw new DivisionByZeroException("division by zero is not allowed");
            }
            int remainder=10%0;
            System.out.println("result of modulus:"+remainder);
            int result=numerator/denominator;
            System.out.println("result of division:"+result);
        }
        catch(DivisionByZeroException e){
            System.out.println("Error:"+e.getMessage());
        } finally{
            System.out.println("Finally block executed");
        }
    }
    
}
