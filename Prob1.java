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
class Prob1 {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp,prev=null,prev1=null;
        int count=0,count1=0;
        temp=head;
        if(head==null)
        return head;
        while(temp!=null){
            count++;
            prev1=temp;
            temp=temp.next;
        }
        if((count==1) || (k==0))
        return head;
        temp=head;
        int k1=k%count;
        if(k1==0)
        return head;
        while(count1<(count-k1)){
            count1++;
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        prev1.next=head;
        head=temp;
        return head;
        
    }
}