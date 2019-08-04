/*
Finding the length of linked list using the iteration method.
 */

public class Length_LinkedList {


    public Node firstnode;
    public int size;

    public Length_LinkedList() {
        firstnode = new Node(0);
        size = 0;
    }

    public static void main(String[] args) {
        Length_LinkedList length = new Length_LinkedList();
        length.addAtHead(5);
        length.addAtHead(7);
        length.addAtHead(3);
        int count = length.length();
        System.out.println("length is " + count);
    }

    public void addAtHead(int val) {

        Node cur = new Node(val);
        cur.next = firstnode.next;
        firstnode.next = cur;
        size++;
    }


    public int length() {
        int count = 0;
        Node cur = firstnode.next;
        for (int i = 0; i < size; i++) {
            count = count + 1;
        }
        return count;
    }

    public class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }


    }
}
