package Chapter_10_Exceptions.BasisStage;

public class ExcClass {
    int a,b;

    public ExcClass(int a, int b) {
        try{
            this.a = a/b;
            this.b = b;
            System.out.println("Success assignments!");

            int c[] = {1,6,4};
            c[43] = 88;
        }catch( ArithmeticException e){
            System.out.println("Division by zero: " + e + "set the default parameter a = 0!");
            this.a = 0;
            System.out.println("Success assignments! a=" + this.a);
        }catch( ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounce: " + e + "!");
        }
    }
}
