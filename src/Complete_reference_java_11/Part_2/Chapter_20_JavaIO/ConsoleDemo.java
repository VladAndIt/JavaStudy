package Complete_reference_java_11.Part_2.Chapter_20_JavaIO;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console console;

        console = System.console();
        if (console == null) {
            return;
        }

        str = console.readLine("Read a line of the string");
        console.printf("Here is your string : %s\n",str);
    }
}
