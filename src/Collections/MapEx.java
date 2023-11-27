package Collections;


	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.Set;

	public class MapEx {

		public static void main(String[] args) {
			Map<String, Integer> oMap1 = new HashMap<String, Integer>();
			oMap1.put("Selenium", 15000);
			oMap1.put("API Automation", 12000);
			oMap1.put("Java", 8000);
			oMap1.put("Manual", 8000);
			oMap1.put("Selenium", 14000);
			oMap1.put("Appium", 12000);
			System.out.println(oMap1);
			System.out.println("Get the value based on Key : "+oMap1.get("Appium"));
			System.out.println("*********KeySet()*********");
			Set<String> keys = oMap1.keySet();
			for (String key : keys) {
				System.out.println(key+"==>"+oMap1.get(key));
			}
			System.out.println("*********EntrySet()*********");
			Set<Entry<String, Integer>> entrySets = oMap1.entrySet();
			for (Entry<String, Integer> entry : entrySets) {
				System.out.println(entry.getKey()+"==>"+entry.getValue());
			}
			System.out.println("***********Iterator************");
			Set<String> keySets = oMap1.keySet();
//Set<String> keySet = oMap1.keySet();
			Iterator<String> it = keySets.iterator();
			while(it.hasNext()) {
				String keyAsString = it.next();
				System.out.println(keyAsString+"==>"+oMap1.get(keyAsString));
			}
			
			System.out.println("**********Complicated Map**********");
			
			List<String> testingCourse = new ArrayList<String>();
			testingCourse.add("Manual Testing");
			testingCourse.add("Selenium Java");
			testingCourse.add("Selenium C#");
			testingCourse.add("API Automation");
			testingCourse.add("Appium");
			testingCourse.add("Jmeter");
			
			List<String> devlopmentCourse = new ArrayList<String>();
			devlopmentCourse.add("Java");
			devlopmentCourse.add("C#");
			devlopmentCourse.add("JS");
			devlopmentCourse.add("Angular");
			devlopmentCourse.add("HTML");
			devlopmentCourse.add("Node JS");
			
			
			Map<String, List<String>> credoCourses = new HashMap<String, List<String>>();
			
			credoCourses.put("Testing", testingCourse);
			credoCourses.put("Devlopment", devlopmentCourse);
			
			System.out.println(credoCourses);
			
			Set<String> courses = credoCourses.keySet();
	
			for (String key : courses) {
				System.out.println(key);
				System.out.println("=========");
				for(int i=0;i<credoCourses.get(key).size();i++) {
					System.out.println(credoCourses.get(key).get(i));
				}
			}

		}

	}

