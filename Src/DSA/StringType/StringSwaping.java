package Src.DSA.StringType;

import java.list
public class StringSwaping {
	public static void main(String[] argv)
		throws Exception
	{

		try {

			// creating object of List<String>
			List<String> vector = new ArrayList<String>();

			// populate the vector
			vector.add("A");
			vector.add("B");
			vector.add("C");
			vector.add("D");
			vector.add("E");

			// printing the vector before swap
			System.out.println("Before swap: " + vector);

			// swap the elements
			System.out.println("\nSwapping 0th and 4th element.");
			Collections.swap(vector, 0, 4);

			// printing the vector after swap
			System.out.println("\nAfter swap: " + vector);
		}

		catch (IndexOutOfBoundsException e) {
			System.out.println("\nException thrown : " + e);
		}
	}
}

