package INFO6205_MidTerm;

import java.util.HashSet;
import java.util.Set;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void printList(ListNode head) {
        ListNode tempNode = new ListNode();
        tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.val + "->");
            tempNode = tempNode.next;
        }
        System.out.println("NULL");
    }
}

class Solution {
    //Space complexity - O(n), where n is number of nodes in n1 list.
    //Time complexity - O(n), where n is maximum of (number of nodes in n1, number of nodes in n2)
    public boolean areConverging(ListNode n1, ListNode n2) {
        if (n1 == null || n2 == null) {
            return false;
        }
        Set<ListNode> mySet = new HashSet<>();
        ListNode tempNode1 = n1;
        ListNode tempNode2 = n2;
        while (tempNode1 != null) {
            mySet.add(tempNode1);
            tempNode1 = tempNode1.next;
        }
        while (tempNode2 != null) {
            if (mySet.contains(tempNode2)) {
                return true;
            }
            tempNode2 = tempNode2.next;
        }
        return false;
    }
}

