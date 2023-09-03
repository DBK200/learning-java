package com.sessions.session14.challenge;

import java.util.*;

public class MapChallenges {
    
}

/*
    Challenges - HashMap
    1. Write a Java program to associate the specified value with the specified key in a HashMap.
    2. Write a Java program to count the number of key-value (size) mappings in a map.
    3. Write a Java program to copy all the mappings from the specified map to another map.
    4. Write a Java program to remove all the mappings from a map.
    5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
    6. Write a Java program to get a shallow copy of a HashMap instance.
    7. Write a Java program to test if a map contains a mapping for the specified key.
    8. Write a Java program to test if a map contains a mapping for the specified value.
    9. Write a Java program to create a set view of the mappings contained in a map.
    10. Write a Java program to get the value of a specified key in a map.
    11. Write a Java program to get a set view of the keys contained in this map.
    12. Write a Java program to get a collection view of the values contained in this map.
*/
class HashMaps {
    public static void main(String[] args) {
        // Challenge 1
        HashMap<String,Integer> hmMap1 = new HashMap(Map.of("a",0,"b",1, "c", 1));
        System.out.println("[hmMap1] values: " + hmMap1);
        hmMap1.put("b", 10);
        System.out.println("[hmMap1] values after modification: " + hmMap1);

        // Challenge 2
        System.out.println("[hmMap1] size: " + hmMap1.size());

        // Challenge 3 and 6
        HashMap<String,Integer> hmMap2 = (HashMap) hmMap1.clone(); //new HashMap(hmMap1);
        System.out.println("[hmMap2] values: " + hmMap2);

        // Challenge 4
        hmMap2.clear();
        System.out.println("[hmMap2] values after erasing: " + hmMap2);

        // Challenge 5
        System.out.println("[hmMap2] is empty returned: " + hmMap2.isEmpty());
        // Or if a key is empty
        for (Map.Entry<String,Integer> element: hmMap1.entrySet()) {
            if (element.getKey().isEmpty()) {
                System.out.println("Found an empty element!");
                break;
            }
        }

        // Challenge 7 and 8
        System.out.println("[hmMap1] contains mapping for [key = \"c\"] returned: "
                + hmMap1.containsKey("c")
                + "\n[hmMap1] contains mapping for [value = 1] returned: "
                + hmMap1.containsValue(1));

        // Challenge 9
        int i = 0;
        System.out.print("[hmMap1]: ");
        for (Map.Entry<String,Integer> element: hmMap1.entrySet()) {
            System.out.print((i++ == 0 ? "" : ", ") + element);
        }

        // Challenge 10
        String sKey = "b";
        System.out.printf("%nThe value of [key = \"%s\"] is: %d%n", sKey, hmMap1.get(sKey));

        // Challenge 10
        System.out.println("[hmMap1] has the following mapping keys: " + hmMap1.keySet());

        // Challenge 11
        System.out.println("[hmMap1] has the following values mapped: " + hmMap1.values());
    }
}

/*
    Challenges - TreeMap
    1. Write a Java program to associate the specified value with the specified key in a Tree Map.
    2.  Write a Java program to copy a Tree Map content to another Tree Map.
    3.  Write a Java program to search a key in a Tree Map.
    4.  Write a Java program to search a value in a Tree Map.
    5.  Write a Java program to get all keys from the given a Tree Map.
    6.  Write a Java program to delete all elements from a given Tree Map.
    7.  Write a Java program to sort keys in Tree Map by using comparator.
    8.  Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
    9.  Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
    10.  Write a Java program to get a reverse order view of the keys contained in a given map.
    11.  Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
    12.  Write a Java program to get the greatest key less than or equal to the given key.
    13.  Write a Java program to get the portion of a map whose keys are strictly less than a given key.
    14.  Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
    15.  Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
    16.  Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.
    17.  Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.
*/

class TreeMaps {
    public static void main(String[] args) {
        // Challenge 1
        TreeMap<Integer, String> tmMap1 = new TreeMap<>(Map.of(1,"a",3,"c",2,"b"));
        System.out.println("[tmMap1] values: " + tmMap1);
        tmMap1.put(3,"ccc");
        System.out.println("[tmMap1] values after modification: " + tmMap1);

        // Challenge 2
        TreeMap<Integer, String> tmMap2 = new TreeMap<>(tmMap1);
//        TreeMap<Integer, String> tmMap2 = new TreeMap<>();
//        tmMap2.putAll(tmMap1);

        System.out.println("[tmMap2] values: " + tmMap2);

        // Challenge 3
        Integer lookupKeyValue = 5;
        System.out.printf("The search for [key = %d] returned: %b%n",
                lookupKeyValue, tmMap1.containsKey(lookupKeyValue));
        // Or by custom find method
        System.out.printf("The search for [key = %d] with custom method returned: %b%n",
                lookupKeyValue, findKey(lookupKeyValue, tmMap1));

        // Challenge 4
        String lookupValue = "ccc";
        System.out.printf("The search for [value = %s] returned: %b%n",
                lookupValue, tmMap1.containsValue(lookupValue));
        // Or by custom find method
        System.out.printf("The search for [key = %s] with custom method returned: %b%n",
                lookupValue, findValue(lookupValue, tmMap1));

        // Challenge 5
        System.out.println("[tmMap1] has the following mapping keys: " + tmMap1.keySet());

        // Challenge 6
        tmMap2.clear();

        // Challenge 7
        System.out.println("[tmMap1] values: " + tmMap1);
        tmMap2 = new TreeMap<>(Comparator.reverseOrder());
        tmMap2.putAll(tmMap1);
        System.out.println("[tmMap2] values after sorting [tmMap1] in descendant order: " + tmMap2);

        // Or custom sorted by:
        //   1: values|asc
        //   2: keys|desc
        HashMap<Integer, String> hmMap3 = new HashMap<>(tmMap1);
        hmMap3.put(0, "b");
        List alList = new ArrayList<>(hmMap3.entrySet());
        Collections.sort(alList, new Compare());
        System.out.println("[tmMap3] values after custom sorting: " + alList);

        // Challenge 8, 9
        getMapLimits(tmMap1);
        getMapLimits(tmMap2);
        // Checks if getMapLimits() works in case of tmMap2
        // that is sorted in descending order
//        System.out.println("Entry with lowest key value: "
//                + tmMap2.firstEntry()
//                + "\nEntry with highest key value: "
//                + tmMap2.lastEntry());

        // Challenge 10
        System.out.println("[tmMap1] values after reversing: " + reverseTreeMap(tmMap1));

        // Challenge 11
        Integer key = 2;
        System.out.printf("The entry that has the greatest key less than or equal to [key = %d] is: %s%n",
                key, tmMap1.ceilingEntry(key));

        // Challenge 12
        key = 3;
        System.out.printf("The greatest key less than or equal to [key = %d] is: %d%n",
                key, tmMap1.ceilingKey(key));

        // Challenge 13
        System.out.printf("The keys less than [key = %d] are: %s%n",
                key, tmMap1.headMap(key));

        // Challenge 14
        System.out.printf("The keys less than or equal to [key = %d] are: %s%n",
                key, tmMap1.headMap(key, true));

        // Challenge 15
        key = 2;
        System.out.printf("The least key greater than [key = %d] is: %s%n",
                key,
                (tmMap1.tailMap(key, false).isEmpty()) ? null : tmMap1.tailMap(key, false).firstEntry());

        // Challenge 16
        key = 3;
        System.out.printf("The entry that has a key less than [key = %d] is: %s%n",
                key,
                (tmMap1.headMap(key).isEmpty()) ? null : tmMap1.headMap(key, false).lastEntry());


        // Challenge 17
        key = 1;
        System.out.printf("The greatest key less than [key = %d] is: %s%n",
                key,
                (tmMap1.headMap(key, false).isEmpty()) ? null : tmMap1.headMap(key, false).lastEntry());


    }

    private static <K,V> boolean findKey(K lookup, Map<K,V> map) {
        for (K key: map.keySet()) {
            if (key.equals(lookup)) return true;
        }
        return false;
    }

    private static <K,V> boolean findValue(V lookup, Map<K,V> map) {
        for (V value: map.values()) {
            if (value.equals(lookup)) return true;
        }
        return false;
    }

    private static <K,V> void getMapLimits(TreeMap<K,V> treeMap) {
        boolean bAscending = true;
        Map.Entry<K,V> first = treeMap.firstEntry();
        Map.Entry<K,V> last = treeMap.lastEntry();

        if (first.getKey() instanceof String)
            bAscending = ((String) first.getKey())
                    .compareTo((String) last.getKey()) < 0;
        if (first.getKey() instanceof Number)
            bAscending = ((Number) first.getKey()).doubleValue() -
                    ((Number) last.getKey()).doubleValue() < 0.0;

        System.out.println("Entry with lowest key value: "
                + ((bAscending)? first : last)
                + "\nEntry with highest key value: "
                + ((bAscending) ? last : first));
    }

    private static <K,V> TreeMap<K,V> reverseTreeMap(TreeMap<K,V> map) {
        Comparator<? super K> comparator = new Comparator<K>() {
            @Override
            public int compare(K o1, K o2) {
                double dResult = 0.0;
                if (o1 instanceof String)
                    dResult = ((String) o1).compareTo((String) o1);
                if (o1 instanceof Number)
                    dResult = ((Number) o1).doubleValue() - ((Number) o2).doubleValue();
                // Gets the opposite sorting if [map] is natural sorted
                if (map.comparator() == null) dResult *= -1;
                return ((int) dResult);
            }
        };

        TreeMap<K,V> tmResult = new TreeMap<>(comparator);
        tmResult.putAll(map);
        return tmResult;
    }
}

class Compare implements Comparator<Map.Entry<Integer, String>> {
    @Override
    public int compare(Map.Entry<Integer, String> meFirst,
                       Map.Entry<Integer, String> meSecond) {

        // 1st level comparison by Value, in ascending order
        int iValuesCompare = meFirst.getValue()
                .compareTo(meSecond.getValue());

        // Key comparison in descending order.
        // This will be used for 2nd level comparison,
        // when Values are equal.
        int iKeysCompare;
        Integer firstKey = meFirst.getKey();
        Integer secondKey = meSecond.getKey();
        if ( firstKey - secondKey == 0.0 ) iKeysCompare = 0;
        else if ( firstKey - secondKey < 0 ) iKeysCompare = 1;
        else iKeysCompare = -1;

        // Final comparison
        return (iValuesCompare == 0) ? iKeysCompare : iValuesCompare;
    }

}