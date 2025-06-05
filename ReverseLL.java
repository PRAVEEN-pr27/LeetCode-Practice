class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseSinglyLinkedList {
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next; 
            current.next = prev;          
            prev = current;             
            current = nextNode;         
        }

        return prev; // new head
    }

    // Print function for testing
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print("Original list: ");
        printList(head);

        head = reverseList(head);

        System.out.print("Reversed list: ");
        printList(head);
    }
}
