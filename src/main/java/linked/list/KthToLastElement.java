package linked.list;


public class KthToLastElement {

    public static void run() {
        Node test = new Node(1);
        test.next = new Node(2);
        test.next.next = new Node(3);
        test.next.next.next = new Node(4);
        test.next.next.next.next = new Node(5);

        Node kthNode = getKthElementFromLast(test, 2);
        if (kthNode != null) {
            System.out.println(kthNode.data);
        }

    }

    public static Node getKthElementFromLast(Node head, int k) {
        int count = 1;
        Node current = head;

        while (current.next != null) {
            count++;
            current = current.next;
        }
        int size = count;

        current = head;
        count = 1;

        while (current.next != null) {
            if (size - count == k) {
                return current;
            }
            count++;
            current = current.next;
        }


        return null;
    }
}
