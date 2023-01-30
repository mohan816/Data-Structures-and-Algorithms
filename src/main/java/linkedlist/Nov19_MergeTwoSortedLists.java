package linkedlist;

public class Nov19_MergeTwoSortedLists {
	
	/*  https://leetcode.com/problems/merge-two-sorted-lists/
    1) create a header for the result
    2) create temp to move further.
    3) compare list1 data with list2 data, if it is smaller assign it to the temp and increase the list1 pointer if it is greater assign the list2 node to the temp and increase the pointer of second node.
    3) Finally return the header
    */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 != null)
             return list2;
        if(list1 != null && list2 == null)
             return list1;
        ListNode head = null, temp = null;
        while(list1 != null && list2 != null){
            if(head == null){
                if(list1.val < list2.val){
                    head = list1;
                    temp = list1;
                  list1 = list1.next;
                }
                else{
                    head = list2;
                    temp = list2;
                    list2 = list2.next;
                }
            }
            else{
                if(list1.val < list2.val){
                    temp.next = list1;
                     temp = temp.next;
                     list1 = list1.next;
                }
                else{
                    temp.next = list2;
                    temp = temp.next;
                    list2 = list2.next;
                }
            }
        }
        while(list1 != null){
              temp.next = list1;
              temp = temp.next;
              list1 = list1.next;
            }
        while(list2 != null){
            temp.next = list2;
            temp = temp.next;
            list2 = list2.next;
        }
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
		 */

	}

}
