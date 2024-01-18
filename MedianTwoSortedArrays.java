package LeetCode;

import java.util.Arrays;

public class MedianTwoSortedArrays {

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 3, 5, 7, 9, 11, 13}, new int[]{4, 6, 8, 10, 12, 14}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] newArr = new int[n + m];
        if (m == 0 && n == 0) {
            return 0.0;
        }
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                newArr[k++] = nums1[i++];
            } else {
                newArr[k++] = nums2[j++];
            }
        }
        while (i < n) {
            newArr[k++] = nums1[i++];
        }
        while (j < m) {
            newArr[k++] = nums2[j++];
        }

        // Calculate the median based on the total number of elements
        if ((n + m) % 2 == 0) {
            return (double) (newArr[(n + m) / 2] + newArr[((n + m) / 2) - 1]) / 2;
        } else {
            return newArr[(n + m) / 2];
        }
    }
}