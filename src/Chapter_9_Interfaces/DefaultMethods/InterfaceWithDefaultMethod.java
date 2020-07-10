package Chapter_9_Interfaces.DefaultMethods;

public interface InterfaceWithDefaultMethod {
    int getNumber();
    default String getString(){
        return "The default String object!";
    }
}
