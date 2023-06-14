class Solution {
    
    List<Integer> inorderNodes = new ArrayList<>();
    
    void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        
        inorderTraversal(node.left);
       
        inorderNodes.add(node.val);
        inorderTraversal(node.right);
    }
    
    int getMinimumDifference(TreeNode root) {
       inorderTraversal(root);
        
        int minDifference = Integer.MAX_VALUE;
        
        for (int i = 1; i < inorderNodes.size(); i++) {
            minDifference = Math.min(minDifference, inorderNodes.get(i) - inorderNodes.get(i-1));
        }
        
        return minDifference;
    }
};