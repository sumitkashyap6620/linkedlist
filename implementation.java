public class implementation{

    // class node 

    public static class node{
     int data ; 
     node next ;

     //constructor

     node(int data){
        this.data = data ;
     }
    }

    // class linkedlist 

    public static class linkedlist{
        node head = null ;
        node tail = null ;

        // insert at the end of linkedlist 

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

       // insert at begning of linkedlist 

       void insertAtBegning(int val ){
        node temp = new node (val);
       if(head == null){
        head = temp ;
        tail = temp ;
       }
       else{
        temp.next = head ;
        head = temp ;
       }
       }

        // length of linkedlist 
        
       int length(){
        node temp = head ;
        int count = 0 ;
        while(temp != null) {
            count ++ ;
            temp = temp.next ;
        }
        return count ;
       }
      
       // display linkedlist

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
        ll.insertAtBegning(121);
        ll.insertAtBegning(11);
        System.out.println("length :- "+ll.length());
        //ll.insertAt(3,1242);
        ll.display();
    }
}