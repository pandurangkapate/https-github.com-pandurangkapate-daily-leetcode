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
        List<Integer> integerList = new ArrayList<>();
        postOrder(root, integerList);
        return integerList;
    }

    public void postOrder(TreeNode root, List<Integer> integerList){
        if(root == null){
            return;
        }
              postOrder(root.left, integerList);
              postOrder(root.right, integerList);
              integerList.add(root.val);
    }
}