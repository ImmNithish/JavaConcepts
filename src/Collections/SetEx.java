package Collections;


	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.LinkedHashSet;
	import java.util.List;
	import java.util.Set;
	import java.util.TreeSet;

	public class SetEx {

		public static void main(String[] args) {
			Set<String> oSet1 = new HashSet<>();
			oSet1.add("Karthick");
			oSet1.add("Chandra");
			oSet1.add("Reeva");
			oSet1.add("Ramesh");
			oSet1.add("Nithish");
			oSet1.add("Thivya");
			oSet1.add(null);
			oSet1.add("Karthick");
			oSet1.add("Mathan");
			System.out.println(oSet1);
			List<String> oList2 = new ArrayList<String>();
			oList2.add("Mathan");
			oList2.add("Vijay");
			oList2.add("Karthi");
			oList2.add("Gopi");
			oSet1.addAll(oList2);
			System.out.println(oSet1);
			Object[] array = oSet1.toArray();
			System.out.println(array[5]);
			
			System.out.println("********For Each********");
			for (String name : oSet1) {
				System.out.println(name);
			}
			System.out.println("********Iterator********");
		
		Iterator<String> it = oSet1.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("**********Linked Hash Set***********");
			Set<String> oSet2 = new LinkedHashSet<>();
			oSet2.add("Karthick");
			oSet2.add("Chandra");
			oSet2.add("Reeva");
			oSet2.add("Ramesh");
			oSet2.add("Nithish"); 
			oSet2.add("Thivya");
			oSet2.add(null);
			oSet2.add("Karthick");
			oSet2.add("Mathan");
			System.out.println(oSet1);
			System.out.println(oSet2);
			
			System.out.println("**********Tree Set***********");
			Set<String> oSet3 = new TreeSet<>();
			oSet3.add("Karthick");
			oSet3.add("Chandra");
			oSet3.add("Reeva");
			oSet3.add("Ramesh");
			oSet3.add("Nithish");
			oSet3.add("Thivya");
			//oSet3.add(null);
			oSet3.add("Karthick");
			oSet3.add("Mathan");
			System.out.println(oSet1);
			System.out.println(oSet2);
			System.out.println(oSet3);
		}

	}


