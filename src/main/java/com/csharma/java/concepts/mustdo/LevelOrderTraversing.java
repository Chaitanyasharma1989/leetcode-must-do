package com.csharma.java.concepts.mustdo;

import jdk.internal.ref.CleanerFactory;

import java.util.*;

public class LevelOrderTraversing {

    public static List<List<Integer>> levelOrderTraversing(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        Queue<TreeNode> queue = new ArrayDeque<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();

            if (treeNode.left != null) {
                queue.add(treeNode.left);
            }

            if (treeNode.right != null) {
                queue.add(treeNode.right);
            }
        }

    }

    public static void main(String[] args) {

    }
}

class TreeNode {
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

