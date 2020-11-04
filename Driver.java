import java.util.*;

public class Driver {

	
	
	public static void main(String args[])
	{
		Set<String> hSet = new HashSet<String>();
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		TreeMap<String, Integer> tMap = new TreeMap<String, Integer>();
		
		hSet.add("Coding");
		hSet.add("Is");
		hSet.add("Fun");
		System.out.println(hSet);
		String check = "Is";
		System.out.println("Contains " + check + " " + hSet.contains(check));
		
		
		
		hMap.put("Coding", 1);
		hMap.put("Is", 2);
		hMap.put("Fun", 3);
		
		tMap.putAll(hMap);
		
		System.out.println("HashMap: " + hMap);
		
		System.out.println("TreeMap" + tMap);
		
		System.out.println("The difference between HashMap and TreeMap is that "
				+ "HashMap does not use ordering on keys or values while TreeMap "
				+ "orderes by key.");
		
		System.out.println("If you have to guarantee the order of Key, Value Pairs "
				+ "you should use TreeMap.");
	}
	
}
