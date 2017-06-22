package com.fishercoder.solutions;

import com.fishercoder.common.classes.TreeNode;

/**104. Maximum Depth of Binary Tree
Given a binary tree, find its maximum depth.
 The maximum depth is the number of
 nodes along the longest path from the root node down to the farthest leaf node.
 */
public class _104 {
    
    //more verbose version
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int leftDepth = maxDepth(root.left)+1;
        int rightDepth = maxDepth(root.right)+1;
        return Math.max(1, Math.max(leftDepth, rightDepth));
    }
    
    //more concise version
    public int maxDepth_shorter_version(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
