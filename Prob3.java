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
class Prob3 {
    

    ListNode addNode(ListNode head,int data){
        ListNode new_node=new ListNode();
        new_node.val=data;
        new_node.next=null;
        ListNode temp=head;
        //ListNode temp1;
        if(temp==null){
            temp=new_node;
            return temp;
        }
        //temp1=new_node;
        new_node.next=head;
        head=new_node;

        
        return head;
    }

    public boolean isPalindrome(ListNode head) {
        
        ListNode temp;
        temp=head;
        ListNode head1=null;
        ListNode h1,h2=head;
        while(temp!=null){
            head1=addNode(head1,temp.val);
            temp=temp.next;
        }
        //h1=reverse_list(head1);
        ListNode temp1=head;
        ListNode temp2=head1;
        int flag=0;
        while(temp1!=null){
            if(temp1.val==temp2.val){
                temp1=temp1.next;
                temp2=temp2.next;
            }else{
                flag=1;
                break;
            }
        }
        if(flag==1){
            return false;
        }else{
            return true;
        }
    }
}