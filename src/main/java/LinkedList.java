/*
A node in a singly linked list should have two attributes:
 val and next. val is the value of the current node, and next is a pointer/reference to the next node.
 */

public class LinkedList {

    public Node firstNode;
    public int size;

    public LinkedList() {
        firstNode = new Node(0);
        size = 0;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtHead(5);
        linkedList.addAtTail(7);
        linkedList.addAtTail(7);
        linkedList.getNode(1);
    }

    /*get value of n-th index*/
    public int getNode(int index) {
        System.out.println(size);
        if (index > size || index < 0) {
            return -1;
        }
        Node cur = firstNode.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    /*adds a node to the starting of the list*/
    public void addAtHead(int val) {

        Node cur = new Node(val);
        cur.next = firstNode.next;
        firstNode.next = cur;
        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        Node cur = firstNode.next;


        for (int i = 0; i < size - 1; i++) {
            cur = cur.next;
        }
        cur.next = node;
        size = size + 1;
    }

    private class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
