package Part_1.Chapter_14_Generalization;

public class GenericMethod {
    static <T extends Comparable<T>,V extends T> boolean isIN(T x,V[] y){
        for (int i = 0; i < y.length; i++) {
            if(x.equals(y[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer nums[] = {1,2,3,4,5};

        if(isIN(2,nums))System.out.println("2 is in nums!");

        if(!isIN(7,nums))System.out.println("7 isn't in nums!");

        String str[] = {"One","Two","Three"};
        if (isIN("One",str))System.out.println("One is in str");

        if (!isIN("Five",str))System.out.println("Five isn't in str");

        // Oops! Won't compile! Types must be compatible.
        // if(isIn("two", nums))
        // System.out.println("two is in strs");
    }

}