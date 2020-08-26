package Metanit.Collections.Chapter_3_OOP;

public class StaticNestedClasses {
    public static void main(String[] args) {
        Mathematics.Factorial fact = Mathematics.getFactorial(6);
        System.out.printf("Factorial %d equals %d \n", fact.getKey(), fact.getResult());
    }
}

class Mathematics {
    public static class Factorial {
        private int result;
        private int key;

        public Factorial(int number, int x) {
            result = number;
            key = x;
        }

        public int getResult() {
            return result;
        }

        public int getKey() {
            return key;
        }


    }

    public static Factorial getFactorial(int x) {
        int result= 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return new Factorial(result, x);
    }
}
