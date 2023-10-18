package hashmap_assignment;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("milk","25/-");
        map.put("butter", "35/-");
        map.put("egg","40/-");
        map.put("rice", "150/-");
    
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }


        String rate = map.get("butter");
        System.out.println(rate); 

        boolean exists = map.containsKey("egg");
        System.out.println(exists); 

        map.remove("rice");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }
}