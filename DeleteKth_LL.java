class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteEveryKthNode {

    public static Node deleteEveryKthNode(Node head, int k) {
        if (head == null || k <= 0)
            return head;
        if (k == 1)
            return null; 
        Node current = head;
        int count = 1;

        while (current != null && current.next != null) {
            if ((count + 1) % k == 0) {
                // Delete the k-th node
                current.next = current.next.next;
                count++; 
            } else {
                current = current.next;
                count++;
            }
        }
        return head;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


