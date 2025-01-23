package com.csharma.java.concepts.mustdo;

import java.util.PriorityQueue;

public class KLargestElement {

    public static int findKthLargest(int[] nums, int k) {

        if (nums == null || nums.length == 0) return -1;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int a : nums) {
            maxHeap.add(a);
        }

        int j = k - 1;

        while (j > 0) {
            maxHeap.remove();
            j--;
        }

        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5,6,7,8,9};
        System.out.println(findKthLargest(arr, 2));
    }

}
