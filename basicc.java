public class basicc{
     public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
     public static ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0 ;
        ListNode temp = head ;
        while(temp != null){
            length++ ;
            temp=temp.next ;
        }
      ListNode temp2 = head ;
        length = length-n+1 ;
        for(int i = 1 ; i < length ; i++)temp2 = temp2.next ;
        temp2.next = temp2.next.next ;
        return head ;

    }
    public static void main(String[] args) {
         ListNode n1 = new ListNode(4);
        // n1.data = 4 ;
        ListNode n2 = new ListNode(3);
        n1.next = n2 ;
        //n2.data = 3 ;
        ListNode n3 = new ListNode(15);
        n2.next = n3 ;
       //n3.data = 15 ;
        ListNode n4 = new ListNode(45);
        n3.next = n4 ;
        //n4.data = 45 ;
        ListNode n5 = new ListNode(1);
        n4.next = n5 ;
        //n5.data = 1 ;
        ListNode temp = n1 ;
      System.out.println(removeNthFromEnd(n1,1));
    }
}