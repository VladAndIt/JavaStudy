package Part_1.Chapter_14_Generalization.GenericInterfaces;

public class GenericInterfaces {
    public static void main(String[] args) {
        Integer inums[] = {3,4,5,3,1};
        Character chs[] = {'d','y','r','r','q'};

        GenInterfaceDemo<Integer> iob = new GenInterfaceDemo<Integer>(inums);
        GenInterfaceDemo<Character> cob = new GenInterfaceDemo<Character>(chs);

        System.out.println("Max in inums is: " + iob.max());
        System.out.println("Min in inums is: " + iob.min());

        System.out.println("Max in chs is: " + cob.max());
        System.out.println("Min in chs is: " + cob.min());

    }
}
class GenInterfaceDemo <T extends Comparable<T>> implements MinMax<T>{
    T[] vals;

    public GenInterfaceDemo(T[] vals) {
        this.vals = vals;
    }

    @Override
    public T min() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v)<0) v = vals[i];
        }
        return v;
    }

    @Override
    public T max() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v)>0) v = vals[i];
        }
        return v;
    }
}
class GenInterfaceDemo2 implements MinMax<Integer>{
    @Override
    public Integer min() {
        return null;
    }

    @Override
    public Integer max() {
        return null;
    }
}
