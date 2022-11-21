package linkedlist;

public class Nov19_DeleteDuplicates {
	//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
	
	/*
    1) if the head is null return null
    2) if the next node value is same as current node then take the address of next of second node and assign it to first node next. 
    don't move the next node.Again check whether the next node val is same or not..If it is same again do the above else move the current node pointer to next node.
     
    */
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
              return null;
        ListNode temp = head;
        while(temp.next != null){
            if(temp.next.val == temp.val)
                 temp.next = temp.next.next;
            else
                  temp = temp.next;
            
        }
      return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Input: head = [1,1,2,3,3]
Output: [1,2,3]
		 */

	}

}
