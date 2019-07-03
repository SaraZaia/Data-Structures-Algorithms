/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int solution = 0;
    
    public int rangeSumBST(TreeNode root, int L, int R) {
        
        
        if ( ( root.val < R || root.val == R) && (root.val > L || root.val == L))
        {
            solution = solution + root.val;            
        }
        
        if ( root.right!= null && (root.val < R || root.val == R))
            rangeSumBST(root.right,L ,R );
        
        if ( root.left!= null && (root.val > L  || root.val == L))
            rangeSumBST(root.left,L ,R );
        
        
        return solution;
        
    }
}