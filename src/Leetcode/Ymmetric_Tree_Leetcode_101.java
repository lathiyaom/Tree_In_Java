package Leetcode;

import com.sun.source.tree.Tree;


public class Ymmetric_Tree_Leetcode_101
{
    public static void main(String[] args) {

    }

    public static boolean isSymmetric(TreeNode root) {
      return   dfs(root.left,root.right);
    }
    public static boolean dfs(TreeNode rootleft, TreeNode roootright)
    {
        if(roootright==null && rootleft==null)return  true;
        if(roootright==null)return false;
        if(rootleft==null)return false;
        if(rootleft.val!=roootright.val)return false;
        return dfs(rootleft.left,roootright.right) && dfs(rootleft.right,roootright.left);
    }
}
