import java.util.*;

class test {
    public static void main(String[] args) {
        test lin = new test();
        lin.addLast(10);
        lin.addLast(12);
        lin.addLast(13);
        lin.addLast(9);
        lin.addLast(8);
        lin.addLast(7);
        lin.addLast(6);
        //lin.remove(6);
        //lin.remove(8);
        
        //lin.remove(6);
        //lin.reverse();
        lin.print();
        lin.reverse();
        lin.print();

    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;

        }
    }

    Node head;

    void addLast(int data) {
        Node toadd = new Node(data);
        if (head == null) {
            head = toadd;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toadd;

    }

    void addFirst(int data) {
        Node toadd = new Node(data);
        if (head == null) {
            head = toadd;
            return;
        }
        Node temp = head;
        head = toadd;
        toadd.next = temp;
    }
    void remove(int key){
        Node temp=head;
        Node prev=null;
        if(temp==null)
          return;

        while(temp != null && temp.data==key ){
            head=temp.next;
            return;
        }
        while(temp != null && temp.data !=key){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        }
    
    void reverse(){
        Node prev=null;
       
        Node current=head;  // a
        
        Node next=head.next; // a ->a.next // b
        while(current != null) // until last node
        {
            next=current.next;  // last node next b ->
            current.next=prev; // prev 
            prev=current;
            current=next;
        }
        head=prev;
        //return head;


    }

    


    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");

            temp = temp.next;
        }

    }

}





// java solution
// Node head; // Please do not remove this
// Node tail;

// // Should insert a node at the beginning
// void insertAtBeginning(int x)
// {
// Node temp = new Node(x);
// if(head==null) {
// head = temp;
// tail = temp;
// }
// else {
// temp.next = head;
// head = temp;
// if(temp.next==null) {
// tail = temp;
// }
// }
// }

// // Should insert a node at the end
// void insertAtEnd(int x) {
// Node temp = new Node(x);
// if(head == null) {
// head = temp;
// tail = head;
// }
// else {
// tail.next = temp;
// tail = temp;
// }
// }