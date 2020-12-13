package Complete_reference_java_11.Part_1.Chapter_9_Interfaces.DefaultMethods;

public interface InterfaceWithDefaultMethod {
    int getNumber();
    default String getString(){
        return "The default String object!";
    }
}
