package com.csharma.java.concepts.mustdo.tree;

import com.csharma.java.concepts.common.TreeNode;

public class IdenticalTree {

    public static boolean isIdentical(TreeNode treeNode1, TreeNode treeNode2){

        if(treeNode1 == null && treeNode2 == null){
            return true;
        }

        if(treeNode1 == null || treeNode2 == null){
            return false;
        }

        return (treeNode1.val == treeNode2.val) &&
                isIdentical(treeNode1.right ,  treeNode2.right)
                && isIdentical(treeNode1.left ,treeNode2.left);

    }
}
