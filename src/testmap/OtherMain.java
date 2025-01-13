package testmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OtherMain {

	
	 public static void main(String[] args) {
		 
		 
	        // Create a HashMap
	        HashMap<Country, String> map = new HashMap<>();
	        
	        
	        map.put(new Country(2540, "v"),"india");
			map.put(new Country(2541, "b"),"india");
			map.put(new Country(2543, "f"),"india");
			map.put(new Country(2548, "s"),"india");
			map.put(new Country(2545, "c"),"india");
			
			
	        // Ascending order (by keys)
	        List<Map.Entry<Country, String>> entryList = new ArrayList<>(map.entrySet());
	        Collections.sort(entryList, new Comparator<Map.Entry<Country, String>>() {
	            @Override
	            public int compare(Map.Entry<Country, String> e1, Map.Entry<Country, String> e2) {
	                return e1.getKey().compareTo(e2.getKey());
	            }
	        });
	        System.out.println("Ascending order without TreeMap:");
	        for (Map.Entry<Country, String> entry : entryList) {
	        	
	        	
	        	if(entry.getKey().pinCode>2542)
	            System.out.println(entry.getKey() + " -> "+ entry.getValue() );
	        }

	        // Descending order (by keys)
	        Collections.sort(entryList, new Comparator<Map.Entry<Country, String>>() {
	            @Override
	            public int compare(Map.Entry<Country, String> e1, Map.Entry<Country, String> e2) {
	                return e2.getKey().compareTo(e1.getKey());
	            }
	        });
	        System.out.println("\nDescending order without TreeMap:");
	        for (Map.Entry<Country, String> entry : entryList) {
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }
	    }
	}

