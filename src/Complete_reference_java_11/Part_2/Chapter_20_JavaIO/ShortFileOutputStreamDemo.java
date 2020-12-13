package Complete_reference_java_11.Part_2.Chapter_20_JavaIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class ShortFileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        String source = "In to am attended desirous raptures declared diverted confined at. " +
                "Collected instantly remaining up certainly to necessary as" +
                ". Over walk dull into son boy door went new. At or happiness commanded daughters " +
                "as. Is handsome an declared at received in extended vicinity subjects. " +
                "Into miss on he over been late pain an. Only week bore boy what fat c" +
                "ase left use. Match round scale now sex style far times. Your me past an much.";
        byte buf[] = source.getBytes();


        try (FileOutputStream f1 = new FileOutputStream("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_20_JavaIO\\Sfile1.txt");
             FileOutputStream f2 = new FileOutputStream("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_20_JavaIO\\Sfile2.txt");
             FileOutputStream f3 = new FileOutputStream("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_20_JavaIO\\Sfile3.txt");) {

            for (int i = 0; i < buf.length; i += 2) {
                f1.write(buf[i]);
            }
            f2.write(buf);
            f3.write(buf, buf.length - buf.length / 4, buf.length / 4);
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred " + e);

        }
    }
}
