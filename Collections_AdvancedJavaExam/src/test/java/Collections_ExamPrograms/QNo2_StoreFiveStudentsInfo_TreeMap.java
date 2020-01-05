package Collections_ExamPrograms;

import java.util.*;

public class QNo2_StoreFiveStudentsInfo_TreeMap {

	public static void main(String[] args) {
		/* Declare TreeMap */
	      TreeMap<Integer, String> tmap = 
	             new TreeMap<Integer, String>();

	      /*Adding students info to TreeMap*/
	      tmap.put(110, "Sara");
	      tmap.put(134, "Jack");
	      tmap.put(341, "Adam");
	      tmap.put(435, "Carla");
	      tmap.put(101, "Laila");

	      /* Display content using Iterator*/
	      Set set = tmap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }

	   }
	}