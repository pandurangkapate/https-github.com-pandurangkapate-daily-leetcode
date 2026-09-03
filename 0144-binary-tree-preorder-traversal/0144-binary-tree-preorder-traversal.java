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

        List<Integer> integerList = new ArrayList<Integer>();

        preOrder(root, integerList);
        return integerList;
        
    }

    public void preOrder(TreeNode root, List<Integer> integerList){

        // pr order root -> left -> right 

        if(root == null){
            return;
        }

        integerList.add(root.val);
        preOrder(root.left, integerList);
        preOrder(root.right, integerList);
        
    }
}