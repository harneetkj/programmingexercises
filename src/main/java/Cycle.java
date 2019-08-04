/*Given a linked list, determine if it has a cycle in it.*/

import java.util.HashSet;
import java.util.Set;

/*We go through each node one by one and record each node's reference in a hash table.
If the current node is null, we have reached the end of the list and it must not be cyclic.
If current node's reference is in the hash table, then return true.

 */
public class Cycle {
    public boolean hasCycle(Node head) {
        Set<Node> nodesSeen = new HashSet();
        while (head != null) {
            if (nodesSeen.contains(head)) {
                return true;
            } else {
                nodesSeen.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
