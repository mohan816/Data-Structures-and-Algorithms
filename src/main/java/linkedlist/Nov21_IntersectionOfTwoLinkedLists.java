package linkedlist;

import java.util.HashSet;

public class Nov21_IntersectionOfTwoLinkedLists {
	
	/*  https://leetcode.com/problems/intersection-of-two-linked-lists/description/
    1) Create hash set and add all the reference of head A
    2) Iterate the second head and check whether set contains any of the reference,
    if it contains then return its reference
    3) Else return Null at the end of the method.
    */
    //Time Complexity O(n + m) space Complexity - > O(n)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       
       HashSet<ListNode> hs = new HashSet<ListNode>();
       while(headA != null){
           hs.add(headA);
           headA= headA.next;
       }
       while(headB != null){
           if(hs.contains(headB))
               return headB;
            headB = headB.next;
       }
       return null;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
