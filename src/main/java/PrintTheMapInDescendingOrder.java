import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class PrintTheMapInDescendingOrder {
	
	public static void printInDescendingOrder() {
		TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
		tm.put("Zebra",3);
		tm.put("zebra", 5);
		tm.put("apple", 10);
		tm.put("xavier", 27);
		tm.remove("Zebra");
		Map<String, Integer> descendingMap = ((TreeMap<String,Integer>) tm).descendingMap();
		for(Map.Entry<String, Integer> hs : descendingMap.entrySet()) {
			System.out.println(hs.getKey()+" "+hs.getValue());
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         printInDescendingOrder();
	}

}
