/*
public class Solution {
    // Method to find the first occurrence of the needle in the haystack
    public int strStr(String haystack, String needle) {
        // If the needle is an empty string, return 0
        if (needle.isEmpty()) {
            return 0;
        }

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        // Loop through the haystack, limiting the range to prevent overflow
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            // Check if the substring from i to i+needleLength matches the needle
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i; // Return the first occurrence index
            }
        }

        // If no occurrence is found, return -1
        return -1;
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        int result1 = solution.strStr(haystack1, needle1);
        System.out.println("Example 1:");
        System.out.println("Input: haystack = \"" + haystack1 + "\", needle = \"" + needle1 + "\"");
        System.out.println("Output: " + result1);  // Expected Output: 0

        // Example 2
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        int result2 = solution.strStr(haystack2, needle2);
        System.out.println("Example 2:");
        System.out.println("Input: haystack = \"" + haystack2 + "\", needle = \"" + needle2 + "\"");
        System.out.println("Output: " + result2);  // Expected Output: -1
    }
}
*/
