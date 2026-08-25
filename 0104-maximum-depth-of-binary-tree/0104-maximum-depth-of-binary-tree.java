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
class Solution {
    public int maxDepth(TreeNode root) {
        Queue <TreeNode> st = new ArrayDeque<>();
        int depth =0;
        if(root == null) return depth;
        st.offer(root);
        while(!st.isEmpty()){
            depth++;
            int levelsize=st.size();
            for(int i =0;i<levelsize;i++){
                TreeNode curr = st.poll();
                if(curr.left != null) st.offer(curr.left);
                if(curr.right != null) st.offer(curr.right);
            }
        }return depth;
    }
}