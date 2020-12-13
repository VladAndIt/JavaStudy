package Complete_reference_java_11.Part_1.Chapter_14_Generalization;

public class UsingWildcardArguments {
    public static void main(String[] args) {
        Integer inums[] = {1,2,3,4,5};
        WildCardDemo<Integer> iob = new WildCardDemo<Integer>(inums);
        double v = iob.average();
        System.out.println("iob average is " + v);

        Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
        WildCardDemo<Double> dob = new WildCardDemo<Double>(dnums);
        double v1 = dob.average();
        System.out.println("dob average is " + v1);

        Float fnums[] = {1.0F,2.0F,3.0F,4.0F,5.0F};
        WildCardDemo<Float> fob = new WildCardDemo<Float>(fnums);
        double x = fob.average();
        System.out.println("fob average is " + x);

        System.out.println("Average of iob and dob ");
        if (iob.sameAvg(dob))System.out.println("are the same!");
        else System.out.println("differ!");

        System.out.println("Average of iob and fob ");
        if (iob.sameAvg(fob))System.out.println("are the same!");
        else System.out.println("differ!");
    }
}
class WildCardDemo<T extends Number>{
    T[] nums;

    WildCardDemo(T[] o){
        nums = o;
    }

    double average(){
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    boolean sameAvg(WildCardDemo<?> ob){//<?> is a wildcard argument
        if (average() == ob.average()) return true;
        return false;
    }
}