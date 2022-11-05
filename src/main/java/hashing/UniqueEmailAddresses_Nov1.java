package hashing;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses_Nov1 {
	//https://leetcode.com/problems/unique-email-addresses/
	/*
	 * 1) split the string using @ ,store it String part[]
	 * 2) split the first part[0] by using + and store it in int local[]
	 * 3) replace the local[0] . with "" concatenate @ and concatenate part[1]
	 */
	
	public int numUniqueEmails(String[] emails) {
        Set<String> normalized = new HashSet<String>();
            for (String email : emails) {
            String[] parts = email.split("@");
            String[] local = parts[0].split("\\+");
            normalized.add(local[0].replace(".", "") + "@" + parts[1]);       
        }
        return normalized.size();    
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
