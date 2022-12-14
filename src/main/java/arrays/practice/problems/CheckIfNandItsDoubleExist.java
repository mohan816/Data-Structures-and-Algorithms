package arrays.practice.problems;

public class CheckIfNandItsDoubleExist {
	
	//Positive - > int[] arr = {10,2,5,3};
	//Negative - > int[] arr = {10,10,10,10}
	//Edge - > array with length 0
	
	 /*constraints i and both indices are not same
    then start i = 0 and j = i + 1
    first take arr[i] == 2 * arr[j] - > if matches true
    else take arr[j] == 2 * arr[i] - > if matches true
    */
	//Time Complexity  - > O(n^2) space - > O(1)
    public static boolean checkIfExist(int[] arr) {
    	if(arr.length == 0) {
    		return false;
    	}
      for(int i = 0; i < arr.length - 1; i++){
          for(int j = i + 1; j < arr.length; j++){
              if(arr[i] == 2 * arr[j]){
                  return true;
              }
              else if(arr[j] == 2 * arr[i]){
                  return true;
              }
              }
          }
           return false;
      }
    
    public static boolean checkIfExistTwoPointer(int[] arr) {
    	int i = 0, j = 1;
    	while(i < j) {
    		if(arr[i] == 2 * arr[j]){
                return true;
            }
    		else if(arr[j] == 2 * arr[i]){
                return true;
            }
    		else {
    			j++;
    		}
    	}
    	return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,2,5,3};
		System.out.println(checkIfExistTwoPointer(arr));

	}

}
