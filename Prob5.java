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
class Prob5 {
    public int getDecimalValue(ListNode head) {
        int sum=0;
        if(head==null){
            return 0;
        }
        if(head.next==null){
            return head.val;
        }
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int val1=(int)(Math.pow(2,count-1));
        while(temp!=null){
            if(temp.val==1){
                sum+=val1;
                
            }
            
            val1/=2;
            temp=temp.next;
        }
        return sum;
    }
}