package HashMapTesting;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void MappingHash(){
        Map<String, Integer> map=  new HashMap<>();
        map.put("John",20);
        map.put("Jane",30);
        map.put("Jeff",40);
        for (String i : map.keySet()){
            System.out.println(i+  " " + map.get(i) );

    }
        if(map.containsKey("John")){
            System.out.println("TRUE");
        }
        System.out.println(map.getOrDefault("Jeff", 0));
}

    public static void main(String[] args) {
        MappingHash();
    }
}
