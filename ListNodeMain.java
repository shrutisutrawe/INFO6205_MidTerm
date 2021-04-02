package INFO6205_MidTerm;

public class ListNodeMain {
    public static void main(String[] args) {
        Solution sl = new Solution();
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        node1.printList(node1);
//        ListNode node14 = new ListNode(7);
        ListNode node12 = new ListNode(6, node3);
        ListNode node11 = new ListNode(5, node12);
        node11.printList(node11);
        System.out.println("Are the two Lists converging : " + sl.areConverging(node1, node11));

    }
}
