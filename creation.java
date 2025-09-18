class creation{
   public static class node{
    int data ;
    node next ;
   }
    public static void main(String[] args) {
        // 4 -> 3 -> 15 -> 45 -> 1

        node n1 = new node();
        n1.data = 4 ;
        node n2 = new node();
        n1.next = n2 ;
        n2.data = 3 ;
        node n3 = new node();
        n2.next = n3 ;
        n3.data = 15 ;
        node n4 = new node();
        n3.next = n4 ;
        n4.data = 45 ;
        node n5 = new node();
        n4.next = n5 ;
        n5.data = 1 ;
        node temp = n1 ;
        while(temp.next != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next ;
        }
        System.out.print(temp.data);
    }
}