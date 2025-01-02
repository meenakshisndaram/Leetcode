import java.util.HashSet;

class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1() {}
    ListNode1(int val) {
        this.val = val;
    }
    ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode1 addTwoNumbers(ListNode1 l1, ListNode1 l2) {
        ListNode1 dummyHead = new ListNode1(0);
        ListNode1 current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode1(sum % 10);
            current = current.next;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode1 l1 = new ListNode1(2);
        l1.next = new ListNode1(4);
        l1.next.next = new ListNode1(3);

        ListNode1 l2 = new ListNode1(5);
        l2.next = new ListNode1(6);
        l2.next.next = new ListNode1(4);

        Solution solution = new Solution();
        ListNode1 result = solution.addTwoNumbers(l1, l2);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
/*
* Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.*/


class Solution23 {
    public int lengthOfLongestSubstring(String s) {
        // Create a HashSet to store characters of the current window
        HashSet<Character> set = new HashSet<>();

        int left = 0, right = 0, maxLength = 0;
System.out.println(s.length());
        // Use the sliding window technique
        while (right < s.length()) {
            // If the character is not in the set, add it and move right pointer
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                maxLength = Math.max(maxLength, right - left);

            }
            // If character is in the set, remove the leftmost character and move left pointer
            else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}

 class Mainn {
     public static void main(String[] args) {
         Solution23 solution = new Solution23();

         // Example 1
         String input1 = "abcabcbb";
         System.out.println("Input: " + input1);
         System.out.println("Output: " + solution.lengthOfLongestSubstring(input1)); // Output: 3

         // Example 2
         String input2 = "bbbbb";
         System.out.println("Input: " + input2);
         System.out.println("Output: " + solution.lengthOfLongestSubstring(input2)); // Output: 1

         // Example 3
         String input3 = "pwwkew";
         System.out.println("Input: " + input3);
         System.out.println("Output: " + solution.lengthOfLongestSubstring(input3)); // Output: 3

     }
 }


class Solution9{
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Traverse both strings from right to left
        while (i >= 0 || j >= 0) {
            int sum = carry;

            // Add digit from a if available
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            // Add digit from b if available
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Compute the bit and carry
            result.append(sum % 2);  // Append current bit to the result
            carry = sum / 2;         // Compute carry for the next iteration
        }

        // If there's a remaining carry, append it
        if (carry != 0) {
            result.append(carry);
        }

        // Reverse the result since we were appending bits from the least significant to most significant
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Solution9 solution = new Solution9();

        // Example 1
        String a1 = "11";
        String b1 = "1";
        String output1 = solution.addBinary(a1, b1);
        System.out.println("Example 1 Output: " + output1);  // Output: 100

        // Example 2
        String a2 = "1010";
        String b2 = "1011";
        String output2 = solution.addBinary(a2, b2);
        System.out.println("Example 2 Output: " + output2);  // Output: 10101
    }
}
