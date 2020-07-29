package Part_2.Chapter_18_JavaLang;
import java.io.IOException;
import java.lang.*;

public class MyCharacter {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();;

        int rang = Integer.parseInt("10FFFF",16);
        String r = "fsf";
        char buf[]={'y','t','2'};
        //for (int i = 0; i < rang; i++) {
            //char e = (char) i;
            System.out.println(Character.codePointAt(buf,0));
            //if (i%100==0)System.out.println();

        //}
        char rf = 'g', er = 53;
        var e = Runtime.getRuntime();
        var v = Runtime.version();
        Process p = null;
        
        System.out.println("Value " + rang/2);
        System.out.println("Value " + Character.isDigit(49) + " ");

        var Info = new StringBuilder();

        try {
            //e.exec("\\C:\\Users\\Public\\Desktop\\Skype.lnk");
            p = e.exec("notepad");
            //p = e.exec("cmd /k C:\\Users\\Public\\Desktop\\Skype.lnk");
            p.waitFor();

        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Notepad returned " + p.exitValue());

        Info.append("Run time: "   + e.availableProcessors() +
                "\nFree memory: "  + e.freeMemory() +
                "\nTotal memory: " + e.totalMemory() +

                "\nFeature ver: "  + v.feature() +
                "\nInterim ver: " + v.interim()+
                "\nUpdate ver: "  + v.update() +
                "\nPatch ver: " + v.patch()) ;
                Info.append("\nTime execution: " + ((System.currentTimeMillis() - startTime)*1e-3) + "\nSystem info: " + System.getProperty("os.name") + ", " +  System.getProperty("os.arch"));
        System.out.println(Info);

    }
}
