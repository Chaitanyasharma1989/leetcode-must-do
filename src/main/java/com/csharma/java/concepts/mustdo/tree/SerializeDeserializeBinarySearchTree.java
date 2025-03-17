package com.csharma.java.concepts.mustdo.tree;

import com.csharma.java.concepts.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserializeBinarySearchTree {

    public static String serialize(TreeNode treeNode) {
        if (treeNode == null) {
            return "";
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);

        StringBuilder stringBuilder = new StringBuilder();

        while (!queue.isEmpty()) {
            TreeNode rootNode = queue.poll();
            if (rootNode == null) {
                stringBuilder.append("#,");
            } else {
                stringBuilder.append(rootNode.val).append(",");
                queue.add(rootNode.left); // Need not check for null for left or right node as this is taken care by above null check
                queue.add(rootNode.right);
            }
        }
        return stringBuilder.toString();
    }

    public static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.println(root.val);
        inorderTraversal(root.right);
    }

    public static TreeNode deserialize(String data) {
        String[] treeData = data.split(",");

while()

        return null;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        inorderTraversal(root);

        String serialize = SerializeDeserializeBinarySearchTree.serialize(root);
        SerializeDeserializeBinarySearchTree.deserialize(serialize);
        System.out.println(serialize);
    }
}
