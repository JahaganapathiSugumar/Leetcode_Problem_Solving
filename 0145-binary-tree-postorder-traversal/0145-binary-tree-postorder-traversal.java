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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        helper_postorder(root,res);
        return res;
    }

    public void helper_postorder(TreeNode root,List<Integer> res){
        if(root == null){
            return;
        }
        helper_postorder(root.left,res);
        helper_postorder(root.right,res);
        res.add(root.val);
    }
}