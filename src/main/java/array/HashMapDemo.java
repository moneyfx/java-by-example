package array;


import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void run(String[] args) {
        Map<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("key1", 1);
        hm.put("key2", 2);

        System.out.println(hm);
        System.out.println("size of hm = " + hm.size());

        if (hm.containsKey("key1")) {
            System.out.println("hm has key1 with value = " + hm.get("key1"));
        } else {
            System.out.println("hm does not contain key1");
        }

        if (hm.get("key2") != null) {
            System.out.println("value of key2 is not null and is equal to " + hm.get("key2"));
        }

        if (hm.get("key3") == null) {
            System.out.println("hm does not contain key3");
        }
    }
}
