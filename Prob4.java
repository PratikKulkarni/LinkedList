/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Prob4 {
    public ListNode deleteDuplicates(ListNode head) {
    ListNode temp1;
		ListNode temp2;
		temp1=head;
		temp2=head;
		int count;
		ListNode prev=null;
        if(head==null)
        return head;
		while(temp1!=null) {
			temp2=head;
			prev=head;
			count=0;
			while(temp2!=null) {
				if(temp1.val==temp2.val) {
					count++;
					if(count>1) {
						prev.next=temp2.next;						                    								count=1;
					}else{
						prev=temp2;
					}
					
					temp2=temp2.next;
				}
				else {
					prev=temp2;
					temp2=temp2.next;
				}
			}
			temp1=temp1.next;
		}
		return head;
	}
    
}