package Leetcode;

public class Balanced_Binary_Tree_Leetcode_110 {
    public static void main(String[] args) {
    }
    public     boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        int lans = balancedornot(root.left);
        int rans = balancedornot(root.right);
        if (Math.abs(lans - rans) > 1) return false;
        System.out.println(rans);
        System.out.println(lans);
        return isBalanced(root.left)&&isBalanced(root.right);
    }

    private     int balancedornot(TreeNode root) {
        if(root==null)return 0;
        return  Math.max(balancedornot(root.left),balancedornot(root.right))+1;

    }
}
