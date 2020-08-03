package Part_2.Chapter_17_JavaLang;

public class ArrayCopy {
    static byte[] a = {65,55,44,66,54,77};
    static byte[] b = {66,75,45,67,74,71};
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder array = new StringBuilder();
        array.append("\na = " + new String(a) +
                   "\nb = " + new String(b));
        System.arraycopy(a,0,b,0,a.length);
        array.append("\na = " + new String(a) +
                "\nb = " + new String(b));
        System.arraycopy(a,0,b,1,a.length-1);
        System.arraycopy(b,1,a,0,b.length-1);
        array.append("\na = " + new String(a) +
                "\nb = " + new String(b));
        array.append("\nTime execution: " + ((System.currentTimeMillis() - startTime)*1e-3) + " sec.\nSystem info: " + System.getProperty("os.name") + ", " +  System.getProperty("os.arch") + ", " +  System.getProperty("user.dir"));
        System.out.println(array);

    }
}
