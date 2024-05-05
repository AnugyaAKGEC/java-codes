
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode head1= new ListNode(0);
       ListNode  t1=head1;
        ListNode head2= new ListNode(-1);
         ListNode t2=head2;
        ListNode temp= head;
        while(temp!=null){
            if(temp.val%2==0){
                ListNode a = new ListNode(temp.val);
                t1.next=a;
                t1=a;
                temp=temp.next;
            }
            else{
                ListNode a = new ListNode(temp.val);
                t2.next=a;
                t2=a;
                temp=temp.next; 
            }
        }
        t2.next=head1.next;
        return head2.next;
    }
}