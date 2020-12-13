package Complete_reference_java_11.Part_1.Chapter_9_Interfaces.DefaultMethods;

public class ClassImpOverwriteDefault implements InterfaceWithDefaultMethod{
    @Override
    public int getNumber() {
        return 200;
    }

    @Override
    public String getString() {
        return "Overwrite the default method!";
    }
}
