package week1.Assignments;

public class StringOddIndex {

	public static void main(String[] args) {
		String str = "Kameshwari";
		System.out.println("Length of string" + " " + str.length());
		char[] x = str.toCharArray();
		for (int i = 0; i <= x.length - 1; i++) {
			if (i % 2 != 0) {
				x[i] = Character.toUpperCase(x[i]);
			}

		}
		System.out.println(String.valueOf(x));
	}

}
