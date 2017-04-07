import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The class that use for remove duplicate consecutive items from a list.
 * 
 * @author Triwith Mutitakul
 *
 */
public class Recursion {
	/**
	 * The method that user call for start the operation.
	 * 
	 * @param list
	 *            the list that user input.
	 * @return the list without duplicate consecutive item.
	 */
	public static List unique(List list) {
		return uniqueHelper(0, list);
	}

	/**
	 * The method that use for remove duplicate consecutive item from a list.
	 * 
	 * @param start
	 *            the position of list's element
	 * @param list
	 *            the list that user input.
	 * @return the list without duplicate consecutive item.
	 */
	private static List uniqueHelper(int start, List list) {
		if (start >= list.size() - 1) {
			return list;
		}
		if (list.get(start).equals(list.get(start + 1))) {
			list.remove(start + 1);
			return uniqueHelper(start, list);
		}
		return uniqueHelper(start + 1, list);
	}

	public static void main(String[] args) {
		List<Character> list = new ArrayList<Character>();
		list.add('a');
		list.add('b');
		list.add('b');
		list.add('b');
		list.add('c');
		list.add('b');
		list.add('c');
		list.add('c');
		unique(list);
		System.out.println(Arrays.toString(list.toArray()));
	}

}
