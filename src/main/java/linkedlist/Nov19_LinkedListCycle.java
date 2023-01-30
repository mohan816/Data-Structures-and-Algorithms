package linkedlist;

import java.util.HashSet;

public class Nov19_LinkedListCycle {
	//https://leetcode.com/problems/linked-list-cycle
	
	 public boolean hasCycle(ListNode head) {
	        ListNode temp = head;
	        HashSet<ListNode> hs = new HashSet<ListNode>();
	        while(temp != null){
	              if(hs.contains(temp.next))
	                  return true;
	              hs.add(temp.next);
	              temp = temp.next;
	        }
	        return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
		 */

	}

}
