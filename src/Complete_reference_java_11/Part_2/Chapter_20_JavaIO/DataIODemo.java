package Complete_reference_java_11.Part_2.Chapter_20_JavaIO;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_20_JavaIO\\Sfile1.txt"))) {
            dout.writeDouble(98.4);
            dout.writeInt(2000);
            dout.writeBoolean(true);

        } catch (FileNotFoundException e) {
            System.out.println("Cannot Open Output File");
            return;
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }

        try (DataInputStream input = new DataInputStream(new FileInputStream("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_20_JavaIO\\Sfile1.txt"))) {
            double d = input.readDouble();
            int i = input.readInt();
            boolean b = input.readBoolean();
            System.out.println("Here are the values: " + d + " " + i + " " + b);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot Open Output File");
            return;
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
