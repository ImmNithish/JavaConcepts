package Collections;

import java.util.TreeMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TreeMapEX {
	
	public static void main(String[] args) {
		Map<String,Integer> Treemap =new TreeMap<>();
		Treemap.put("apple",120);
		Treemap.put("brinjal",40);
		Treemap.put("orange",80);
		Treemap.put("jasmine",90);
		Treemap.put("zomato",56);
		Treemap.put("pine",50);
		System.out.println(Treemap);
		
		System.out.println("********LAMBDA**************");
		Treemap.forEach((k,v) ->System.out.println("keys = " + k + " value = " + v));
	
		
		
		System.out.println("*********ITERATOR*****************");
		Set<String> ks = Treemap.keySet();
		Iterator<String> it = ks.iterator();
		while(it.hasNext())
		{
		String keynext = it.next();
		System.out.println(keynext + " = " + Treemap.get(keynext));
		
		}

		System.out.println("--------------------------------------");
		 List<String> Netflix=new ArrayList<>();
		 Netflix.add("dark desire");
		 Netflix.add("locky and key"); 
		 Netflix.add("dark"); 
		 Netflix.add("umbrella academy");
		 
		 List<String> Prime=new ArrayList<>();
		 Prime.add("the boys");
		 Prime.add("Family man");
		 Prime.add("Modern love"); 
		 Prime.add("Mirzapur");
		 
		 
		 Map<String, List<String> > tvshows =new HashMap<>();
		 tvshows.put("NetflixShows", Netflix);
		 tvshows.put("PrimeShows", Prime);
		 System.out.println(tvshows);
		 
		 Set<String> keySet = tvshows.keySet();
		 
		 for(String shows:keySet)
			 
		 {
			 System.out.println(shows);
		 }
		 tvshows.forEach((k,v)-> System.out.println("premium= " + k + " shows = " + v ));
		 
		 
		
		
	}}
