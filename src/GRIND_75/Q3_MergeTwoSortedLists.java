package GRIND_75;

public class Q3_MergeTwoSortedLists {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        // constructors
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // create a temp and current pointer nodes
        ListNode temp_node = new ListNode(0);
        ListNode current_node = temp_node;

        // while both lists contain values
        while (list1 != null && list2 != null){ // O(n)
            // check if l1 values is smaller than l2 values
            if (list1.val < list2.val){
                // assign the current nodes next attribute to the l1 attribute
                current_node.next = list1;
                // move l1's value to the next node in the list
                list1 = list1.next;
            }
            else {
                // if l2 values was smaller
                current_node.next = list2;
                list2 = list2.next;
            }
            // assign the current node to point to the next node
            current_node = current_node.next;
        }

        // edge case if one list finished before the other
        if (list1 != null){
            current_node.next = list1;
            list1 = list1.next;
        }

        if (list2 != null){
            current_node.next = list2;
            list2 = list2.next;
        }

        // return the merged sorted list
        return temp_node.next;
    }


}
