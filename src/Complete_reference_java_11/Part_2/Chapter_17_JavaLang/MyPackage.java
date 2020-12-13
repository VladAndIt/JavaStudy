package Complete_reference_java_11.Part_2.Chapter_17_JavaLang;

public class MyPackage {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Package pkgs[];
        pkgs = Package.getPackages();

        for (int i = 0; i < pkgs.length; i++) {
            System.out.println(
                    pkgs[i].getName() + " " +
                    pkgs[i].getImplementationTitle() + " " +
                    pkgs[i].getImplementationVendor() + " " +
                    pkgs[i].getImplementationVersion()
            );
        }

        var Info = new StringBuilder();
        Info.append("\nTime execution: " + ((System.currentTimeMillis() - startTime)*1e-3) + " sec.\n");
        System.out.println(Info);
    }
}
