package INFO6205_MidTerm;

import java.util.Stack;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class PerimeterSolution {
    //Time Complexity : O(N)
    //Space Complexity : O(N)
    public void printPerimeter(TreeNode root) {
        if (root == null) {
            System.out.println("Tree is Empty!");
            return;
        }
        if (root.left != null || root.right != null) {
            System.out.print("[");
            System.out.print(root.val);
        }
        TreeNode tempNode = root.right;
        while (tempNode != null) {
            if (tempNode.left != null || tempNode.right != null) {
                System.out.print("," + tempNode.val);
            }
            if (tempNode.right != null) {
                tempNode = tempNode.right;
            } else {
                tempNode = tempNode.left;
            }
        }
        printLeaves(root);
        Stack<Integer> myStack = new Stack<>();
        tempNode = root.left;
        while (tempNode != null) {
            if (tempNode.left != null || tempNode.right != null) {
                myStack.push(tempNode.val);
            }
            if (tempNode.left != null) {
                tempNode = tempNode.left;
            } else {
                tempNode = tempNode.right;
            }
        }
        while (!myStack.isEmpty()) {
            System.out.print("," + myStack.pop());
        }
        System.out.print("]");
    }

    public void printLeaves(TreeNode root) {
        if (root != null && root.left == null && root.right == null) {
            System.out.print("," + root.val);
        } else {
            if (root != null && root.right != null) {
                printLeaves(root.right);
            }
            if (root != null && root.left != null) {
                printLeaves(root.left);
            }
        }
    }
}
