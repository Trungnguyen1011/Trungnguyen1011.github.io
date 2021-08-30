public class _104_Maximum_Depth_of_Binary_Tree {
    public static void main(String[] args) {
        TreeNode n9 = new TreeNode(9);
        TreeNode n15 = new TreeNode(15);
        TreeNode n7 = new TreeNode(7);
        TreeNode n20 = new TreeNode(20, n15, n7);
        TreeNode n3 = new TreeNode(3, n9, n20);
        System.out.println(Solution.maxDepth(n3));
        System.out.println("DEBUG");

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

   class Solution {
        public static int maxDepth(TreeNode root) {
            int max = 1;
            if (root == null) {
                return 0;
            }

            int x = maxDepth(root.left);
            int y = maxDepth(root.right);

            return max + Math.max(x, y);
        }
    }
}
