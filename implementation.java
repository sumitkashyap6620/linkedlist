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

       // insert at any position in linked list 

       void insertAt(int idx ,int val){
        if (idx < 0 || idx > length()){
            System.out.println("Wrong index !");
            return ;
        }
        else if(idx == 0 ){
            insertAtBegning(val);
            return ;
        }
        else if(idx == length()){
            insertAtEnd(val);
            return ;
        }
         else{
            node temp = new node (val);
            node t = head ;
            for (int i = 0 ; i < idx-1 ; i++){
                t = t.next ;
            }
            temp.next = t.next ;
            t.next = temp  ;
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

      // get any node in linkedlist 
      
      int getAt(int idx){
        node temp = head ;
       for (int i = 0 ; i < idx ; i++)
        temp = temp.next ;
         return temp.data;  
      }
      
       //  delete any node of linkedlist 

       void deleteAt(int idx ){
         if(idx == 0 ) head = head.next ; 
         else{
            node temp = head ;
            for (int i = 0 ; i < idx-1 ; i++){
                temp = temp.next ;
            }
               temp.next = temp.next.next ;
         }
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
        ll.insertAt(7,1242);
        ll.display();
        System.out.println("\n getting value :- "+ll.getAt(3));
         ll.deleteAt(7);
        ll.display();
    }
}