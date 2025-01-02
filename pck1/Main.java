package pck1;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

         while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }


        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();


        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        solution.merge(nums1, m, nums2, n);
             System.out.println("Merged Array: " + java.util.Arrays.toString(nums1));


        int[] nums1_2 = {1};
        int m_2 = 1;
        int[] nums2_2 = {};
        int n_2 = 0;
        solution.merge(nums1_2, m_2, nums2_2, n_2);
        System.out.println("Merged Array: " + java.util.Arrays.toString(nums1_2));
    }
}

class Rotate {
    public static void main(String[] args) {
        int[] x = { 2, 3, 4, 5, 6, 7, 8 };
        int firstElement = x[0];


        for (int i = 0; i < x.length - 1; i++) {
            x[i] = x[i + 1];
        }

      
        x[x.length - 1] = firstElement;

        // Output the rotated array
        System.out.println(Arrays.toString(x));
    }
}
