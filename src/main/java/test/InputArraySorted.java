package test;

import java.util.ArrayList;

public class InputArraySorted {
	
	/*
    Test Data - > Positive 2,7,11,15
    Negative - > No values are matching with target
    Edge - > 

    PseudoCode :
    1) create for loop with inner for loop function
    2) Starts with zero to n - 2 - > outerloop
    3) Inner loop with i + 1 to length-1
    4) if matches return the index

    Brute force :
    ArrayList<Integer> al = new ArrayList<Integer>();

      for(int i = 0; i < numbers.length - 1; i++){
          for(int j = i + 1; j < numbers.length; j++){
              if(numbers[i] + numbers[j] == target){
                  al.add(i + 1);
                  al.add(j + 1);
              }
          } 
          }
          int[] result = new int[al.size()];
          for(int i = 0; i < al.size(); i++){
              result[i] = (Integer)al.get(i);
      }
    */
  public int[] twoSum(int[] numbers, int target) {
      ArrayList<Integer> al = new ArrayList<Integer>();
      int i = 0, j = numbers.length - 1;
      while(i < j){
         if(numbers[i] + numbers[j] == target) {
             al.add(i + 1);
             al.add(j + 1);
             break;
         }
         else if(numbers[i] + numbers[j] > target){
             j--;
         }
         else if(numbers[i] + numbers[j] < target){
             i++;
         }
      }
      int result[] = new int[al.size()];
      for(int k = 0; k < al.size(); k++){
          result[k] = al.get(k);
      }

      return result;
  }
}

