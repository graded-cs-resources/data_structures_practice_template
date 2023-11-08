package LList;
/**
 * Define a basic linked list
 */
public class LList {
    ListNode head = null;

    
    public void add(int item) {
        
    }

    /**
     * Insert the given item and the specified index
     */
    public void insert(int index, int item) {

    }

    /**
     * remove the item at index
     */
    public void remove(int index) {

    }

    /**
     * Returns a string view of the list
     */
    public String toString() {
        String output = "{";
        ListNode current = head;
        while (current != null) {
            output += current.value + " ";
            current = current.next;
        }
        output += "}";
        return output;
    }


}

/**
 * Define a node object for use in the LList class.
 * Since it is not labeled public, only LList will be able to use it.
 */
class ListNode {
    int value = 0;
    ListNode next = null;
    
    public ListNode(int val) {
        value = val;
    }
}
