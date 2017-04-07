import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion {
	public static List unique(List list){
		return uniqueHelper(0, list);
	}
	private static List uniqueHelper(int start,List list){
		if(start>=list.size()-1){
			return list;
		}
		if(list.get(start).equals(list.get(start+1))){
			list.remove(start+1);
			return uniqueHelper(start, list);
		}
		return uniqueHelper(start+1, list);
	}
	public static void main(String[] args) {
		List<Character> list =new ArrayList<Character>();
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
