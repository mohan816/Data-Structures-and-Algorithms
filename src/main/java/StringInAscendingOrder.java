import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class StringInAscendingOrder {
	
	public static String sortString(String s) {
		TreeMap<Integer,String> ts = new TreeMap<Integer,String>();
		String[] split = s.split(" ");
		for(int i = 0; i < split.length; i++) {
			ts.put(split[i].length(), split[i]);	
		}
		StringBuffer sb = new StringBuffer();
		for(Map.Entry<Integer, String> m: ts.entrySet()) {
			sb.append(m.getValue()+" ");
		}
		return sb.toString().trim();
	}

	public static void main(String[] args) {
		System.out.println(sortString("This is to new"));

	}

}
