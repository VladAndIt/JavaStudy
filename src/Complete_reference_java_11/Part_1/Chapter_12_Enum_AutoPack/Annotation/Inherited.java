package Complete_reference_java_11.Part_1.Chapter_12_Enum_AutoPack.Annotation;
//@SuppressWarnings("")

public class Inherited extends Parent {
    int gg;
    String name;
    @Override
    public void method(){
        System.out.println("Child");
        //this.method1();
    }
    @Annotation1(name = "teper", gg = 44)
    public void method3(int i){
        System.out.println(name + " " + gg);
    }
}
