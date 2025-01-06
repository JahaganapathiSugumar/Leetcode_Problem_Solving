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
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        helper_preorder(root,res);
        return res;
    }

    public void helper_preorder(TreeNode root,List<Integer> res){
        if(root == null){
            return;
        }
        res.add(root.val);
        helper_preorder(root.left,res);
        helper_preorder(root.right,res);
    }
}