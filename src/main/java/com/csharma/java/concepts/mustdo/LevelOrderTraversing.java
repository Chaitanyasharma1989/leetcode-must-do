package com.csharma.java.concepts.mustdo;

import com.csharma.java.concepts.common.TreeNode;

import java.util.*;

public class LevelOrderTraversing {

    public static List<List<Integer>> levelOrderTraversing(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<List<Integer>> answer = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> levelMapping = new ArrayList<>();
            for (int i = 0; i < queue.size(); ++i) {
                TreeNode treeNode = queue.poll();
                levelMapping.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }

                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }
            }
            answer.add(levelMapping);
        }
        return answer;
    }
}

