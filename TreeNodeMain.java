package INFO6205_MidTerm;

public class TreeNodeMain {
    public static void main(String[] args) {
        PerimeterSolution sl = new PerimeterSolution();
        TreeNode node9 = new TreeNode(9, null, null);
        TreeNode node10 = new TreeNode(10, null, null);
        TreeNode node11 = new TreeNode(11, null, null);
        TreeNode node13 = new TreeNode(13, null, null);
        TreeNode node14 = new TreeNode(14, null, null);
        TreeNode node8 = new TreeNode(8, null, null);
        TreeNode node5 = new TreeNode(5, node10, node11);
        TreeNode node6 = new TreeNode(6, null, node13);
        TreeNode node4 = new TreeNode(4, node8, node9);
        TreeNode node7 = new TreeNode(7, node14, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(3, node6, node7);
        TreeNode node1 = new TreeNode(1, node2, node3);

        sl.printPerimeter(node1);

    }
}
