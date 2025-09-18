public class implementation{
    public static class node{
     int data ; 
     node next ;
     node(int data){
        this.data = data ;
     }
    }
    public static class linkedlist{
        node head = null ;
        node tail = null ;
       void insertAtEnd(int val){
        node temp = new node(val);
        if(head == null){
         head = temp ;
         tail = temp ;
        }
        else{
            tail.next = temp ;
            tail = temp ;
        }
       }

       void display(){
        node temp = head ;
        while(temp != null ){
            System.out.print(temp.data+" ");
            temp = temp.next ;
        }
       }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(5);
        ll.insertAtEnd(4);
        ll.insertAtEnd(51);
        ll.insertAtEnd(511);
        ll.insertAtEnd(51111);
        ll.display();
    }
}