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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        if(root == null){
            return new ArrayList<>();
        }
        boolean zigzag = true;
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            for(int j = 0;j<size;j++){
                TreeNode temp = q.poll();

                l.add(temp.val);

                if(temp.left != null){
                    q.offer(temp.left);
                }

                if(temp.right != null){
                    q.offer(temp.right);
                }
            }

            if(zigzag == false){
                Collections.reverse(l);
            }
            zigzag  = !zigzag;
            res.add(l);
        }
        return res;
    }
}