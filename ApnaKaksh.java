class linkedlist{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

void addNodeLast(int data){
    Node temp=head;
    Node newN=new Node(data);
    if(head==null){
        head=newN;
        return;
    }
    while(temp.next!=null){
        temp=temp.next;
    }
        temp.next=newN;
}

void DelNodeLast() {

    // Empty list
    if (head == null) {
        return;
    }

    if (head.next == null) {
        head = null;
        return;
    }

    Node temp = head;

    while (temp.next.next != null) {
        temp = temp.next;
    }

    // Delete last node
    temp.next = null;
}

        void display(){
        Node temp=head;
        while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
        }
        System.out.println();
    }

    void search(int n){
        Node temp=head;
        int size=0;
        while(temp!=null){
            if(temp.data==n){
                System.out.println(size);
            }
                temp=temp.next;
                size=size+1;
        }
    }


// int search(int val){
//     Node temp=head;
//     int idx=0;
//     while(temp!=null){
//         if(temp.data==val){
//             return idx;
//         }
//         temp=temp.next;
//         idx=idx+1;
//     }
//     return idx;
// }
}

public class ApnaKaksh {
    public static void main(String[] args) {
       linkedlist l=new linkedlist();
       l.addNodeLast(1);
       l.addNodeLast(5);
       l.addNodeLast(7);
       l.addNodeLast(3);
       l.addNodeLast(8);
       l.addNodeLast(2);
       l.addNodeLast(3);
       l.display();
       l.DelNodeLast();
       l.DelNodeLast();
       l.display();
       l.search(5);
       l.DelNodeLast();
       l.display();
       l.search(8);

   
}
}
