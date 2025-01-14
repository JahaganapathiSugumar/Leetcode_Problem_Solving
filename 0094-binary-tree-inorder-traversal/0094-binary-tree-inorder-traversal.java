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
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        helper_inorder(root,res);
        return res;
    }

    public void helper_inorder(TreeNode root,List<Integer> res){

        if(root == null){
            return;
        }
        helper_inorder(root.left,res);
        res.add(root.val);
        helper_inorder(root.right,res);
    }
}