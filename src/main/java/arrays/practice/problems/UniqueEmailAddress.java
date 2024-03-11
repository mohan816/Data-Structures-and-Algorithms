package arrays.practice.problems;

import java.util.HashSet;

public class UniqueEmailAddress {
	
	/*
	 * 1) split the string by using @ symbol
	 * 2) take the first array in s
	 * 3) if it contains "+", take the index of it.Using substring remove all the characters from +
	 * 4) If there is a full stop in the string then remove it.
	 * 5) concatenate res + @ + s[1]
	 */
	
	 public static int numUniqueEmails(String[] emails) {
		        HashSet<String> set = new HashSet<String>();
		        for(int i = 0; i < emails.length; i++){
		           String[] s = emails[i].split("@");
		           String res = s[0];
		           if(res.contains("+")){
		             int index = res.indexOf("+");
		             res = res.substring(0,index);
		           }
		           if(res.contains(".")){
		               res = res.replaceAll("\\.",""); 
		           }
		           res = res + "@" + s[1];
		           set.add(res);
		          System.out.println(set);
		           
		        }
		        return set.size();
		        
		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String[] words = {"test1.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
          numUniqueEmails(words);
          }
	}

