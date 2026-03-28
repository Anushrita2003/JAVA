class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val=val;
    }
}

class doubleLinkedList{
    Node head;
    Node tail;
    int size;
    void insertAtHead(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;
    }

    void insertAtTail(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
    }

        void deleteAtHead(){
        
       if(size==0){
            System.out.println("No nodes to delete.");
            return;
        }
        if(size==1) head=tail=null;
        else{
            head=head.next;
            head.prev=null;
        }
        size--;
    }

     void deleteAtTail(){
        
        if(size==0){
            System.out.println("No nodes to delete.");
            return;
        }
        if(size==1) head=tail=null;
        else{
            tail=tail.prev;
            tail.next=null;
        }
        size--;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
        System.out.println();
    }

    void displayReverse(){
        Node temp=tail;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.prev;
        }
        System.out.println();
    }
    void insertAtIdx(int idx, int val){

        if(idx<0 ||idx>size){
        
                System.out.println("Invalid Index");
                return;
            }
        
        if(idx==0)
            {
                insertAtHead(val);
                return;
            }

               if(idx==size)
            {
                insertAtTail(val);
                return;
            }
        int i=1;
        Node temp=new Node(val);
        Node t=head;
        
        if(head==null){
            head=tail=temp;
            return;
        }
        while(i<idx){
            t=t.next;
            i++;
        }
            temp.next=t.next;
            temp.prev=t;
            t.next=temp;
            temp.next.prev=temp;
            size++;
            return;
    }
}



public class double_LL {
    public static void main(String args[]){
        doubleLinkedList cLL=new doubleLinkedList();
        cLL.insertAtHead(20);
        cLL.insertAtHead(70);
        cLL.insertAtHead(100);
        cLL.insertAtHead(120);
        cLL.insertAtHead(220);
        cLL.insertAtTail(320);
        cLL.deleteAtHead();
        cLL.insertAtIdx(3, 80);
        cLL.display();
    }
}
