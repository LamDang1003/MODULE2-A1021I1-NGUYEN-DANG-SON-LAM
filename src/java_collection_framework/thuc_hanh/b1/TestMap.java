package java_collection_framework.thuc_hanh.b1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("lam", 22);
        hashMap.put("thi", 23);
        hashMap.put("tay", 24);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap);

        Map<String, Integer> treeMap = new TreeMap<>();
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("lam", 22);
        linkedHashMap.put("thi", 23);
        linkedHashMap.put("tay", 24);
        System.out.println("\nThe age for " + "lam is " + linkedHashMap.get("lam"));

    }
}
