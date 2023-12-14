package com.feuji.exception.December5th;

import java.util.HashMap;
import java.util.Map;

public class differentWaysOfHashMapIteration {
void demoOfHashMap()
{
	Map<Integer, String> map=new HashMap<>();
	map.put(1, "Corenuts");
	map.put(2, "technology");
	System.out.println("Iterating using entrySet():");
    iterateUsingEntrySet(map);

} 
private static void iterateUsingEntrySet(Map<Integer, String> map) {
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }
}
public static void main(String[] args) {
	differentWaysOfHashMapIteration mapIteration=new differentWaysOfHashMapIteration();
	mapIteration.demoOfHashMap();
}

}
