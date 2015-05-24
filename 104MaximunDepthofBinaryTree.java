// Given a binary tree, find its maximum depth.

// The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/****************** Solution 1 ******************/
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return Math.max(findMaxDepth(root.left),findMaxDepth(root.right)) + 1;
    }

    private int findMaxDepth(TreeNode node) {
    	if (node == null) return 0;
    	return Math.max(findMaxDepth(node.left),findMaxDepth(node.right)) + 1;
    }
}

/****************** Solution 2 ******************/
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}