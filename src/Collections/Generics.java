package Collections;

import java.util.ArrayList;
import java.util.List;
public class Generics {

		public static void main(String[] args) {
			List oList = new ArrayList();
			oList.add(1020);
			oList.add("Mathan");
			oList.add("Credo Systemz");
			oList.add(true);
			oList.add(15000.5);
			Object data = oList.get(1);
			String name = (String)data;
			System.out.println(name.length());
			
			List<String> oName = new ArrayList<String>();
			
		
			oName.add("Karthick");
			oName.add("Ramesh");
			oName.add("Nitish");
			 			String bestStudent = oName.get(2);
			System.out.println(bestStudent);
		}}