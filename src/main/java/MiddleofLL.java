/* Put every node into an array A in order. Then the middle node is just A[A.length // 2],
since we can retrieve each node by index.*/
public class MiddleofLL {

    /* When traversing the list with a pointer slow, make another pointer fast that traverses
   twice as fast. When fast reaches the end of the list, slow must be in the middle.*/
    public Node middleNode(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
