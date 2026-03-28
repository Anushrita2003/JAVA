import java.util.HashMap;

class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}

class Solution {

    // Step 1: Create deep copy (only next pointers)
    public Node deepCopy(Node head1) {
        Node temp1 = head1;

        Node head2 = new Node(-1); // dummy node
        Node temp2 = head2;

        while (temp1 != null) {
            Node t = new Node(temp1.data);
            temp2.next = t;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }

        return head2.next;
    }

    // Step 2: Clone full list (next + random)
    public Node cloneLinkedList(Node a) {

        // deep copy
        Node b = deepCopy(a);

        HashMap<Node, Node> map = new HashMap<>();

        Node tempA = a;
        Node tempB = b;

        map.put(null, null);

        // Step 3: map original -> copy
        while (tempA != null) {
            map.put(tempA, tempB);
            tempA = tempA.next;
            tempB = tempB.next;
        }

        // Step 4: assign random pointers
        tempA = a;

        while (tempA != null) {
            tempB = map.get(tempA);
            tempB.random = map.get(tempA.random);
            tempA = tempA.next;
        }

        return b;
    }
}

public class copy_list_with_RandomPointer {

    // Helper to print list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            int randomData = (temp.random != null) ? temp.random.data : -1;
            System.out.println("Node: " + temp.data + " | Random: " + randomData);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        // Create original list: 1 -> 2 -> 3
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        // Random pointers
        n1.random = n3; // 1 → 3
        n2.random = n1; // 2 → 1
        n3.random = n2; // 3 → 2

        System.out.println("Original List:");
        printList(n1);

        Solution sol = new Solution();
        Node cloned = sol.cloneLinkedList(n1);

        System.out.println("\nCloned List:");
        printList(cloned);
    }
}