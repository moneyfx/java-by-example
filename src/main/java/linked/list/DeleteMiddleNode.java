package linked.list;


public class DeleteMiddleNode {

    public static void delete(Node middleNode) {
        if (middleNode == null || middleNode.next == null) {
            return;
        }

        Node nextNode = middleNode.next;

        middleNode.data = nextNode.data;
        middleNode.next = nextNode.next;
    }
}
