package Part_2.Chapter_17_JavaLang;

class MyProcessBuilder {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        try {
            ProcessBuilder proc = new ProcessBuilder("notepad.exe", "testfile");
            proc.start();
            System.err.println("Norm!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        var Info = new StringBuilder();
        Info.append("\nTime execution: " + ((System.currentTimeMillis() - startTime)*1e-3) + " sec.\nSystem info: " + System.getProperty("os.name") + ", " +  System.getProperty("os.arch"));
        System.out.println(Info);
        System.out.println(1<<8);
    }
}
