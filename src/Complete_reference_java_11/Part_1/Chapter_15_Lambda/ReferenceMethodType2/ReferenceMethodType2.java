package Complete_reference_java_11.Part_1.Chapter_15_Lambda.ReferenceMethodType2;

public class ReferenceMethodType2 {
    public static void main(String[] args) {
        int count;
        HighTemp[] weekDayHighs = {
                new HighTemp(89), new HighTemp(82),
                new HighTemp(89), new HighTemp(82),
                new HighTemp(89), new HighTemp(82),
                new HighTemp(89), new HighTemp(82),
                new HighTemp(89), new HighTemp(82),
        };

        count = InstanceMethodWithObjectRefDemo.counter(weekDayHighs, HighTemp::sameTemp,new HighTemp(89));
        System.out.println(count + "days had a high of 12");

        HighTemp[] weekDayHighs2 = {
                new HighTemp(45), new HighTemp(22),
                new HighTemp(23), new HighTemp(23),
                new HighTemp(2), new HighTemp(3),
                new HighTemp(4), new HighTemp(8),
                new HighTemp(9), new HighTemp(2),
        };
        count = InstanceMethodWithObjectRefDemo.counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));

        System.out.println(count + "days had a high of less 89");

        count = InstanceMethodWithObjectRefDemo.counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(89));

        System.out.println(count + "days had a high of less 19");
    }
}

interface MyFunc<T> {
    boolean func(T v1,T v2);
}

class HighTemp {
    private int hTemp;

    public HighTemp(int hTemp) {
        this.hTemp = hTemp;
    }

    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTemp(HighTemp ht2) {
        return hTemp<ht2.hTemp;
    }
}

class InstanceMethodWithObjectRefDemo {
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i],v)) count++;
        }
        return count;
    }

}