package Part_2.Chapter_17_JavaLang;

public class MyMath {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        var Info = new StringBuilder();

        double theta = 120;

        Info.append("\n" + theta + " degrees is " + Math.toRadians(theta) + " radians.");
        theta = 1.312;
        Info.append("\n" + theta + " degrees is " + Math.toDegrees(theta) + " degrees.");


        Info.append("\nTime execution: " + ((System.currentTimeMillis() - startTime)*1e-3) + " sec.\n");
        System.out.println(Info);
    }
}
