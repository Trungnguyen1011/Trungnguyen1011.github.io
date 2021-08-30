
public class _112_Path_Sum {
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n7 = new TreeNode(7);
        TreeNode n2 = new TreeNode(2);
        TreeNode n11 = new TreeNode(11, n7, n2);
        TreeNode n13 = new TreeNode(13);
        TreeNode nL4 = new TreeNode(4, null, n1);
        TreeNode n8 = new TreeNode(8, n13, nL4);
        TreeNode n4 = new TreeNode(4, n11, null);
        TreeNode n5 = new TreeNode(5, n4, n8);
        boolean result = Solution.hasPathSum(n5, 22);
        System.out.println(result);
        System.out.println("DEBUG");
    }

    public static class TreeNode {

        int value;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.value = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.value = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        static int result;
        static boolean hasPathSum = false;

        public static boolean hasPathSum(TreeNode root, int targetSum) {
            getSum(root, targetSum, 0);
            return hasPathSum;
        }

        public static void getSum(TreeNode root, int targetSum, int prevSum) {
            
            if (root == null || hasPathSum == true) {
                return;
            }
            int tempSum = prevSum + root.value;
            if (root.left == null && root.right == null) {
                if (tempSum == targetSum) {
                    hasPathSum = true;
                } 
            }
            getSum(root.left, targetSum, tempSum);
            getSum(root.right, targetSum, tempSum);

        }
    }
}
