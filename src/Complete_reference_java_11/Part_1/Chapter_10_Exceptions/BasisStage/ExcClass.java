package Complete_reference_java_11.Part_1.Chapter_10_Exceptions.BasisStage;

import lombok.Getter;
import lombok.extern.java.Log;

import java.util.logging.Level;

@Log
class ExcClass {
    public static void main(String[] args) {
        ExcClass1 tryOne = new ExcClass1(9, 0);
        try {
            tryOne.throwExceptionRun(27);
            log.info("Excellent!");
        } catch (CustomExceptionHandler e) {
            log.info("Custom exception: " + e.getMessage() + "\n" + e.getNum() + "\n" + e.getName());
        }
    }
}

@Log
class ExcClass1 {
    private int a, b;

    public ExcClass1(int a, int b) {
        try {
            this.a = a / b;
            this.b = b;
            log.log(Level.INFO, "Success assignments! a = " + a + ", b = " + b);

        } catch (ArithmeticException e) {
//            System.out.println("Division by zero: " + e + "set the default parameter a = 0!");
            log.log(Level.SEVERE, "Division by zero, set the default parameter a = 0! ", e);
            this.a = 0;
            log.log(Level.INFO, "Success assignments! a=" + this.a);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounce: " + e + "!");
        }
    }

    public void throwExceptionRun(int i) throws CustomExceptionHandler{
        int c[] = {1, 6, 4};
        if (i > c.length)throw new CustomExceptionHandler("fsfd", i, "grg");
        c[i] = 88;

    }
}
@Getter
class CustomExceptionHandler extends Exception {
    private int num;
    private String name;

    public CustomExceptionHandler(String message, int num, String name) {
        super(message);
        this.num = num;
        this.name = name;
    }
}