class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int depth = 1;
        
        while (q.isEmpty() == false) {
            int qSize = q.size();
            
            while (qSize > 0) {
                qSize--;
                
                TreeNode node = q.remove();
              
                if (node == null) {
                    continue;
                }
                
              
                if (node.left == null && node.right == null) {
                    return depth;
                }
                
                q.add(node.left);
                q.add(node.right);
            }
            depth++;
        }
        return -1;
    }
};