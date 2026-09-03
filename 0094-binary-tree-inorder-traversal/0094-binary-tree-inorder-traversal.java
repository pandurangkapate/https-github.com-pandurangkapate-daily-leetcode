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

          List<Integer> integerList = new ArrayList<Integer>();

        // binary tree inorder traversal
         inOrder(root, integerList);
         return integerList;
        
    }

    public void inOrder(TreeNode root, List<Integer> integerList) {
        // inorder left root right 

        if(root == null){
            return;
        }

        inOrder(root.left, integerList);
        integerList.add(root.val);
        inOrder(root.right, integerList);
    }
}