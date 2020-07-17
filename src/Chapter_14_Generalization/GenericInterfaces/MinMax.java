package Chapter_14_Generalization.GenericInterfaces;

public interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
