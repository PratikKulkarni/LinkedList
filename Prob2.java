/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Prob2 {
    public boolean hasCycle(ListNode head) {
        ListNode t1,t2;
        int flag=0;
        if(head==null)
        return false;
        t1=head;
        t2=head;
        if(head.next==null){
            return false;
        }
        else{
            if((t1!=null) && (t2.next!=null)){
                flag=1;
                t1=head.next;
                t2=head.next.next;
            }
            else{
               return false;
            }
           
            while((t1!=t2) && (t1!=null) && (t2!=null) && (t2.next!=null)){
                if(flag==0)
                flag=1;
                t1=t1.next;
                t2=t2.next.next;
            }
            if((t1==t2) && (flag==1))
            return true;
            else{
                return false;
            }
        }
    }
}