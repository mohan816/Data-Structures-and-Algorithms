
public class Arithmetic {
	
	public static int arithmetic(int[] a) {
		if(a.length == 1) {
			if(a[0] == 0)
				return 1;
			else
				return 0;
		}	
		int count = 0;
		int zeroIndex = (int)Math.round((0 + a[1])/2.0);
		int lastIndex = (int)Math.round((a[a.length-2] + 0)/2);
		if(zeroIndex == a[0])
			count++;
		if(lastIndex == a[a.length-1])
			count++;
		for(int i = 1; i < a.length - 1; i++) {
			if((int)Math.round((a[i - 1] + a[i + 1])/2) == a[i])
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(arithmetic(new int[] {1,3,2}));

	}

}
