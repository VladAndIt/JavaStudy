package Heap;

import lombok.extern.java.Log;

import java.util.logging.Level;

public class ExceptionExamples {
    public static void main(String[] args) {
        ExcClass1 tryOne = new ExcClass1(9,0);
        ExcClass1 tryTwo = new ExcClass1(9,3);
    }
}

@Log
class ExcClass1 {
    int a, b;

    public ExcClass1(int a, int b) {
        try {
            this.a = a / b;
            this.b = b;
            log.log(Level.INFO,"Success assignments! a = " + a + ", b = " + b);

//            int c[] = {1, 6, 4};
//            c[43] = 88;
        } catch (ArithmeticException e) {
//            System.out.println("Division by zero: " + e + "set the default parameter a = 0!");
            log.log(Level.SEVERE, "Division by zero, set the default parameter a = 0! ", e);
            this.a = 0;
            log.log(Level.INFO,"Success assignments! a=" + this.a);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounce: " + e + "!");
        }
    }
}
