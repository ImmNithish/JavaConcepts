 package Collections;



	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.List;

	public class ListEx {

		public static void main(String[] args) {
			List<String> oList1 = new ArrayList<String>();
			oList1.add("Karthick");
			oList1.add("Chandra");
			oList1.add("Reeva");
			oList1.add("Ramesh");
			oList1.add("Nithish");
			oList1.add("Thivya");
			oList1.add("Karthick");
			oList1.add("Mathan");
			System.out.println(oList1);
			oList1.add(2, "Divata"); // Inserting new element based on index
			System.out.println(oList1);
			List<String> oList2 = new ArrayList<String>();
			oList2.add("Mathan");
			oList2.add("Vijay");
			oList2.add("Karthi");
			oList2.add("Gopi");
			oList1.addAll(4, oList2);// Inserting new collection based on index
			System.out.println(oList1);
			System.out.println("To retrive value from a list : "+oList1.get(3));
			System.out.println("To check the value existing in list : "+oList1.contains("ramesh"));
			System.out.println("To check the 1 collection values are presence in another collection : "+oList1.containsAll(oList2));
			System.out.println("Index Of method : "+oList1.indexOf("Karthick"));
			System.out.println("Last Index of method : "+oList1.lastIndexOf("Karthick"));
			System.out.println("Size of a collecions is : "+oList1.size());
			oList1.remove("Mathan");
			System.out.println(oList1);
			System.out.println("Size of a collecions is : "+oList1.size());
			oList1.set(2, "divata");
			System.out.println(oList1);
			Object[] name = oList1.toArray();
			System.out.println(name[1]);
			System.out.println("***********For Loop**********");
			for(int i=0;i<oList1.size();i++) {
				System.out.println(oList1.get(i)+" : "+oList1.get(i).length());
			}
			System.out.println("**************For Each************");
			for (String studName : oList1) {
				System.out.println(studName+" : "+studName.toUpperCase());
			}
			System.out.println("********While Loop*******");
			int i=0;
			while(i<oList1.size()) {
				System.out.println(oList1.get(i)+" : "+oList1.get(i).length());
				i++;
			}
			System.out.println("**********Iterator**********");
			Iterator<String> it = oList1.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("*********Linked List********");
			List<String> oList3 = new LinkedList<>();
			oList3.add("Karthick");
			oList3.add("Chandra");
			oList3.add("Reeva");
			oList3.add("Ramesh");
			oList3.add("Nithish");
			oList3.add("Thivya");
			oList3.add("Karthick");
			oList3.add("Mathan");
			System.out.println(oList3);
		}

	}


