package linked.list;

import java.util.*;

public class DeleteDups {

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void run() {
        Node test = new Node(2);
        test.next = new Node(4);
        test.next.next = new Node(4);
        test.next.next.next = new Node(2);
        test.next.next.next.next = new Node(4);

        Node result = deleteDuplications(test);

        while (result.next != null) {
            System.out.println(result.data);
            result = result.next;
        }

        System.out.println(result.data);
    }

    public static Node deleteDuplications(Node head) {
        if (head == null) {
            return null;
        }
        Set<Integer> s = new HashSet<Integer>();

        Node current = head;
        s.add(head.data);

        while (current.next != null) {
            if (s.contains(current.next.data)) {
                //delete next node
                current.next = current.next.next;
            } else {
                s.add(current.next.data);
                current = current.next;
            }
        }

        return head;
    }
}
