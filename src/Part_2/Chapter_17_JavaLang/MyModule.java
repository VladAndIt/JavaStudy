package Part_2.Chapter_17_JavaLang;

public class MyModule {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Module myMod = MyModule.class.getModule();
        System.out.println("Module is " + myMod.getName());

        System.out.println("Package ");
        for (String pkg:myMod.getPackages()) {
            System.out.println(pkg + " ");
        }

        var Info = new StringBuilder();
        Info.append("\nTime execution: " + ((System.currentTimeMillis() - startTime)*1e-3) + " sec.\n");
        System.out.println(Info);
    }
}
