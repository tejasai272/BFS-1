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
  
  //TC:O(n) SC: O(1)
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        
        if(root==null)return result;
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            while(s!=0){
                TreeNode node=q.poll();
                s--;
                tempResult.add(node.val);
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            
            }
            result.add(tempResult);
        }
        return result;
    }
}
