package Collections_ExamPrograms;

import java.util.Scanner;
import java.util.Vector;

public class QNo6_InsertElementUsingVector {
	
	public static String QNo6_InsertElementUsingVector(String str, int num, String insertChar, int index ) {

		Vector<String> v = new Vector<String> ();

		v.add(str);

		String[] str1 = str.split("");
		

		for (int i = 0; i < str1.length; i++) {
			v.add(str1[i]);
		}

		v.remove(0);

		for (int i = 1; i <= num; i++) {
			v.insertElementAt(insertChar, index);
		}

		for (int i = 1; i <= num; i++) {
			v.remove(6);
		}

		String result = "";
		for (int i = 0; i < v.size(); i++) {
			result = result + v.get(i);
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = scan.next();

		System.out.println("Enter the number of times you want to insert a character");
		int num = scan.nextInt();

		System.out.println("Enter index position");
		int index = scan.nextInt();

		System.out.println("Enter the charater you want to insert");
		String insertChar = scan.next();

		System.out.println(QNo6_InsertElementUsingVector(str, num, insertChar, index));

	}

}
