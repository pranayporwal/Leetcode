/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        // ArrayDeque is faster than java.util.Stack
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            // 1. Go as far left as possible
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            
            // 2. Process the current root node
            curr = stack.pop();
            list.add(curr.val);
            
            // 3. Move to the right subtree
            curr = curr.right;
        }
        return list;
    }
}
