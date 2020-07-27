package Part_1.Chapter_14_Generalization;

public class ВoundedTypeParemeter {
    public static void main(String[] args) {
        Integer inums[] = {1,2,3,4,56,7};
        LimitedTypeParemeterDemo<Integer> iob = new LimitedTypeParemeterDemo<Integer>(inums);
        double v = iob.average();
        System.out.println("Average value is " + v);

        Double dnums[] = {1.2,2.2,9.3,0.4,5.6,7.0};
        LimitedTypeParemeterDemo<Double> dob = new LimitedTypeParemeterDemo<Double >(dnums);
        double vd = dob.average();
        System.out.println("Average value is " + vd);
    }
}
class LimitedTypeParemeterDemo<T extends Number>{
    T[] nums;

    public LimitedTypeParemeterDemo(T[] nums) {
        this.nums = nums;
    }
    double average(){
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum/nums.length;
    }
}