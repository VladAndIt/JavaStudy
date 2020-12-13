package Heap;

import java.util.Map;

class Environment {
    public static void main(String[] args) {
        Map<String, String> map = System.getenv();
        map.entrySet().forEach(System.out::println);
        System.out.println("----------------------\n" + System.getenv("RegionCode"));
    }

}
